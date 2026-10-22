const nombre = document.getElementById("campo-nombre");
const email = document.getElementById("campo-email");
const telefono = document.getElementById("campo-telefono");
const edad = document.getElementById("campo-edad");
const tipoMascota = document.getElementById("campo-mascota");
const checkbox = document.getElementById("checkbox-compromiso");
const formulario = document.getElementById("formulario-adopcion");
const botonAdoptar = document.getElementById("boton-adoptar")
const panel = document.getElementById("panel-confirmacion")
const textoConfirmacion = document.getElementById("texto-confirmacion")
function validarNombre(nombre) {
    const campo = nombre.checkValidity();

    if (nombre.value != nombre.value.trim()) {
        nombre.classList.toggle("invalido", !campo);
    } else {
        nombre.classList.toggle("valido", campo);
    }

}

function validarEmail(email) {
    const valido = email.checkValidity();

    email.classList.toggle("valido", valido);
    email.classList.toggle("invalido", !valido);

    return valido;
}


function validarTelefono(telefono) {
    let digitoTelefono = telefono.value;
    let valido = telefono.checkValidity();
    let esCierto = true;
    for (let i = 0; i < digitoTelefono.length; i++) {

        if (digitoTelefono[i] == "0" || digitoTelefono[i] == "1" || digitoTelefono[i] == "2" || digitoTelefono[i] == "3" || digitoTelefono[i] == "4" || digitoTelefono[i] == "5" || digitoTelefono[i] == "6" || digitoTelefono[i] == "7" || digitoTelefono[i] == "8" || digitoTelefono[i] == "9") {
            esCierto
        } else {
            esCierto = false
        }
    }

    if (digitoTelefono.length == 9 && esCierto) {
        telefono.classList.toggle("valido", valido);
        telefono.classList.toggle("invalido", !valido);
        
    } else {
        
        telefono.classList.toggle("invalido", valido);
        telefono.classList.toggle("valido", !valido);
    }

    
}

function validarEdad(edad) {
    const valido = edad.checkValidity()
    if (edad.value >= 18) {
        edad.classList.toggle("valido", valido);
        edad.classList.toggle("invalido", !valido);
    } else {
        edad.classList.toggle("valido", !valido);
        edad.classList.toggle("invalido", valido);
    }

    return valido;
}

function validarMascota(mascota) {
    const valido = mascota.checkValidity();
    mascota.classList.toggle("valido", valido);
    mascota.classList.toggle("invalido", !valido);

    return valido;
}

function validarPreviaMascota() {
    const seleccionado = document.querySelector('input[name="experiencia"]:checked');

    if (!seleccionado) {
        return null;
    } else {
        return seleccionado.value;
    }
}

function validarChecbox() {

    if (!checkbox.cheked) {
        return null;
    } else {
        return checkbox.value;
    }
}


nombre.addEventListener("blur", function () {
    validarNombre(nombre)
    comprobarFormulario()
})

email.addEventListener("blur", function () {
    validarEmail(email)
    comprobarFormulario()
})

telefono.addEventListener("blur", function () {
    validarTelefono(telefono)
    comprobarFormulario()
})

edad.addEventListener("blur", function () {
    validarEdad(edad)
    comprobarFormulario()
})

tipoMascota.addEventListener("blur", function () {
    validarMascota(tipoMascota)
    comprobarFormulario()
})



function comprobarFormulario() {
    if (nombre.classList.contains("valido") && email.classList.contains("valido") &&
        edad.classList.contains("valido") && telefono.classList.contains("valido") && tipoMascota.classList.contains("valido") && validarPreviaMascota() != null && checkbox.checked) {
        botonAdoptar.disabled = false;
        botonAdoptar.classList.add("activo")
    } else {
        botonAdoptar.disabled = true;
        botonAdoptar.classList.remove("valido")
    }
}

formulario.addEventListener("submit",function(event){
    event.preventDefault()
    panel.classList.add("visible")
    textoConfirmacion.textContent = nombre.value + " Gracias por tu solicitud"
    formulario.reset()
    nombre.classList.remove("valido")
    nombre.classList.remove("invalido")

    email.classList.remove("valido")
    email.classList.remove("invalido")

    edad.classList.remove("valido")
    edad.classList.remove("invalido")

    telefono.classList.remove("valido")
    telefono.classList.remove("invalido")

    tipoMascota.classList.remove("valido")
    tipoMascota.classList.remove("invalido")

    botonAdoptar.disabled = true;
})




