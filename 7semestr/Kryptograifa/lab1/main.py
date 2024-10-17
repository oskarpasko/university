import re
import ngram

# funkcja szyfrowania cezara z przesunięciem o 3 w prawo

alfabhet = 'ABCDEFGHIJKLMNOPRSTUWXYZ'
def encrypt_ceasar(text, shift=3, alf=alfabhet):
    result = ''
    for char in text.upper():
        if char in alf:
            idx = alf.index(char)
            new_idx = (idx + shift) % len(alf)
            result += alf[new_idx]
        else:
            result += char
    return result


# funkcja deszyfrująca
def decrypt_ceasar(text, shift=3, alf=alfabhet):
    result = ''
    for char in text.upper():
        if char in alf:
            idx = alf.index(char)
            new_idx = (idx - shift) % len(alf)
            result += alf[new_idx]
        else:
            result += char
    return result


def format_text(text):
    sentences = re.split(r'(?<=[.!?]) +', text.strip())
    formatted_sentences = [sentence.capitalize() for sentence in sentences]
    formatted_text = ' '.join(formatted_sentences)
    return formatted_text

# tekst do szyfrowania

text = '''
Konnichiwa! Watashi wa nihon ni kyoumi ga arimasu. 
Nihongo wa muzukashii desu ga, mainichi benkyou suru no wa totemo tanoshii desu. 
Nihon no rekishi to dentou niwa fukai imi ga aru to omoimasu. 
Soshite, nihon no eiga to anime mo daisuki desu. 
Nihon ni ittara, Kyoto ya Tokyo no yumeina basho ni ikitai desu. 
Sorekara, nihon ryouri o tabete mitai, 
tokuni sushi to ramen wa zettai ni tameshitai desu. 
Nihonjin wa totemo shinsetsu da to kiita node, soko de takusan 
no tomodachi o tsukuritai desu. Anata wa nihon ni ikitai to omoimasu ka?

'''

processed_text = re.sub(r'[^A-Za-z]', '', text).upper()

temp = encrypt_ceasar(processed_text)

# tekst oryginalny
print(text)

# tekst po
print(temp)

print()

print(decrypt_ceasar(temp))

def solve(crypto_text):
    for shift in range(25):
        print(f"{shift}\t{encrypt_ceasar(crypto_text, shift)[:30]}")

def solve2(crypto_text, Scorer):
    best_score, result = -999999, ''
    for shift in range(25):
        decryptedText = decrypt_ceasar(crypto_text, shift)
        sc = Scorer.score(decryptedText)
        if sc > best_score:
            best_score, result = sc, decryptedText
            print(best_score, result[:30], shift)
    return best_score, result

with open('cos.txt', 'r', encoding='utf-8') as file:
    zawartosc = file.read()
Scorer = ngram.ngram_score(zawartosc, sep=' ')

print(f"Rozwiązany teskst: {solve2(text, Scorer)}")

#solve(text)