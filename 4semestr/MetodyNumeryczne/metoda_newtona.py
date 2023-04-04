# ========== Liczenie pochodnych ========== #
#from sympy import *

#x = Symbol('x')
#f = (x+1)*(x-1)**4
#f_prime = f.diff(x)
#f_prime_prime = f_prime.diff(x)

#print(f)
#print(f_prime)
#print(f_prime_prime)
#print(f.evalf(subs={x:3}))
#print(f_prime.evalf(subs={x:3}))
# ========== Koniec Pochodnych ========== #

from sympy import *

x = symbols('x') # symbole
f = (x+1)*(x-1)**4 # wzor funkcji
d_first = f.diff(x) # 1. pochodna
d_second = d_first.diff(x) # 2. pochodna

a = float(input('Podaj a: '))
b = float(input('Podaj b: '))

print(d_first)
print(d_second)

fa = f.evalf(subs={x:a})
fb = f.evalf(subs={x:b})

if((fa * fb) < 0):
    tab = [0] * 10
    tab[0] = float(input('Podaj x0: '))

    for n in range(1, 9):
        fx = f.evalf(subs={x:tab[n-1]})
        fxp = d_first.evalf(subs={x:tab[n-1]})
        tab[n] = round((tab[n-1] - (fx/fxp)), 2)

else: print('f(a) * f(b) > 0')

print(tab)
