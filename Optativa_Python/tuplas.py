# texto = input("Introduce la fecha ").strip()

# separacion = texto.split("/")


# fecha = (int(separacion[0]),int(separacion[1]),int(separacion[2]))
# print(fecha)

# dia,mes,ano = fecha

# print(f" el dia es {dia} , el mes es {mes} y el año es {ano}")

# if(mes >=1 and mes<=12):
#     print("valido")
# else:
#     print("No valido")

# corredores = [(58.2,"Lucia"),(55.1,"Hugo"),(61.0,"Irene"),(56.7,"Pablo")]

# corredorOrdenados = sorted(corredores)

# for corredor in corredorOrdenados:
    
#     print(f"corredor {corredor[1]},y su tiempo que es {corredor[0]} y su posicion es {corredorOrdenados.index(corredor)}")
    
    
    
# lista = []

# producto = input("Introduce el nombre de un producto si no quieres agregar mas pon fin: ").strip().lower()

# while(producto != "fin"):
#     producto = input("Introduce el nombre de un producto si no quieres agregar mas pon fin: ").strip().lower()
#     if producto in lista:
#         print("repetido")
#     else:
#         lista.append(producto)

# # lista.remove("fin")
# for i in range(len(lista)):
#     print(f"{i + 1}.{lista[i]}")
#     # print(f"Total: {len(lista)}")

# print(f"Total: {len(lista)}")


# lista = ["hola","josema"]

# print(lista.index("hola"))
# print(lista.count("hola"))


# frase = input("Introduce una frase: ").lower()

# palabra = frase.split()

# print(f"Palabras: {len(palabra)}")

# larga = palabra[0]

# for p in range (len(palabra)):
#     # if(int(len(palabra[p]) > len(larga))):
#     #     larga = palabra[p]
        
#     if(len(palabra[p]) > len(larga)):
#         larga = palabra[p]
        
    
# print(f"La mas larga es {larga}")

# print("-".join(sorted(palabra)))

# texto = input("Introduce la fecha ").strip()

# separacion = texto.split("/")


# fecha = (int(separacion[0]),int(separacion[1]),int(separacion[2]))
# print(fecha)

# dia,mes,ano = fecha

# print(f" el dia es {dia} , el mes es {mes} y el año es {ano}")


# amigos = []

# numero = 3

# while(numero != 0):
#     nombre = input("Introduce un nombre: ")
#     amigos.append(nombre)
#     numero = numero -1
    
# print(amigos)

# print(f"En medio: {amigos[1]}" )

temperaturas = [18, 21, 19, 25, 23]

temperaturas[2] = 20

temperaturas.append(22)

print(temperaturas)

print(temperaturas[0])

print(temperaturas[-1])

invitados = ["Ana", "Luis", "Marta"]

# invitados.insert(0,"Sara") 

invitados[:0] = ["Sara"]

invitados.remove("Luis")

print (invitados.pop())

print(invitados)

print(len(invitados))


# catalogo = ["teclado", "ratón", "monitor"]

# producto = input("Introduce un producto: ").strip().lower()

# if producto in catalogo:
#     catalogo.remove(producto)
#     print("Este producto se ha vendido")
# else:
#     print("No esta en el catalogo")
    
# print(catalogo)

notas = [7, 3, 9, 5, 4, 8]
suma =0
aprobadas = 0
suspensas = 0
media = 0

for n in notas:
    if n >=5  and n <=10:
        aprobadas+=1
    else:
        suspensas+=1
    suma+=n
    
media = suma/len(notas)

print(f"Suma {suma} . Media: {media}")

print(f"Aprobadas: {aprobadas} . Suspensas: {suspensas}")

print(f"Comprobacion: {sum(notas)}" )

conjunto = set(notas)

print(conjunto)

