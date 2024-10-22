from math import log10

class NgramScore:
    def __init__(self, ngramfile, sep=' '):
        ''' Load a file containing n-grams and counts, calculate log probabilities. '''
        self.ngrams = {}
        
        # Use 'with' to ensure the file is properly closed after reading.
        with open(ngramfile, 'r', encoding='utf-8') as f:
            for line in f:
                key, count = line.split(sep)
                self.ngrams[key] = int(count)
        
        self.L = len(next(iter(self.ngrams.keys())))  # Get length of the first key
        self.N = sum(self.ngrams.values())  # Use .values() for Python 3 compatibility
        
        # Calculate log probabilities
        for key in self.ngrams:
            self.ngrams[key] = log10(float(self.ngrams[key]) / self.N)
        
        self.floor = log10(0.01 / self.N)  # Probability floor

    def score(self, text):
        ''' Compute the score of the text. '''
        score = 0
        ngrams = self.ngrams.get  # Use get for slightly faster access
        
        # Iterate through the text to compute scores
        for i in range(len(text) - self.L + 1):
            ngram = text[i:i + self.L]
            score += ngrams(ngram, self.floor)  # Use floor if ngram not found
        
        return score
