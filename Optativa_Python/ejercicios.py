# num1 = int(input("Introduce un numero "))
# num2 = int(input("Introduce el segundo numero "))

# print(num1==num2)
# print(num1!=num2)
# print(num1>num2)
# print(num1>=num2)
# print(num1<=num2)

# edad = int(input("Introduce tu edad: "))

# print(edad == 18)
# print(edad >= 18)
# print(edad >16 and edad <=25)

# nota_decimal = float(input("Introduce tu nota: "))

# print(nota_decimal >=5);
# print(nota_decimal <5);
# print(nota_decimal >=5 and nota_decimal<=10);

# usuario1 = str(input("Introduce el primer usuario: "))
# usuario2 = str(input("Introduce el segundo usuario: "))

# usuario1.strip()
# usuario2.strip()

# usuario1.lower()
# usuario2.lower()

# print(usuario1 == usuario2)
# print(usuario1 != usuario2)

# numero = int(input("introduce un numero entero: "))

# if(numero%2==0):
#     print("el numero es par")
# else:
#     print("no es par")


# edad = int(input("Introduce tu edad: "))
# # esEstudiante = True
# esEstudiante = input("Introduce si eres estudiante: ").lower() == "si"

# if(edad < 18):
#     descuento=20
# elif esEstudiante:
#     descuento=10
# else:
#     descuento = 0

# print(f"Descuento: {descuento}%")

# numero = int(input("introduce un numero: "))

# if(numero > 0):
#     print(f"es positivo")

# elif numero < 0:
#     print(f"es negativo")
# else:
#     print(f"es igual a 0")

# numero = int(input("introduce un numero: "))

# if(numero%2==0):
#     print("es par")

# else:
#     print("es impar")

# edad = int(input("Introduce tu edad: "))
# anos = 0;
# if(edad >= 18):
#     print(f"acceso permitido")

# resta = 18-edad

# print(f"Te faltan {resta} años para cumplir 18")

# opcion = input("Opción: ")

# match opcion:
#     case "1":
#         print("Inicio")
#     case "2":
#         print("Perfil")
#     case "3":
#         print("Configuracion")
#     case "4":
#         print("Salir")
#     case _:
#         print("Opcion no valida")

# a= float(input(f"Introduce un numero: "))
# b= float(input(f"Introduce el segundo numero: "))
# operacion = input("Operacion: ").lower()

# match operacion:
#     case "sumar":
#             print(a+b)
#     case "restar":
#             print(a-b)
#     case "multiplicar":
#             print(a*b)
#     case "dividir":
#         if(b > 0):
#             print(a/b)
#     case _:
#              print("No valido")

# numero = int(input("Introduce un numero "))

# match numero:
#     case 1:
#         print(1)
#     case 2:
#         print(2)
#     case 3:
#         print(3)
#     case _:
#         print("Fuera de Rango")



# cajero = 1200
# opcion = 0

# while(opcion !=4):
        
#         match opcion:
#             case 1:
#                 print(cajero)
#             case 2:
#                 ingresar = int(input("Dime cuanto dinero quieres ingresar"))
#                 cajero = cajero + ingresar
                
#             case 3:
#                 retirar = int(input("Dime cuanto dinero quieres retirar !!!RECUERDO no puedes retirar dinero con el cajero vacio: "))
#                 if(retirar >= cajero):
#                     print("no puedes retirar")

#                 cajero = cajero - retirar

#             case 4:
#                 print("Has elegido salir")
#         opcion = int(input("Pon 1 si quieres consultar el saldo , 2 si quieres ingresar , 3 si quieres retirar y 4 si quieres salir.OJOOO no puedes retirar mas dinero del que tienes: "))




#numero = int(input("Introduce un numero : "))

# while(numero >= 0):
#     print(numero)
#     numero-=1

# print("!FIN")     
     

# nombre = "Python"

# for letra in nombre:
#     print(letra)            

# colores = ["rojo","verde","azul"]

# for color in colores:
    # print(color)


# for num in range(1,11):
   
#     print(f"{numero} x {num} = {num * numero}")



#numero = int(input("Introduce un numero para ahorrar : "))
# ahorro = 0
# for mes in range(1,13):
#     ahorro+=numero

# print(ahorro)
#num1 = range(1,100)

# for num2 in range(1,11):
#     print(num2)
#     if(num2%2==0):
#         print(num2)
numero = 1
while(numero<=10):
    #print(numero)
    # numero+=1

    if(numero%2==0):
       print(numero)
    numero+=1

    
    

    