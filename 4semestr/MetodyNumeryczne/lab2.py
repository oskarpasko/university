def _wartoscFunkcji(wspol, x):
    value = 0
    for i in range(len(wspol)-1, -1, -1):
        value += pow(x, i)*wspol[i]
    return value

def _pochodna(wspol, x):
    value = 0
    for i in range(0, len(wspol-1)):
        value += (len(wspol)-1 - i) * wspol[i] * pow(x, len(wspol) - 1 - i - 1)
    return value

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
    iterations = 0

    while(abs(a-b)>e):     
        iterations+=1
        pivot = (a+b)/2
        if(_wartoscFunkcji(wspolczynniki, pivot)==0):
            print(f"Wynik = {pivot}")
            print(f"Ilość iteracji = {iterations}") 
            break
        elif(_wartoscFunkcji(wspolczynniki, pivot) * _wartoscFunkcji(wspolczynniki, a) < 0):
            b = pivot
        else: a = pivot  
    print(f"Wynik = {pivot}")
    print(f"Ilość iteracji = {iterations}") 

def _styczne():
    max_iteracji = 100

    n = int(input("Podaj stopień wielomianu: "))
    wspolczynniki = [0] * (n+1)

    for x in range(len(wspolczynniki)-1, -1, -1):
        print(f"x^({x}): ", end=" ")
        wspolczynniki[x] = float(input(""))

    a = float(input("Podaj a: "))
    b = float(input("Podaj b: "))
    e = float(input("Podaj dokładność: "))

    x0 = a
    x1 = b

    fx0 = _wartoscFunkcji(wspolczynniki, x0)
    fx1 = _wartoscFunkcji(wspolczynniki, x1)
    x2 = 0

    iteracje = 1

    while(iteracje <= max_iteracji):
        dfdx = (fx1 - fx0) / (x1 - x0)
        x2 = x1 - fx1 / dfdx
        fx2 = _wartoscFunkcji(wspolczynniki, x2)

        if(abs(fx2) < e):
            print(iteracje)
            print(x2)
            return
        
        x0 = x1
        fx0 = fx1
        x1 = x2
        fx1 = fx2
        iteracje+=1


# _bisekcja()
_styczne()
