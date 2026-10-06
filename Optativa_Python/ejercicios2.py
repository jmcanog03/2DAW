# Ejercicio 1

precios = [12.5, 3.99, 7.25, 20.0]

print(sorted(precios))

print(precios)

precios.sort(reverse=True)

print(precios)

max = precios[0]
min = precios[0]
for precio in precios:
    if(precio > max):
        max = precio
    else:
        min = precio

print(f"Más caro: {max} , Más barato: {min}")


# dados = [4, 2, 6, 6, 1, 6, 3]

# salido =0
# primeraAparicion = 0

# numero = int(input("Introduce un numero: "))

# for d in dados:

#     if d == numero:
#         salido = dados.count(numero)
#         primeraAparicion = dados.index(numero)
        

# print(f"Ha salido {salido} veces")

# print(f"Primera vez en la posicion: {primeraAparicion}")


Frase = input("Introduce una frase: ").split()

print(f"Palabras: {len(Frase)}")

print(f"Primera: {Frase[0]}, Última: {Frase[-1]}")

print(Frase[::-1])


productos = input("Introduce los productos: ")

productos.strip()


