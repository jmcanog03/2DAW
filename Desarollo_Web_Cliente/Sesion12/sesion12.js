const boton = document.getElementById("boton-oferta")

boton.addEventListener("click", function () {
    console.log("Has pulsado el boton")
})

const envio = document.getElementById("formulario-busqueda")

envio.addEventListener("submit", function (event) {
    event.preventDefault();
    console.log("Busqueda interceptada")
})

envio.addEventListener("input", function (event) {
    console.log(event.target.value)
})

const lista = document.getElementById("lista-productos")

lista.addEventListener("click", function (event) {
    console.log("click dentro de la lista")
})

lista.addEventListener("click", function (event) {
    if (event.target.classList.contains("producto")) {
        console.log("Producto pulsado", event.target.textContent)

    }
})

const producto = {

    nombre: "Ratón inalámbrico",
    precio: 45,
    agotado: false,
    stock: 12,

    aplicarDescuento: function (porcentaje) {
        return this.precio - (this.precio * porcentaje) / 100
    },

    estaDisponible: function () {

        if (this.stock > 0) {
            return true;
        } else {
            return false
        }
    }

}

console.log(producto.aplicarDescuento(10))
console.log(producto.estaDisponible())

// producto.stock = 8
// producto.precio = 160
// delete producto.agotado


const CableUSBC = {

    nombre: "Cable USB-C",
    precio: 9,
    stock: 15,

    estaDisponible: function () {

        if (this.stock > 0) {
            return true;
        } else {
            return false
        }
    }
}

const CableUSBC2 = {

    nombre: "Cable USB-C2",
    precio: 9,
    stock: 15,

    estaDisponible: function () {

        if (this.stock > 0) {
            return true;
        } else {
            return false
        }
    }
}


const CableUSBC3 = {

    nombre: "Cable USB-C3",
    precio: 9,
    stock: 15,

    estaDisponible: function () {

        if (this.stock > 0) {
            return true;
        } else {
            return false
        }
    }
}

const producto1 = [CableUSBC,CableUSBC2,CableUSBC3]

for (const p of producto1){
    console.log(`Nombre: ${p.nombre}, Precio: ${p.precio}`)

    if(p.estaDisponible){
        console.log(`Disponible: ${p.estaDisponible()}`)
    }
}






