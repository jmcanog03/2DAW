# votos = {"ana","luis","marta","luis","ana"}
# votos.add("forma")

# votos.discard("forma")
# odernados = set(votos)


# for o in odernados:
#     print(o)
    
# numeros = [4,7,4,2,9,7,4,1]
# distintos = set(numeros)

# print(f"Numero {len(numeros)} Distintos {len(distintos)}")

# print(f"Ordenados {sorted(distintos)}")

# repetidos = set()

# for n in numeros:
#     repetidos_lista = numeros.count(n)
#     repetidos.add(repetidos_lista)

# print(f"Repetidos {repetidos}")

# palabra = input("Introduce una palabra ").lower()

# letras_distintas = set(palabra)



# print(f"Palabra {palabra}")

# print(f"Letras Distintas {''.join(sorted(letras_distintas))} {len(letras_distintas)}")

# if(len(letras_distintas) < len(palabra)):
#     print("la palabra se repite")
# else:
#     print("la palabra no se repite")

vocales = {"a","e","i","o","u"}
frase = input("Introduce una frase ")

palabras = frase.split()

print(f"Frase {frase}")
conjuntoLetras = set(palabras)

usadas = set()
noUsadas = set()
listaLetras = sorted(conjuntoLetras)
for v in vocales:
    
    if(listaLetras.count(v)):
        usadas.add(v)
    else:
        noUsadas.add(v)

print(f"Usadas {usadas}")
print(f"noUsadas {noUsadas}")