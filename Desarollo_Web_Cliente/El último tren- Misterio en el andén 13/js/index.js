const formulario = document.getElementById("formulario-inicio")
const header = document.getElementById("header")
const botonFormulario = document.getElementById("boton-formulario")

// SECCIONES DEL JUEGO
const sectionDespacho = document.getElementById("despacho")
const sectionAnden = document.getElementById("anden")
const sectionTaquilla = document.getElementById("taquilla")
const sectionDerrota = document.getElementById("derrota")
const sectionRetoFinal = document.getElementById("reto-final")
const sectionVictoria = document.getElementById("victoria")

// OBJETOS 
const objetoReloj = document.getElementById("Reloj")
const objetoNota = document.getElementById("Nota rota")
const objetoBillete = document.getElementById("Billete de Tren")
const personajeAcusacion = document.getElementById("personaje")
const botonAcusacion = document.getElementById("acusar")
const mensajeAcusacion = document.getElementById("resultadoAcusacion")

const nombreForm = document.getElementById("nombre")
const idDetective = document.getElementById("id")
const botonComprobarTaquilla = document.getElementById("comprobarTaquilla")
const numeroTaquilla = document.getElementById("numeroTaquilla")
const mensajeConfirmacionTaquilla = document.getElementById("mensajeConfirmacionTaquilla")

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
const botonTaquilla = document.getElementById("ir-taquilla")
const botonInicio = document.getElementById("volverInicio")
const botonRetoFinal = document.getElementById("ir-retofinal")

// SEÑALES
const senales = document.getElementById("senales")
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

let booleanVacio1 = false
let booleanVacio2 = false
let booleanVacio3 = false
// botonFormulario.disabled=true;
sectionDespacho.classList.remove("activa")
sectionAnden.classList.remove("activa")
sectionTaquilla.classList.remove("activa")
sectionRetoFinal.classList.remove("activa")



// PARA NADA

formulario.addEventListener("submit", function (event) {
    event.preventDefault()
    if (validarNombre(nombreForm)) {
        sectionDespacho.classList.add("activa")
        formulario.classList.remove("activa")
        header.classList.remove("activa")
        sectionAnden.classList.remove("activa")
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
    // for (let i = 0; i < objetos.length; i++) {
    //     if (objetos[i].nombre == "Reloj") {
    //         objetoReloj.textContent = objetos[i].nombre
    //         descripcionReloj.textContent = objetos[i].descripcion
    //         pistaReloj.textContent = objetos[i].pista
    //         objetos[i].ivestigado = true
    //     }

    //     if (objetos[i].nombre == "Billete de Tren") {
    //         objetoBillete.textContent = objetos[i].nombre
    //         descripcionBillete.textContent = objetos[i].descripcion
    //         objetos[i].ivestigado = true
    //     }

    //     if (objetos[i].nombre == "Nota rota") {
    //         objetoNota.textContent = objetos[i].nombre
    //         descripcionNota.textContent = objetos[i].descripcion
    //         objetos[i].ivestigado = true
    //     }

    // }

    // BUSCAR CON FIND EL OBJETO RELOJ
    const reloj = objetos.find(objeto => objeto.nombre == objetoReloj.id)
    objetoReloj.textContent = reloj.nombre
    descripcionReloj.textContent = reloj.descripcion
    pistaReloj.textContent = reloj.pista
    reloj.ivestigado = true

    // BUSCAR CON FIND EL OBJETO NOTA
    const nota = objetos.find(objeto => objeto.nombre == objetoNota.id)
    objetoNota.textContent = nota.nombre
    descripcionNota.textContent = nota.descripcion
    nota.ivestigado = true

    // BUSCAR CON FIND EL OBJETO BILLETE
    const billete = objetos.find(objeto => objeto.nombre == objetoBillete.id)
    objetoBillete.textContent = billete.nombre
    descripcionBillete.textContent = billete.descripcion
    billete.ivestigado = true
}



botonReloj.addEventListener("click", function () {
    botonReloj.disabled = true
    botonAnden.disabled = false
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

        if (this.vidasDetective === 0) {
            const sectionActiva = document.querySelector(".despacho.activa")
            sectionActiva.classList.remove("activa")
            sectionDerrota.classList.add("activa")
        }
    }

}
detective.AnadirVidas()
// detective.quitarVidas()

nombreForm.addEventListener("blur", function () {
    validarNombre(nombreForm)
})

botonAnden.addEventListener("click", function () {
    sectionDespacho.classList.remove("activa")
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
        booleanVacio1 = true
        comprobarVacios()
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
        booleanVacio2 = true
        comprobarVacios()
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
        booleanVacio3 = true
        comprobarVacios()
    } else {
        mensajevacio3.textContent = "esta mal"
        detective.quitarVidas()
        detective.AnadirVidas()
    }
})

function comprobarVacios() {
    if (booleanVacio1 && booleanVacio2 && booleanVacio3) {
        botonTaquilla.disabled = false
    } else {
        botonTaquilla.disabled = true
    }
}





function comprobarCodigoTaquilla() {
    // let numero =0;
    // numeroTaquilla.addEventListener("input",function(event){
    //     numero = event.target.value
    // })

    if (numeroTaquilla.value == 967) {
        mensajeConfirmacionTaquilla.textContent = "!!!HAS ACERTADO!!!!"
        botonRetoFinal.disabled = false;
    } else {
        mensajeConfirmacionTaquilla.textContent = "NO HAS ACERTADO SE TE QUITARA UNA VIDA"
        detective.quitarVidas()
        detective.AnadirVidas()
    }
}

botonTaquilla.addEventListener("click", function () {
    sectionDespacho.classList.remove("activa")
    sectionAnden.classList.remove("activa")
    sectionTaquilla.classList.add("activa")
})

botonRetoFinal.addEventListener("click", function () {
    sectionDespacho.classList.remove("activa")
    sectionAnden.classList.remove("activa")
    sectionTaquilla.classList.remove("activa")
    sectionRetoFinal.classList.add("activa")
})



botonComprobarTaquilla.addEventListener("click", function () {
    comprobarCodigoTaquilla()
})

botonAcusacion.addEventListener("click", function () {
    if (personajeAcusacion.value === "mecanico") {
        sectionRetoFinal.classList.remove("activa")
        sectionVictoria.classList.add("activa")
    } else {
        detective.quitarVidas()
        mensajeAcusacion.textContent = "Tu acusación no es correcta piensalo de nuevo y recuerda las pistas"

    }
})

botonInicio.addEventListener("click", function () {
    sectionDerrota.classList.remove("activa")
    sectionDespacho.classList.remove("activa")
    sectionAnden.classList.remove("activa")
    sectionTaquilla.classList.remove("activa")
    formulario.classList.add("activa")
    header.classList.add("activa")
    detective.vidasDetective = 4
    detective.AnadirVidas()
    numeroTaquilla.value = ""
    mensajeConfirmacionTaquilla.textContent = ""
    mensajevacio1.textContent = ""
    mensajevacio2.textContent = ""
    mensajevacio3.textContent = ""
    senales.appendChild(senalViaLibre)
    senales.appendChild(senalPrecaucion)
    senales.appendChild(senalAlto)
    detective.nombre = ""
})
