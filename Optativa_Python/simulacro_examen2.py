edades = [22, 15, 31, 8, 19, 45, 12, 27, 33]

lista_menores = []

edades_ordenadas = sorted(edades,reverse=True)

print(edades_ordenadas)

maximo = edades[0]
minimo = edades[0]
suma = 0
for e in edades:
    if e < 20:
        lista_menores.append(e)
    suma +=e
    
    if e > maximo:
        maximo = e
    if e < minimo:
        minimo = e
        
print(lista_menores)

print(f"suma: {suma} , maximo: {maximo}, minimo: {minimo} numeros de elementos: {len(edades)}")

rectangulo = (5, 12)

base,altura = rectangulo[0],rectangulo[1]

diagonal_rectangulo = base*base + altura * altura

print(diagonal_rectangulo ** 0.5)


productos = {"nombre":"Camiseta","precio":12,"tallas":["S", "M", "L", "XL"]}

productos["stock"] = 20

del(productos["precio"])

for clave,valor in productos.items():
    
    print(f"{clave}: {valor}")
    
print(f"Tallas del producto: {len(productos["tallas"])}")
    
            
            

lista = [3, 3, 5, 7, 7, 9]

conjunto = set(lista)

print(conjunto)
print(f"Tiene {len(conjunto)} elementos")

conjunto.add(11)
conjunto.discard(5)
print(f"Nuevo conjunto: {conjunto}")

X = {1, 2, 3, 4} 
Y = {3, 4, 5, 6}

print(f"Union: {X | Y}")
print(f"Interseccion: {X&Y}")
print(f"Diferencia {Y-X}")


if 6 in Y:
    print(True)
else:
    print(False)

numeros = {3,4}
if numeros.issubset(X):
    print(True)
else:
    print(False)
    
    
colores = ["rojo", "azul", "rojo", "verde", "azul"]

conjunto_colores = set(colores)

print(f"Colores Distintos: {len(conjunto_colores)}")



def es_impar(n):
    
    if n%2==0:
        return True
    else:
        return False


print(es_impar(3))

def contar_letras(texto):
    letras = []
    
    for l in texto:
        letras.append(l)
    
    diccionario = {}
    
    for letra in texto:
        diccionario[letra] = letras.count(letra)
    return diccionario


print(contar_letras("casa"))