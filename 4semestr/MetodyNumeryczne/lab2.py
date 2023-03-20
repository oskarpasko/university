def _bisekcja():
    n = int(input("Podaj stopień wielomianu: "))
    wspolczynniki = [0] * (n+1)

    for x in range(len(wspolczynniki)-1, -1, -1):
        print(f"x^({x}): ", end=" ")
        wspolczynniki[x] = float(input(""))

    a = float(input("Podaj a: "))
    b = float(input("Podaj b: "))
    e = float(input("Podaj dokładność: "))

    pivot = 0

    while(abs(a-b)>e):     
        pivot = (a+b)/2
        if(_wartoscFunkcji(wspolczynniki, pivot)==0):
            print(f"Wynik = {pivot}")
            break
        elif(_wartoscFunkcji(wspolczynniki, pivot) * _wartoscFunkcji(wspolczynniki, a) < 0):
            b = pivot
        else: a = pivot  
    print(f"Wynik = {pivot}") 

def _wartoscFunkcji(wspol, x):
    value = 0
    for i in range(len(wspol)-1, -1, -1):
        value += pow(x, i)*wspol[i]
    return value

_bisekcja()
