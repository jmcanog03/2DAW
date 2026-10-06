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
            notas =  float(input("Introduce tu nota: "))
            
            if(notas <0 and notas >10):
                print("No es correcto")
            else:
                registro.append([nombre,notas])
                print("El registro es correcto")
                
        case "2":
            copia = []
            contador = 0;
            cuantosHay =0;
            for n in registro:
                if(not registro):
                    print("No hay alumnos")
                else:
                    copia = sorted(registro)
                 
            for i in copia:
                contador+=1
                print(f"Numero: {contador}, Nombre: {i[0]} , Nota: {i[1]}")
                cuantosHay+=1
        
            print(f"Hay {cuantosHay} alumnos")
                      
        case "3":
            
            nombre = input("Introduce tu nombre: ").strip()
            nombre[0].upper()
            
            posicion = -1
            nota = True;
            for i in registro:
                if(i[0] == nombre):
                    posicion=i
                    print(f"Nota: {i[1]}")
                elif(i[1] >= 5.0):
                    nota = True
                else:
                    nota = False
                    
            if(posicion == -1):
                print("No esta")
            if(nota):
                print("Ha aprobado")
            else:
                print("Ha suspendido")
                    
            
            
                
            
        case 4:
            print("pendiente")
            
        case 5:
            print("pendiente")
            
        case 6:
            print("pendiente")
            
        case 0:
            print("Has elegido Salir")
            
    print(registro)
            
        
    
    
