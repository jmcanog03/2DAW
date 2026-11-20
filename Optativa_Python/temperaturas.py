import numpy as np

dias = ["lun","mar","mie","jue","vie","sab","dom"]

t = [12.8, 15.0, 17.5, 21.0, 19.5, 14.0, 11.5]

temperaturas = np.array(t)




print(f"La media es {round(temperaturas.mean(),1)} ")

posicion = temperaturas.argmax()
posicion1 = temperaturas.argmin()

max = temperaturas.max()
min = temperaturas.min()

print(f"Maxima: {max} dia: {dias[posicion]}")
print(f"Minima: {min} dia: {dias[posicion1]}")