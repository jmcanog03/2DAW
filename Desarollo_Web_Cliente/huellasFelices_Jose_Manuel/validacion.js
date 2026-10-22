const nombre = document.getElementById("campo-nombre");
const email = document.getElementById("email");
const telefono = document.getElementById("campo-telefono");
const edad = document.getElementById("campo-edad");
const tipoMascota = document.getElementById("campo-mascota");
const checkbox = document.getElementById("checkbox-compromiso");
function validarNombre(campo) {
    const campo = campo.checkValidity();
    nombre = campo.trim()
    if (!nombre.equals("")) {
         campo.classList.toggle("valido", valido);
    }else{
         campo.classList.toggle("invalido", !valido);
    }
    return valido;
}

function validarEmail(email) {
    const valido = email.checkValidity();

    email.classList.toggle("valido", valido);
    email.classList.toggle("invalido", !valido);

    return valido;
}


function validarTelefono(telefono) {
    const digitoTelefono = telefono.value;
    const valido = telefono.checkValidity();
    for (let i = 0; i < digitoTelefono.length; i++) {

        if(digitoTelefono[i] >= "0" && digitoTelefono[i]<="9" ){
            telefono.classList.toggle("valido" ,valido);
        }else{
            telefono.classList.toggle("invalido",!valido);
        }
    }

    return valido;
}

function validarEdad(edad){
    const valido = edad.checkValidity()
    if(edad.value >=18){
        edad.classList.toggle("valido",valido);
    }else{
        edad.classList.toggle("invalido",!valido);
    }

    return valido;
}

function validarMascota(mascota){
    const valido = mascota.checkValidity();
    mascota.classList.toggle("valido",valido);
    mascota.classList.toggle("invalido",!valido);

    return valido;
}

function validarPreviaMascota(){
    const seleccionado = document.querySelector('input[name="experiencia"]:checked');
    
    if(!seleccionado){
        return null;
    }else{
        return seleccionado.value;
    }
}

function validarChecbox(){

    if(!checkbox.cheked){
        return null;
    }else{
        return checkbox.value;
    }
}


nombre.addEventListener("blur",function(){
    validarNombre(nombre)
})

email.addEventListener("blur",function(){
    validarEmail(email)
})

telefono.addEventListener("blur",function(){
    validarTelefono(telefono)
})

edad.addEventListener("blur",function(){
    validarEdad(edad)
})

tipoMascota.addEventListener("blur",function(){
    validarMascota(tipoMascota)
})

checkbox.addEventListener("blur",function(){
    validarChecbox(checkbox);
})





