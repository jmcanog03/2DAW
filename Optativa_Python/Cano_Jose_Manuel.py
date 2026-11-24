import colorama
from colorama import Fore , Back , Style

productos = [
    {"nombre":"Bocadillo" , "tipo":"comida","precio":2.5,"stock":12},
    {"nombre":"Zumo" , "tipo":"bebida","precio":1.2,"stock":3},
    {"nombre":"Agua" , "tipo":"bebida","precio":0.8,"stock":20},
    {"nombre":"Croissant" , "tipo":"comida","precio":1.5,"stock":0},
    {"nombre":"Batido" , "tipo":"bebida","precio":2.0,"stock":6},
]

def mostrarProductos(productos):
    for p in productos:
        print(f"nombre: {p["nombre"]} -> precio: {p["precio"]} -> stock: {p["stock"]}")
        print(estado_Stock(p["stock"]))
    
    
def mostrarProducAgotados(productos):
    for p in productos:
        if p["stock"] == 0:
            print(f"nombre: {p["nombre"]} -> precio: {p["precio"]} -> stock: {p["stock"]}")


def anadirProductos(productos):
    nombre = input("Introduce el nombre del producto a agregar: ").lower().strip()
    tipo = input("Introduce el tipo del producto a agregar: ").lower().strip()
    precio = int (input("Introduce el precio del producto a agregar: "))
    stock = int (input("Introduce el stock del producto a agregar: "))
    
    if tipo != "comida" and tipo !="bebida":
        print("El tipo debe ser comida o bebida")
    elif precio < 0:
        print("El precio no puede ser negativo")
    
    elif stock < 0:
        print("El stock no debe ser negativo")
    else:
        productos.append({"nombre":nombre,"tipo":tipo,"precio":precio,"stock":stock } )
      


def caclular_total(precio,cantidad):
    importe = 0
    importe_total = 0
    descuento = 0.10
    compra = cantidad * precio
    if cantidad >= 3:
        importe = compra * descuento
        importe_total = compra - importe
        return importe_total

    return round(compra,2)
 
def estado_Stock(stock):
    mensaje = ""
    
    if stock == 0:
        mensaje = "No hay unidades"
    elif stock < 5:
        mensaje = "Quedan pocas unidades"
    elif stock >=5:
        mensaje = "Disponible"
    
    return mensaje

def producto_mas_caro(productos):
    
    mas_caro = productos[0]
    for p in productos:
        if p["precio"] > mas_caro["precio"]:
            maximo = p     
    return mas_caro["nombre"]


# def mostrar_disponibilidad(producto):
    
#     for p in productos:
#         if p["stock"]      
 
opcion = ""

while opcion != "0":
    print()
    print("=== GESTOR DE NOTAS ===")
    print("1. Mostrar todos los productos")
    print("2. Mostrar los productos agotados")
    print("3. Añadir un producto")
    print("4. Calcular el importe a una compra")
    print("5. Consultar estado del stock")
    print("6. Ver el producto mas caro")
    print("7. Ver disponibilidad en color")
    print("8. Estadisticas de precios")
    print("9. Calcular cajas necesareas")
    print("10. Analisis de ventas de la semana")
    print("0. Salir")
    
    opcion = int (input("Opción: ").strip())
    
    match opcion:
        
        case 1:
            print()
            print("Has elegido mostrar todos los productos")
            mostrarProductos(productos)
        case 2:
            print()
            print("Has elegido mostrar los productos agotados")
            mostrarProducAgotados(productos)
        case 3:
             print()
             print("Has elegido anadir los productos")
             anadirProductos(productos)
        case 4:
             precio = float(input("Introduce el precio: "))
             cantidad = int(input("Introduce la cantidad: "))
             print(caclular_total(precio,cantidad))

        case 5:
            mostrarProductos(productos)
            
        case 6:
            print(producto_mas_caro(productos))
            
        