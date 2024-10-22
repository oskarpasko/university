import random
from time import time as tm

# Generate the alphabet and a random key
alf = 'abcdefghijklmnopqrstuvwxyz'.lower()
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

# Example text to encrypt and decrypt
text_to_encrypt = 'Jakis tam tekst'
encrypted_text = encrypt(text_to_encrypt, key2, alf)
print("Encrypted:", encrypted_text)

decrypted_text = decrypt(encrypted_text, key2, alf)
print("Decrypted:", decrypted_text)

def random_key(stala=0):
    return ''.join(list(alf[:stala])) + ''.join(random.sample(alf[stala:], len(alf[stala:])))
    
for i in range(5):
    klucz00 = random_key(17)
    print(klucz00)

def attack(stala=17):
    temp = random_key(stala)
    ct = encrypt(decrypted_text, temp, alf)  # Include 'alf' as the third argument
    return ct

# Measure the time taken for the attack
t0 = tm()
ct = attack()  # Call the attack function
t1 = tm()

print(f'Encrypted text during attack: {ct}')
print(f'Time taken for the attack: {t1-t0:.6f} s')
