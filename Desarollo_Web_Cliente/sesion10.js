const cambiarTitulo = document.getElementById("titulo").textContent="Tienda de Informatica . Liquidación total";

console.log(cambiarTitulo)

const aviso = document.querySelector(".destacado")

aviso.innerHTML = ("<strong>Envio Gratis</strong>")

const enlace = document.getElementById("enlace");
console.log(enlace.getAttribute("href"));

const cambioEnlace = document.getElementById("enlace")

cambioEnlace.setAttribute("href","mailto:ofertas@ejemplo.com")

console.log(cambioEnlace.getAttribute("href"))

const cambiarImagen = document.getElementById("foto")

cambiarImagen.setAttribute("src","monitor.jpg")
cambiarImagen.setAttribute("alt","Monitor en Oferta")

console.log(cambiarImagen.getAttribute("src"))

// const avisar = document.getElementById("aviso")

// avisar.classList.remove("oculto")

// avisar.classList.add("destacado")

// avisar.classList.toggle("oculto")
// avisar.classList.toggle("oculto")

const agotar = document.querySelectorAll(".agotado")

agotar.forEach(function(agotado,indice){
    agotar[indice].classList.add("caja-aviso")
})


const avisar = document.getElementById("aviso");
// aviso.className = "destacado";
avisar.classList.add("destacado")
avisar.classList.remove("oculto")
// aviso.classList.add("caja-aviso")