from sympy import *

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