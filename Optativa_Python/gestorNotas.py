from queue import Full

registro = [["Ana", 7.0], ["Luis", 4.0], ["Marta", 9.0]]
opcion = ""

while opcion != "0":
    print()
    print("=== GESTOR DE NOTAS ===")
    print("1. Añadir alumno")
    print("2. Listar alumnos")
    print("3. Buscar alumno")
    print("4. Estadísticas")
    print("5. Modificar nota")
    print("6. Borrar alumno")
    print("0. Salir")

    opcion = input("Opción: ").strip()

    match opcion:

        case "1":
            nombre = input("Introduce tu nombre: ").strip()
            nombre[0].upper()
            notas = float(input("Introduce tu nota: "))

            if notas < 0 and notas > 10:
                print("No es correcto")
            else:
                registro.append([nombre, notas])
                print("El registro es correcto")

        case "2":
            copia = []
            contador = 0
            cuantosHay = 0
            for n in registro:
                if not registro:
                    print("No hay alumnos")
                else:
                    copia = sorted(registro)

            for i in copia:
                contador += 1
                print(f"Numero: {contador}, Nombre: {i[0]} , Nota: {i[1]}")
                cuantosHay += 1

            print(f"Hay {cuantosHay} alumnos")

        case "3":

            nombre = input("Introduce tu nombre: ").strip()
            nombre[0].upper()

            posicion = -1
            nota = False
            for i in registro:
                if i[0] == nombre:
                    posicion = i
                    print(f"Nota: {i[1]}")

                    if i[1] >= 5.0:
                        nota = True
                    else:
                        nota = False

            if posicion == -1:
                print("No esta")

            if nota:
                print("Ha aprobado")
            else:
                print("Ha suspendido")

        case "4":
            nota_mejor = registro[0][1]
            nombre_alumno = registro[0]
            contador_aprobados = 0
            nota_media = 0
            acumulador_notas = 0
            alumnos = 0

            if not registro:
                print("no hay alumnos")
            else:

                for reg in registro:

                    acumulador_notas += reg[1]
                    alumnos += 1
                    nota_media = acumulador_notas / alumnos

                    if reg[1] >= 5:
                        contador_aprobados += 1

                    if reg[1] > nota_mejor:
                        nota_mejor = reg[1]
                        nombre_alumno = reg[0]

                print(f"Nota media: {round(nota_media,2)}")
                print(f"Aprobados: {contador_aprobados}")
                print(f"Mejor nota: {nombre_alumno}  {nota_mejor}")

        case "5":
            posicion = -1
            nombre = input("Introduce tu nombre para cambiar la nota: ").strip()
            for i in range(len(registro)):
                if registro[i][0] == nombre:
                    posicion = i

            if posicion != -1:
                nota_Nueva = float(input("Introduce tu nota nueva: "))
                registro[posicion][1] = nota_Nueva
                print("Nota introducida correctamente")
            else:
                print("No esta el alumno asegurate de introducirlo correctamente")

        case "6":
            posicion = -1
            nombre = input("Introduce el nombre del alumno a borrar: ").strip()
            for i in range(len(registro)):
                if registro[i][0] == nombre:
                    posicion = i
                    
            if posicion != -1:
                registro.remove(registro[posicion])
                print("Alumno eliminado")
            else:
                print("No esta el alumno asegurate de introducirlo correctamente")
                
        case 0:
            print("Has elegido Salir")
