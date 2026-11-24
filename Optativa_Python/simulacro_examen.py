# Importaciones

import math
import colorama
import numpy as np
from colorama import Fore,Back,Style

# Ejercicio 1

numeros = [12, 7, 3, 18, 25, 9, 4, 30, 15]

numeros_mayores = []

for n in numeros:
    if n > 10:
        numeros_mayores.append(n)


print(sorted(numeros))



min=numeros[0]
max=numeros[0]
suma = 0

for n in numeros:
    suma+=n
    
    if n > max:
        max = n
    if n < min:
        min = n
        
print(suma)
print(max)
print(min)


# Ejercicio 2

coordenadas = (6, 8)

x,y = coordenadas

# print(x*x + y*y)

print(f"coordenadas: {x*x + y*y}")

# Ejercicio 3
alumnos ={"nombre":"","edad":0,"notas":[5,7,8,9]}

alumnos["curso"] = "1DAW"

alumnos.pop("edad")

for clave,valor in alumnos.items():
    print(f"{clave} -> {valor}")
    
media = 0
suma_notas =0
for clave,valor in alumnos.items():
    
    if(clave == "notas"):
        for v in valor:
             suma_notas+=v
        media =  suma_notas / len(valor)


print(media)

# Ejercicio 4

conjunto_lista = set([1, 2, 2, 3, 4, 4, 5])

print(conjunto_lista)
print(len(conjunto_lista))

conjunto_lista.add(10)
conjunto_lista.discard(3)

print(conjunto_lista)

A = {1, 2, 3, 4, 5} 
B = {4, 5, 6, 7}

print(A | B)
print(A&B)
print(A-B)

if 7 in B:
    print(7)

if A <= B:
    print(True)
    

nombres = ["ana", "luis", "ana", "pedro", "luis"]

conjunto_nombres = set(nombres)

print(len(conjunto_nombres))

# Ejercicio 5
def es_par(n):
    
    if n%2==0:
        return True
    
    else:
        return False
    
    
print(es_par(3))


def contarPalabras(frase):
    diccionario = {}
    lista = frase.lower().split()
    
    for palabras in lista:
        
        diccionario[palabras] = lista.count(palabras)
        
    return diccionario
     
        
print(contarPalabras("hola mundo hola"))
       
def estadisticas(lista,redondeo=2):
    minimo = lista[0]
    maximo = lista[0]
    suma = 0
    media = 0
    
    for n in lista:
        if n > maximo:
            maximo = n
        if (n < minimo):
            minimo = n
        suma+=n
    media = round(suma / len(lista) , redondeo)
    
    return (minimo, maximo , media)


mi_lista = [4, 8, 15, 16, 23, 42]

minimo,maximo,media = estadisticas(mi_lista,3)

print(minimo)
print(maximo)
print(media)
  
radio = 7
print(math.ceil(math.pi * radio**2)) 

factorial = math.factorial(6)
print(factorial)


# numpy (1 punto)

# c) Crea un array con los números del 1 al 10 usando np.arange, multiplícalo por 3 e imprime el array y su media. (0,5)

# d) Crea una matriz de 2 filas y 3 columnas con np.array e imprime su forma (shape) y su traspuesta. (0,5)



array_numeros = np.arange(1,11) * 3

print(array_numeros,array_numeros.mean())


matriz = np.array([[1, 2, 3], [4, 5, 6]])

print(matriz.shape)
print(matriz.T)

print(Fore.GREEN + "Aprobado" + Style.RESET_ALL)
print(Fore.RED + "Suspenso" + Style.RESET_ALL)