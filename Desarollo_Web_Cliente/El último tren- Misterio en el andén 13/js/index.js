const formulario = document.getElementById("formulario-inicio")
const header = document.getElementById("header")
const botonFormulario = document.getElementById("boton-formulario")

// SECCIONES DEL JUEGO
const sectionDespacho = document.getElementById("despacho")
const sectionAnden = document.getElementById("anden")
const sectionTaquilla = document.getElementById("taquilla")

// OBJETOS 
const objetoReloj = document.getElementById("reloj")
const objetoNota = document.getElementById("nota")
const objetoBillete = document.getElementById("billete")

const nombreForm = document.getElementById("nombre")
const idDetective = document.getElementById("id")

// VIDAS DE CADA SECCION
const vidas = document.querySelectorAll(".vidas")

// const vida = document.querySelector(".vida")

// DESCRIPCIONES DE LOS OBJETOS
const descripcionReloj = document.getElementById("descripcionReloj")
const descripcionNota = document.getElementById("descripcionNota")
const descripcionBillete = document.getElementById("descripcionBillete")

// PISTAS DE OBJETOS
const pistaReloj = document.getElementById("pistaReloj")
const pistaNota = document.getElementById("pistaNota")
const pistaBillete = document.getElementById("pistaBillete")

const botonReloj = document.getElementById("investigarReloj")

const botonAnden = document.getElementById("ir-anden")

// SEÑALES
const senalViaLibre = document.getElementById("vialibre")
const senalPrecaucion = document.getElementById("precaucion")
const senalAlto = document.getElementById("alto")
// CUADROS PARA SOLTAR LAS SEÑALES ESTAN VACIOS
const vacio1 = document.getElementById("vacio1")
const vacio2 = document.getElementById("vacio2")
const vacio3 = document.getElementById("vacio3")

// MENSAJES PARA QUE EL JUGADOR SEPA SI ES CORRECTO EL ARRASTRE O NO 
const mensajevacio1 = document.getElementById("mensajevacio1")
const mensajevacio2 = document.getElementById("mensajevacio2")
const mensajevacio3 = document.getElementById("mensajevacio3")

// botonFormulario.disabled=true;
sectionDespacho.classList.remove("activa")
sectionAnden.classList.remove("activa")
sectionTaquilla.classList.remove("activa")



formulario.addEventListener("submit", function (event) {
    event.preventDefault()
    if (validarNombre(nombreForm)) {
        sectionDespacho.classList.remove("despacho")
        sectionDespacho.classList.add("activa")
        formulario.classList.remove("activa")
        header.classList.remove("activa")
        sectionAnden.classList.remove("activa")
    } else {
        formulario.classList.add("activa")
        header.classList.add("activa")
        sectionDespacho.classList.remove("activa")
    }
})


const objetos = [
    { id: 1, nombre: "Reloj", descripcion: "El reloj se paro a las 19:47", ivestigado: false, pista: "Quizas tenga relacion con el momento en el que ocurrio el sabotaje" },
    { id: 2, nombre: "Billete de Tren", descripcion: "El billete tiene una mancha de grasa", ivestigado: false },
    { id: 3, nombre: "Nota rota", descripcion: "Solo se puede leer parte de la nota", ivestigado: false }
]

// objetoReloj.textContent = objetos[0].nombre
// objetoNota.textContent = objetos[2].nombre
// objetoBillete.textContent = objetos[1].nombre

function mostrarObjetos() {
    for (let i = 0; i < objetos.length; i++) {
        if (objetos[i].nombre == "Reloj") {
            objetoReloj.textContent = objetos[i].nombre
            descripcionReloj.textContent = objetos[i].descripcion
            pistaReloj.textContent = objetos[i].pista
            objetos[i].ivestigado = true
        }

        if (objetos[i].nombre == "Billete de Tren") {
            objetoBillete.textContent = objetos[i].nombre
            descripcionBillete.textContent = objetos[i].descripcion
            objetos[i].ivestigado = true
        }

        if (objetos[i].nombre == "Nota rota") {
            objetoNota.textContent = objetos[i].nombre
            descripcionNota.textContent = objetos[i].descripcion
            objetos[i].ivestigado = true
        }

    }
}



botonReloj.addEventListener("click", function () {
    
    mostrarObjetos()
})

function validarNombre(nombre) {
    const vacio = nombre.value.trim()
    const valido = nombre.checkValidity()

    if (vacio === "") {
        nombre.classList.remove("valido")
        nombre.classList.add("invalido")
    } else {
        nombre.classList.toggle("valido", valido)
        nombre.classList.toggle("invalido", !valido)
    }

    if (valido) {
        detective.nombre = nombre.value
        botonFormulario.disabled = false;
    } else {
        botonFormulario.disabled = true;
    }

    return valido
}

const detective = {
    nombre: "",
    id: idDetective.value,
    vidasDetective: 4,

    AnadirVidas: function () {
        let acumulador = "";
        for (let i = 0; i < this.vidasDetective; i++) {
            acumulador += "❤️"
        }

        // vidas.textContent = "vidas: " + acumulador

        vidas.forEach(function (vida) {
            vida.textContent = "vidas: " + acumulador
        })
        // vida.textContent = "vidas: " + acumulador

    },

    quitarVidas: function () {
        this.vidasDetective = this.vidasDetective - 1
        this.AnadirVidas()
    }

}
detective.AnadirVidas()
// detective.quitarVidas()

nombreForm.addEventListener("blur", function () {
    validarNombre(nombreForm)
})

botonAnden.addEventListener("click", function () {
    sectionDespacho.classList.remove("activa")
    sectionDespacho.classList.add("despacho")
    sectionAnden.classList.remove("despacho")
    sectionAnden.classList.add("activa")
})

senalViaLibre.addEventListener("dragstart", function (event) {
    event.dataTransfer.setData("text/plain", event.target.id)
})

vacio1.addEventListener("dragover", function (event) {
    event.preventDefault()
})

vacio1.addEventListener("drop", function (event) {
    const id = event.dataTransfer.getData("text/plain")
    const elemento = document.getElementById(id)
    if (id === senalViaLibre.id) {
        vacio1.appendChild(elemento)
        mensajevacio1.textContent = "es correcto"
    } else {
        mensajevacio1.textContent = "esta mal"
        detective.quitarVidas()
        detective.AnadirVidas()
    }
})

senalPrecaucion.addEventListener("dragstart", function (event) {
    event.dataTransfer.setData("text/plain", event.target.id)
})


vacio2.addEventListener("dragover", function (event) {
    event.preventDefault()
})

vacio2.addEventListener("drop", function (event) {
    const id = event.dataTransfer.getData("text/plain")
    const elemento = document.getElementById(id)
    if (id === senalPrecaucion.id) {
        vacio2.appendChild(elemento)
        mensajevacio2.textContent = "es correcto"
    } else {
        mensajevacio2.textContent = "esta mal"
        detective.quitarVidas()
        detective.AnadirVidas()
    }
})

senalAlto.addEventListener("dragstart", function (event) {
    event.dataTransfer.setData("text/plain", event.target.id)
})

vacio3.addEventListener("dragover", function (event) {
    event.preventDefault()
})

vacio3.addEventListener("drop", function (event) {
    const id = event.dataTransfer.getData("text/plain")
    const elemento = document.getElementById(id)
    if (id === senalAlto.id) {
        vacio3.appendChild(elemento)
        mensajevacio3.textContent = "es correcto"
    } else {
        mensajevacio3.textContent = "esta mal"
        detective.quitarVidas()
        detective.AnadirVidas()
    }
})



