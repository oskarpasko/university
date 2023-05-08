from sympy import *

def simp_prosty():
    x = symbols('x') # symbole
    f = x**2 # wzor funkcji
    d_first = f.diff(x) # 1. pochodna
    d_second = d_first.diff(x) # 2. pochodna
    d_third = d_second.diff(x) # 3. pochodna
    d_fourth = d_third.diff(x) # 4. pochodna

    a = -1
    b = 1

    if(a>b): max = a
    else: max = b

    fa = f.evalf(subs={x:a})
    fb = f.evalf(subs={x:b})
    c = (a+b)/2
    fc = f.evalf(subs={x:c})
    f4 = d_fourth.evalf(subs={x:max})

    s = ((b-a)/6) * (fa+fb + 4 * c)
    b = (1/90) * (pow((b-a), 5) * f4)

    print(f"S = {s}")
    print(f"B = {b}")

def simp_zlozony():
    x = symbols('x') # symbole
    f = x**2 # wzor funkcji
    d_first = f.diff(x) # 1. pochodna
    d_second = d_first.diff(x) # 2. pochodna
    d_third = d_second.diff(x) # 3. pochodna
    d_fourth = d_third.diff(x) # 4. pochodna

    a = -1
    b = 1
    n = 5

    if(a>b): max = a
    else: max = b

    fa = f.evalf(subs={x:a})
    fb = f.evalf(subs={x:b})
    c = (a+b)/2
    fc = f.evalf(subs={x:c})
    f4 = d_fourth.evalf(subs={x:max})

    s = ((b-a)/6) * (fa+fb + 4 * c)
    b = (1/90) * (pow((b-a), 5) * f4)

    print(f"S = {s}")
    print(f"B = {b}")
