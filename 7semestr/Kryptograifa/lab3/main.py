import random

alf = 'abcdefghijklmnopqrstuvwxyz'
key2 = ''.join(random.sample(alf, len(alf)))

print("Alphabet:", alf)
print("Key:", key2)

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

def decrypt(ct, klucz, alf):
    reverse_slownik = {klucz[i]: c for i, c in enumerate(alf)}
    decrypted_text = ''
    for c in ct:
        c_lower = c.lower()
        if c_lower in reverse_slownik:
            decrypted_text += reverse_slownik[c_lower]
        else:
            decrypted_text += c
    return decrypted_text

text_to_encrypt = 'Jakis tam tekst'
encrypted_text = encrypt(text_to_encrypt, key2, alf)
print("Encrypted:", encrypted_text)

decrypted_text = decrypt(encrypted_text, key2, alf)
print("Decrypted:", decrypted_text)
