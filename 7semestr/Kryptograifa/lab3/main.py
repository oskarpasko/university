import random

alf = 'abcdefghijklmnopqrstuvwxyz'
key2 = ''.join(random.sample(alf, len(alf)))

print(alf, len(alf))
print(key2)

def encrypt(tj, klucz, alf):
    slownik = {c: klucz[i] for i, c in enumerate(alf)}
    ct = ''
    for c in tj:
        c_lower = c.lower()
        if c_lower in slownik:
            ct += slownik[c_lower] 
        else:
            ct += c
    return ct

encrypted_text = encrypt('Jakis tam tekst', key2, alf)
print(encrypted_text)
