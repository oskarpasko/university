from sympy import *

def trapez_prosty():
    x = symbols('x') # symbole
    f = x**2 # wzor funkcji
    d_first = f.diff(x) # 1. pochodna
    d_second = d_first.diff(x) # 2. pochodna

    a = -1
    b = 1

    if(a>b): max = a
    else: max = b

    fa = f.evalf(subs={x:a})
    fb = f.evalf(subs={x:b})
    f2 = d_second.evalf(subs={x:max})

    s = ((b-a)/2) * (fa+fb)
    b = (1/12)*pow((b-a), 3) * f2

    print(f"S = {s}")
    print(f"B = {b}")

def trapez_zlozony():
    x = symbols('x') # symbole
    f = x**2 # wzor funkcji
    d_first = f.diff(x) # 1. pochodna
    d_second = d_first.diff(x) # 2. pochodna

    a = -1
    b = 1
    n = 5

    h = (b-a)/n

    if(a>b): max = a
    else: max = b

    fa = f.evalf(subs={x:a})
    fb = f.evalf(subs={x:b})
    f2 = d_second.evalf(subs={x:max})
    suma=0

    for k in range(1, (n-1)):
        suma += f.evalf(subs={x:k})

    funkcja = h * (((fa+fb)/2) + suma)
    R = -1 * (((b-a)*pow(h, 2))/12) * f2

    print(f"Funkcja = {funkcja}")
    print(f"R = {R}")

trapez_zlozony()