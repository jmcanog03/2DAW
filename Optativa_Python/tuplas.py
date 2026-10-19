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

corredores = [(58.2,"Lucia"),(55.1,"Hugo"),(61.0,"Irene"),(56.7,"Pablo")]

corredorOrdenados = sorted(corredores)

for corredor in corredorOrdenados:
    
    print(f"corredor {corredor[1]},y su tiempo que es {corredor[0]} y su posicion es {corredorOrdenados.index(corredor)}")

