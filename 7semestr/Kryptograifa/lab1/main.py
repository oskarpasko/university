import re

# funkcja szyfrowania cezara z przesunięciem o 3 w prawo

alfabhet = 'ABCDEFGHIJKLMNOPRSTUWXYZ'
def encrypt_ceasar(text, shift=3):
    alf = 'ABCDEFGHIJKLMNOPRSTUWXYZ'
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
def decrypt_ceasar(text, shift=3):
    alf = 'ABCDEFGHIJKLMNOPRSTUWXYZ'
    result = ''
    for char in text.upper():
        if char in alf:
            idx = alf.index(char)
            new_idx = (idx - shift) % len(alf)
            result += alf[new_idx]
        else:
            result += char
    return result

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

print(temp)

print()

print(decrypt_ceasar(temp))