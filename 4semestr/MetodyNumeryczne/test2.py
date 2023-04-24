from sympy import *
import numpy as np
import math
myfunction = input("enter your function \n")
l = Symbol('l')

print (myfunction(l**2).diff(l))