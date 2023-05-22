import matplotlib.pyplot as plt
import numpy as np
from scipy.interpolate import lagrange

f = lambda x: 1 / (5 + x*x)

# mamy 4 punktów w zakresie -1...2 i obliczamy dla nich f(x)
x1 = np.linspace(-1, 2, 4)
y1 = [3, 1, 2, -6]

# wyznaczamy współczynniki 
F = lagrange(x1, y1)

# wyliczamy wartość funkcji F(x) dla "gęściej" rozmieszczonych punktów
x2 = np.linspace(-1, 2, 4)
y2 = F(x2)

print(f'{F}')
