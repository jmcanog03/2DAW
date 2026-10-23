# juego = {"titulo":"Pixel Quest","Ano":2021,"precio":20}


# print(juego)

# juego["precio"] = 15

# juego["plataforma"] = "PC"

# del juego["Ano"]

# print(juego)
# print(f"los datos del juego son {len(juego)}")

mascota = {"nombre":"Toby","especie":"perro","edad":4}

print(f"{mascota['nombre']} es un {mascota['especie']} de {mascota['edad']} anos")

print(f"datos guardados {len(mascota)}")

dato = input("que dato quieres ver: ").lower()

if dato in mascota:
    print(f"{dato} : {mascota[dato]}")
    
else:
    print("ese dato no esta")
    

