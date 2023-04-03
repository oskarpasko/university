# ========== Liczenie pochodnych ========== #
from sympy import *

x = Symbol('x')
f = (x+1)*(x-1)**4
f_prime = f.diff(x)
f_prime_prime = f_prime.diff(x)

print(f)
print(f_prime)
print(f_prime_prime)
print(f.evalf(subs={x:3}))
print(f_prime.evalf(subs={x:3}))
# ========== Koniec Pochodnych ========== #