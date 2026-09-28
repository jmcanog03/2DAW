// for (let i = 1; i <= 30; i++) {
//     console.log(i)
// }

// let numero = 2;
// while (numero != 50) {
//     console.log(numero)
//     numero += 2
// }

// for (let i = 2; i <= 50; i++) {

//     if (i % i == 0) {
//         console.log(i)
//     } else {
//         console.log("mal")
//     }
// }

// let multiplicacion = 0;
// let numero1 = 7;

// for (let i = 1; i <= 10; i++) {

//     multiplicacion = numero1 * i;

//     console.log(`${numero1} x ${i} = ${acumulador}`)

// }

// let multiplicacion2 = 0;
// let numero2 = 3;
// let acumulador = 1

// for (let i = 1; i <= 100; i++) {

//     multiplicacion2 = numero2 * i;
//     acumulador+=multiplicacion;
// }
// console.log(`${acumulador}`)

// let numFactorial = 5

// for(let i = 1; i <= numFactorial; i++){

//     multiplicacion = acumulador * i;
//     acumulador = multiplicacion;

//     console.log(`${numFactorial} x ${i} = ${multiplicacion}`)
// }

// function presentar(nombre,ciudad){
//     console.log(`La ciudad es: ${ciudad} y su nombre es ${nombre}`)
// }

// function calcularPrecio(precio,porcentajeIVA){
//     porcentajeIVA = porcentajeIVA/100;
//     return Number(precio + precio * porcentajeIVA);
// }

// console.log(calcularPrecio(100,21));
// console.log(calcularPrecio(50,10));

// function metrosAKilometros(metros){
//     return metros/1000;
// }

// function kilometrosmetrros(kilometros){
//     return kilometros * 1000;
// }

// let resultadometros = metrosAKilometros(1500);
// let resultadoKilometros = kilometrosmetrros(2.75);

// console.log(resultadometros);
// console.log(resultadoKilometros);


// function crearIniciales(nombre,apellido){
//     let letrainicial = nombre[0].toUpperCase();
//     let letraapellido = apellido[0].toUpperCase();
//     return letrainicial +" . "+ letraapellido;
// }

// console.log(crearIniciales("jose","mama"));

// function ultimoCaracter(texto ="hola" ){
//     let letra = texto[texto.length -1];
//     return letra;
// }

// let resultado = ultimoCaracter("josema")
// console.log(resultado);

// // Ejercicio 7

// function repetirMensaje(mensaje,veces){
//     let i = 0;
//     while(i < veces && veces > 0){
//         console.log(mensaje)
//         i++;
//     }
// }
// repetirMensaje("hola",1);


// const array = ["movil","tablet","Router","Mochila"];
// console.log(array[1]);
// console.log(array[array.length -1]);
// array[2]="USB";
// console.log(array);


// const canciones = ["Worldwide","Experience","Saka Waka"];
// console.log(canciones)

// canciones.push("Nuvole Bianchi");
// canciones.push("Superestar");
// console.log(canciones);

// canciones.unshift("jajajaja")
// console.log(canciones)

// const cancioneseliminadas = canciones.splice(0,2);
// console.log(cancioneseliminadas);
// console.log(canciones);


// // const eliminarultimacancion = canciones.pop();
// // const eliminarprimeracancion = canciones.shift();
// // console.log(eliminarultimacancion);
// // console.log(eliminarprimeracancion);
// // console.log(canciones)

// console.log(canciones.indexOf("Experience"))
// console.log(canciones.includes("Saka Waka"))

// const temperatura = [18,21,19,23]

// for(let i =0; i<temperatura.length; i++){
//     console.log(`Dia ${i+1}: ${temperatura[i]} ºC`)
// }

// const ventas = [12,8,15,5]
// let total = 0;
// for(let i =0; i<ventas.length; i++){
//     total+=ventas[i]
// }
// console.log(total)

// const productos = ["Tablet", "Movil", "Auriculares", "Mochila"];

// productos.push("USB");

// console.log(productos);

// const eliminarprimerproducto = productos.shift();
// console.log(productos);

// console.log(productos.includes("pan"))

// for (let i = 0; i < productos.length; i++) {
//     console.log(`Numero ${i} , Producto: ${productos[i]}`)
// }

// let productofor = "valor";
// function contarProducto(lista, producto) {
//     let contador = 0;
//     let producto_selec = ""

//     for (let i = 0; i < lista.length; i++) {
//         if (lista[i] === producto) {
//             contador++
//             producto_selec = lista[i]
//         }
//     }

//     return console.log(`El producto ${producto_selec} aparece ${contador} veces`);
// }

// contarProducto(productos, "Movil")

// const medicion = [18,20,41,19,21];

// console.log(medicion)

// medicion[2] = 22

// console.log(medicion)

// const parte = ["Luis","Sara","Marta"]

// parte.unshift("Ana")
// parte.push("Raúl")

// console.log(parte)

// const primerapersonaelim = parte.shift()
// console.log(`Salio ${primerapersonaelim}`)
// console.log(parte)

// const canciones = ["Waka Waka","Experiencie","A toda pastilla","Caliz"]

// console.log(canciones)

// const cancioneliminada = canciones.pop()

// console.log(`Cancion eliminada ${cancioneliminada} , permanencen ${canciones}`)

// const nombre1 = ["Fabricio" , "Emilio", "Lourdes"]
// const nombre2 = ["Javier" , "Paco", "Juan"]

// const array_combinado = nombre1.concat(nombre2)

// console.log(array_combinado)

// console.log(nombre1)
// console.log(nombre2)

const producto = ["monitor", "ratón", "teclado", "webcam"];

console.log(producto.includes("teclado"))
console.log(producto.indexOf("teclado"))

console.log(producto.includes("impresora"))
console.log(producto.indexOf("impresora"))

// el indexOf da -1 si lo que buscamos no esta dentro del array donde estamos buscando

const visitas = [120, 98, 135, 110, 142]

let total = 0;
let media = 0;
for (let i = 0; i < visitas.length; i++) {
    total += visitas[i]



}
media = total / visitas.length

console.log(total)
console.log(media)

const puntuacion = [12, 27, 19, 31, 24]
let max = puntuacion[0]

for (let i = 0; i < puntuacion.length; i++) {
    if (puntuacion[i] > max) {
        max = puntuacion[i];
    }
}
console.log(max)

const nombres = ["Ana", "Roberto", "Inés", "Alejandro", "Mar"]
const nombres5 = []
for (let i = 0; i < nombres.length; i++) {

    if (nombres[i].length > 5) {
        nombres5.push(nombres[i])
    }
}

console.log(nombres5)


function eliminarElemento(lista, elemento) {
    for (let i = 0; i < lista.length; i++) {
        let elementoeliminar = lista.indexOf(elemento)

        if (lista[i] === elemento) {
            lista.splice(elementoeliminar, 1)
        }
    }

    return lista;
}

console.log(eliminarElemento(nombres))
console.log(eliminarElemento(nombres, "Roberto"))


const tarea = ["Diseñar", "Probar", "Publicar"];
console.log(tarea);

tarea.splice(1, 0, "Programar");

console.log(tarea);


let esIncluido = true

function contiene(lista, elemento) {

    for (let i = 0; i < lista.length; i++) {

        if (lista.includes(elemento)) {
            esIncluido = true;
        } else {
            esIncluido = false;
        }
    }

    if (!esIncluido) {
        console.log("No Disponible")
    } else {
        console.log("Disponible")
    }
}


contiene(tarea, "Probar");

let elemento = ""
function rotarIzquierda(lista) {
    for (let i = 0; i < lista.length; i++) {
        elemento = lista[0];

        if (lista[i] === elemento) {

            lista.shift()

            lista.push(elemento)
        }
    }

    return lista;
}

console.log(rotarIzquierda(tarea));

let contador = 0;
let elemento1 = "";

function contarApariciones(lista, elemento) {

    for (let i = 0; i < lista.length; i++) {
        if (lista[i] === elemento) {
            contador++;
            elemento1 = lista[i];
        }

        
    }

    return contador;
}

let resultado = contarApariciones(tarea,"Probar");

console.log(`El elemento ${elemento1} , aparece ${resultado} veces`)


const precios = [12,8,20]

precios.forEach(function (precio){
    console.log(`${precio} €`)
})

const temperaturas = [18,21,19,21]

temperaturas.forEach(function (temperaturas,indice){
    console.log(`Dia ${indice +1} : ${temperaturas}`)
});

const notas = [4,7,9,3,6]

const aprobadas = notas.filter(notas =>{
    return notas >= 5;
})

console.log(aprobadas)

const nombre = ["Ana","Alejandro","Luis","Eva"]

const cortos = nombres.filter(function (nombre){
    if (nombre.length <=4) return nombre;
})

const mayusculas = cortos.map(function (nombre){
    return nombre.toUpperCase()
});

console.log(mayusculas)

const precio = [45,12,80,30,120,25]

const preciosConIva = precio.map(function(precio){
    return precio * 1.21
})

console.log(preciosConIva)


const preciosmayor50 = precio.filter(function(precio){
    if(precio >= 50) return precio;
})

console.log(preciosmayor50)

const precioSuperiora100 = precio.find(function (precio){
    if(precio > 100) return precio;
})

console.log(precioSuperiora100)

const precioMenosDeVeinte = precio.some(function(precio){
    if(precio < 20) return precio
})

console.log(precioMenosDeVeinte)

const precioOrdenar = [...precio].sort(function(a,b){
    return a - b
})

console.log(precioOrdenar)
console.log(precio)

const elementos = ["teclado", "ratón", "monitor", "impresora"]

elementos.forEach(function(elementos,indice){
    console.log(`Dispositivo ${indice +1} : ${elementos}`)
})

console.log()

const estudiantes = ["Lucía", "Carlos", "Marta", "Diego"]


estudiantes.forEach(function(estudiantes){
    console.log(`Nombre ${estudiantes} esta presente`)
    
})
console.log(`Hay ${estudiantes.length} estudiantes`)

const medidas = [1.5, 2, 0.75, 3.2]

const medidascentimetros = medidas.map(medidas => medidas*100)

console.log(medidas)
console.log(medidascentimetros)

const lenguajes = ["javascript", "python", "java", "php"]

const lenguajesMayusculas = lenguajes.map(lenguajes => lenguajes.toUpperCase())

console.log(lenguajesMayusculas)

const preciosnuevos = [50, 120, 35, 80]

const descuentoPrecios = preciosnuevos.map(preciosnuevos => (preciosnuevos - (preciosnuevos * 0.20)).toFixed(2))

console.log(descuentoPrecios)

const pares = [13, 8, 21, 4, 16, 7, 10]

const paresfiltrados = pares.filter(paresfiltrados => paresfiltrados%2==0)

paresfiltrados.forEach(pares => console.log(pares))

const lista = ["index.html", "app.js", "estilos.css", "validacion.js", "logo.png", "menu.js"]

const terminadosenJS = lista.filter(lista => lista.endsWith(".js"))

console.log(terminadosenJS)

const temperatura = [18, 24, 31, 27, 35, 20, 29]

const temperaturaIguales = temperatura.filter(temperatura => temperatura >=30)

const mensajeTemperatura = temperaturaIguales.map(temperaturaIguales => console.log(`Temperatura elevada ${temperaturaIguales}`))

const calificaciones = [7, 6, 4, 8, 3, 9]

const calificacionesSuspensas = calificaciones.find(calificaciones => calificaciones<5)

const calificacionesAprobadas = calificaciones.find(calificaciones => calificaciones>=5)

console.log(calificacionesSuspensas)
console.log(calificacionesAprobadas)

