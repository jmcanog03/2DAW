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

const productos = ["Tablet", "Movil", "Auriculares", "Mochila"];

productos.push("USB");

console.log(productos);

const eliminarprimerproducto = productos.shift();
console.log(productos);

console.log(productos.includes("pan"))

for (let i = 0; i < productos.length; i++) {
    console.log(`Numero ${i} , Producto: ${productos[i]}`)
}

let productofor = "valor";
function contarProducto(lista, producto) {
    let contador = 0;
    let producto_selec = ""

    for (let i = 0; i < lista.length; i++) {
        if (lista[i] === producto) {
            contador++
            producto_selec = lista[i]
        }
    }

    return console.log(`El producto ${producto_selec} aparece ${contador} veces`);
}

contarProducto(productos, "Movil")
