#
# Oskar Paśko
# Nr albumu: 117 987
# Data: 6-05-2023
# Metody Numeryczne - kolokwium
#

import matplotlib.pyplot as plt
import numpy as np
from sympy import *
from scipy.interpolate import lagrange

def _wartoscFunkcji(wspol, x):
    value = 0
    for i in range(len(wspol)-1, -1, -1):
        value += pow(x, i)*wspol[i]
    return value

def zadanie1():
    print("\n---------- Zadanie 1 ----------\n")
    x1 = np.linspace(0, 4, 4)
    y1 = [1, 3, 2, 5]
    F = lagrange(x1, y1)

    print(f'{F}')

def zadanie2():
    print("\n---------- Zadanie 2 ----------\n")

    max_iteracji = 100

    n = int(input("Podaj stopień wielomianu: "))
    wspolczynniki = [0] * (n+1)

    for x in range(len(wspolczynniki)-1, -1, -1):
        print(f"x^({x}): ", end=" ")
        wspolczynniki[x] = float(input(""))

    a = 0
    b = 1
    e = 0.00001

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
            print(f'Ilość iteracji: {iteracje}')
            print(f'Wynik: {round(x2, 2)}')
            return
        
        x0 = x1
        fx0 = fx1
        x1 = x2
        fx1 = fx2
        iteracje+=1

def zadanie3():
    print("\n---------- Zadanie 3 ----------\n")

    x = symbols('x')
    f = exp(x**2)
    d_first = f.diff(x)
    d_second = d_first.diff(x)
    d_third = d_second.diff(x)
    d_fourth = d_third.diff(x)

    a = 0
    b = 1

    if(a>b): max = a
    else: max = b

    fa = f.evalf(subs={x:a})
    fb = f.evalf(subs={x:b})
    c = (a+b)/2
    f4 = d_fourth.evalf(subs={x:max})

    s = ((b-a)/6) * (fa+fb + 4 * c)
    b = (1/90) * (pow((b-a), 5) * f4)

    print(f"S = {round(s, 2)}")
    print(f"B = {round(b, 2)}")

def zadanie4():
    print("\n---------- Zadanie 4 ----------\n")

    n = int(input("Podaj stopień wielomianu: "))+1
    x_zero = float(input("Podaj miejsce zerowe: "))
    temp = [0] * n
    result = [0] * n
    wsp = [0] * n

    for x in range(0, n):
        number = float(input("Podaj współczynnik: "))
        wsp[x] = number
        if(x==0):
            result[0] = x_zero * number
        if(x>0):
            temp[x] = result[x-1] * x_zero
            result[x] = temp[x] + number

    print(f"W(x0)= {result[n-1]}")

    print("W(x)/x-1 = ", end="")
    check = n-1
    for x in range(0, n):
        check-=1
        if(check>1):
            print(f"{result[x]}x^{check} +", end=" ")
        elif(check==0):
            print(f"1 +", end=" ")
        elif(check==1):
            print(f"{result[x]} +", end=" ")
        elif(check<1):
            print(f"{result[x]}/x-1", end=" ")

zadanie1()
zadanie2()
zadanie3()
zadanie4()
