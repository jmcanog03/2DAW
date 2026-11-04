# juego = {"titulo":"Pixel Quest","Ano":2021,"precio":20}


# print(juego)

# juego["precio"] = 15

# juego["plataforma"] = "PC"

# del juego["Ano"]

# print(juego)
# print(f"los datos del juego son {len(juego)}")

# mascota = {"nombre":"Toby","especie":"perro","edad":4}

# print(f"{mascota['nombre']} es un {mascota['especie']} de {mascota['edad']} anos")

# print(f"datos guardados {len(mascota)}")

# dato = input("que dato quieres ver: ").lower()

# if dato in mascota:
#     print(f"{dato} : {mascota[dato]}")
    
# else:
#     print("ese dato no esta")
    

# def calificacion(nota):
#     if (nota < 5):
#         return "suspenso"
        
#     elif nota < 7:
#         return "aprobado"
        
#     elif nota < 9:
#         return "sobresaliente"
    
#     else:
#         return "sobresaliente"
    
    
    
rectangulos = [(4, 3), (2.5, 2), (10, 1)]

def area(base,altura):
    return base + altura

def perimetro(base,altura):
    return base + altura *2

for r in rectangulos:
    print(f"area{r[0]},perimetro{r[1]}")


