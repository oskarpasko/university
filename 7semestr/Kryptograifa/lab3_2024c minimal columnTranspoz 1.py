from sys import exit as sys_exit
import random
import time
from ngram import Ngram_score
from multiprocessing import cpu_count as mp_cpu_count
from multiprocessing import Pool as mp_pool
import math

alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
ns = Ngram_score("english_bigrams.txt")

def generateKey( lenk):
    return random.sample( list(range(lenk)), lenk )
def column( matrix, i, numLongerColumns):
    lenCol = len(matrix) if i < numLongerColumns else len(matrix)-1
    return ''.join( [ matrix[j][i] for j in range( lenCol )] )
def encrypt( M, key): # key is a list of positions, like `key=[2,0,3,1]`
    lenk = len(key)
    matrixHeight= len(M)//lenk if len(M)%lenk==0 else len(M)//lenk + 1
    numLongerColumns = lenk if len(M) % lenk==0 else len(M)%(matrixHeight-1)
    matrix = [ M[ lenk*i : lenk*(i+1)] for i in range( matrixHeight) ]
    #print()
    #for row in matrix:
    #    print( row )
    C = ''
    for columnNumber in key:
        C += column( matrix, columnNumber, numLongerColumns)
    return C
def decrypt( C, key):
    lenk = len(key)
    matrixHeight= len(C)// lenk if len(C)%lenk==0 else len(C)// lenk + 1
    numLongerColumns = lenk if len(C)%lenk==0 else len(C)%(matrixHeight-1)
    lenColumns = { i: matrixHeight if i<numLongerColumns else matrixHeight-1 for i in range(lenk) }
    matrix = [ ['']*lenk for i in range(matrixHeight) ]
    columns, currPos = {},0
    for columnNumber in key:
        columns[ columnNumber] = C[ currPos : currPos + lenColumns[ columnNumber] ]
        currPos += lenColumns[ columnNumber]
    for columnNumber in range(lenk):
        for il,letter in enumerate( columns[ columnNumber]):
            matrix[ il][ columnNumber] = letter
    M = ''.join([ ''.join(matrix[i]) for i in range(len(matrix)) ])
    #for row in matrix:
    #    print( ''.join(row))
    return M

def swap2(key):
    r1, r2 = sorted (random.sample (list (range (len (key))), 2))
    return key[: r1] + [key[r2]] + key[r1 + 1 : r2] + [key[r1]] + key[r2 + 1 :]
    #return generateKey( lenk)   # Monte-Carlo BruteForce
# inverseKey, shiftKey, swap3, inverseFragmentKey, shiftFragmentKey
def inverseKey(key):
    return key[::-1]
def shiftKey(key):
    r = random.randint( 0, len(key)-1)
    return key[r:] + key[:r]
def swap3(key):
    r1, r2, r3 = sorted (random.sample (list (range (len (key))), 3))
    if random.random() < 0.5:
        return key[: r1] + [key[r3]] + key[r1 + 1 : r2] + [key[r1]] \
               + key[r2 + 1 : r3] + [key[r2]] + key[r3 + 1 :]
    else:
        return key[: r1] + [key[r2]] + key[r1 + 1 : r2] + [key[r3]] \
               + key[r2 + 1 : r3] + [key[r1]] + key[r3 + 1 :]
def inverseFragmKey(key):
    r1, r2 = sorted (random.sample (list (range (len (key))), 2))
    while r2-r1 < 3 or r2-r1 > 7:
        r1, r2 = sorted (random.sample (list (range (len (key))), 2))
    return key[:r1] + inverseKey( key[r1:r2] ) + key[r2:]
def shiftFragmKey(key):
    r1, r2 = sorted (random.sample (list (range (len (key))), 2))
    while r2-r1 < 3 or r2-r1 > 7:
        r1, r2 = sorted (random.sample (list (range (len (key))), 2))
    return key[:r1] + shiftKey( key[r1:r2] ) + key[r2:]

def changeKeyFull(key):
    r = random.random()
    r_probs = [ 0.8, 0.005, 0.015, 0.04, 0.04, 0.1]
    if r < sum(r_probs[:1]):
        return swap2(key) #, 'swap2'
    elif r < sum(r_probs[:2]):
        return inverseKey(key) #, 'inverseKey'
    elif r < sum(r_probs[:3]):
        return shiftKey(key) #, 'shiftKey'
    elif r < sum(r_probs[:4]):
        return inverseFragmKey(key) #, 'inverseFragmKey'
    elif r <  sum(r_probs[:5]):
        return shiftFragmKey(key) #, 'shiftFragmKey'
    else:
        return swap3(key) #, 'swap3'
    
def changeKey(key):
    return changeKeyFull(key)
    
def HillClimbing(ct, lenk, timelimit = 30, spam= False):
    # można ją zrobić mniej sztywną, restartując z nowego losowego klucza
    # co jakiś czas lub co jakąś ilość iteracji lub po kilku tysięcach nieudanych prób ulepszenia
    keyOld = generateKey( lenk)
    scoreOld = ns.score (decrypt (ct, keyOld))
    t1 = time.time ()
    if spam:        print (' wspinanie się')
    while time.time () - t1 < timelimit :
        keyNew = changeKey (keyOld)
        scoreNew = ns.score (decrypt (ct, keyNew))
        if scoreNew > scoreOld :
            keyOld = keyNew
            scoreOld = scoreNew
            if spam:        print ( f' scoreOld = {scoreOld}') #,\t msg')
    return[scoreOld, keyOld, decrypt (ct, keyOld)]
def SGHC( ct, lenk, wait = 1, timelimit = 10, spam = False):
    wyniki = []
    t1 = time.time()        # from time import time as tm; t1 = tm()
    if spam:        print('SGHC')
    while  time.time() - t1 < timelimit:    # funkcja szuka klucza góra 'timelimit' sekund
        [scoreOld, keyOld, encrypted] = HillClimbing(ct, lenk, timelimit = wait)
        if spam:
            print([scoreOld, encrypt(ct, keyOld), keyOld])
        wyniki.append( [scoreOld, keyOld, encrypted] )
    wyniki.sort()
    wyniki.reverse()
    print()
    return wyniki

def SGHC_MP_min( ct, lenk, wait = 1, spam = False):
    t1 = time.time()        # from time import time as tm; t1 = tm()
    if spam:        print('SGHC_MP minimal')
    ncore = mp_cpu_count()
    with mp_pool() as pool:
        chunks = 10*(ncore-1)
        iterable = [ [ct, lenk, wait] for i in range(chunks) ]
        results = pool.starmap( HillClimbing, iterable, chunksize= 10 )
    results.sort()
    results.reverse()
    t2 = time.time()
    print( f'SGHC_MP evaluated in {round(t2-t1,2)} sec and used {chunks} threads')
    return results

def SGHC_MP_timelimit( ct, lenk, wait = 1, timelimit = 10, spam = False):
    t1 = time.time()        # from time import time as tm; t1 = tm()
    if spam:        print('SGHC_MP with timelimit')
    ncore = mp_cpu_count()
    printedValue, wyniki, uzyte_watki = -9e99, [], 0
    while  time.time() - t1 < timelimit:    # funkcja szuka klucza góra 'timelimit' sekund
        #def genParams( params, n_chunks):
        #    for i in range(n_chunks):
        #        yield params
        with mp_pool() as pool:
            n_chunks = 10*(ncore-1)
            #iterable = genParams( [ct, lenk, wait], n_chunks)
            iterable = [ [ct, lenk, wait] for i in range(n_chunks) ]
            results = pool.starmap( HillClimbing, iterable, chunksize= 10 )
            uzyte_watki += n_chunks
        wyniki = wyniki + results
        wyniki.sort()
        wyniki.reverse()
        if wyniki[0][0] > printedValue:
            if spam:        print( wyniki[0][0], end='\t')
            printedValue = wyniki[0][0]
        else:
            if spam:        print( '<', end=' ')
    t2 = time.time()
    print( f'\nSGHC_MP evaluated in {round(t2-t1,2)} sec and used {uzyte_watki} threads')
    return wyniki

if __name__ == '__main__':
    text = " Data Repository is free-to-use and open access. It enables you to deposit any research data (including raw and processed data, video, code, software, algorithms, protocols, and methods) associated with your research manuscript. Your datasets will also be searchable on Mendeley Data Search, which includes nearly 11 million indexed datasets. For more information, visit ."
    text = ''.join([ c for c in text.upper() if c in alfabet ])[:299]
    key0 = generateKey(16)
    lenk = len(key0)
    print( 'Preprocessed Text:\n', text)
    ct = encrypt( text, key0)
    print( 'Cryptotext: \n', ct)
    tj = decrypt( ct, key0)
    print( 'Decrypted: \n', tj)
    #sys_exit()

    #solution = HillClimbing( ct, lenk, timelimit=60, spam=True)
    #print( solution )
    #sys_exit()

    #solutions = SGHC( ct, lenk, wait=0.6, timelimit=30, spam=True)
    #print( solutions[0] )
    #sys_exit()

    #solutions = SGHC_MP_min( ct, lenk, spam=True)
    #print( solutions[0] )
    #sys_exit()

    #solutions = SGHC_MP_timelimit( ct, lenk, wait=0.6, timelimit=5, spam=True)
    #print( solutions[0] )
    #sys_exit()

    solution = SGSA_MP_timelimit( ct, lenk, -0.005, timelimit = 15)
    print( solution[:3])
    print( key0)
    #sys_exit()    
    '''
    # wyznaczenie długości klucza dla kolumnowej transpozycji
    lensKeys = []
    for lenk2 in range(5,21):
        results = SGHC_MP_timelimit( ct, lenk2, wait = 0.5, timelimit = 5)
        best = results[0][0]
        # mean = sum([x[0] for x in results])/len(results)
        print( f'lenk={lenk2}, '\
               +f'min( len(C)%lenk2, abs(lenk2-len(C)%lenk2))={min( len(ct)%lenk2, abs(lenk2-len(ct)%lenk2))}'\
               +f', best={best}' )   #, mean={mean}' )
        lensKeys.append( [lenk2, min( len(ct)%lenk2, lenk2-len(ct)%lenk2), best] )
    lensKeys.sort( key = lambda x: x[2], reverse= True )
    print( 'best 10 length by max-criterion:')
    [ print( lensKeys[i]) for i in range(10) ]
    '''
    
