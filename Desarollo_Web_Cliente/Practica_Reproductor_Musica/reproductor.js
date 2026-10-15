const canciones = [
{ id: 1, titulo: "Blues Ballad", artista: "Alec Koff", icono: "♩",
favorita: false, archivo: "audio/cancion-1.mp3" },
{ id: 2, titulo: "Comedy Cartoon", artista: "Starostin", icono: "☺",
favorita: false, archivo: "audio/cancion-2.mp3" },
{ id: 3, titulo: "Wonders of the Earth", artista: "Grand Project", icono: "☀",
favorita: false, archivo: "audio/cancion-3.mp3" },
{ id: 4, titulo: "Football", artista: "SigmaMusicArt", icono: "⚑",
favorita: false, archivo: "audio/cancion-4.mp3" },
{ id: 5, titulo: "Sports Rock Music", artista: "LnPlusMusic", icono: "⚡",
favorita: false, archivo: "audio/cancion-5.mp3" }
];
const listaCanciones = document.getElementById("lista-canciones");
const buscador = document.getElementById("buscador");
const botonPlay = document.getElementById("boton-play");
const botonSiguiente = document.getElementById("boton-siguiente");
const ahoraSuenaTitulo = document.getElementById("ahora-suena-titulo");
const ahoraSuenaArtista = document.getElementById("ahora-suena-artista");
const ahoraSuenaIcono = document.getElementById("ahora-suena-icono");
const favoritasLista = document.getElementById("favoritas-lista");
const resumenFavoritas = document.getElementById("resumen-favoritas");
const audioCancion = document.getElementById("audio-cancion");



const reproductor = {
    cancionActual : null,
    reproduciendo : false,
    favoritas: [],

    reproducirCancion:(function(cancion){
        this.cancionActual = cancion
        this.reproduciendo = true
        audioCancion.setAttribute("src",cancion.archivo)
        audioCancion.currentTime = 0
        audioCancion.play()
        pintarAhoraSuena()
    }),

    meterFavoritas:function(cancion){
        this.favoritas.push(cancion)
    },

    quitarFavoritas:function(cancion){
        this.favoritas.pop(cancion)
    },

    pausar:(function(){
            this.reproduciendo = false
            audioCancion.pause()
            pintarAhoraSuena()
    }),

    continuar:(function(){
        this.reproduciendo = true;
        audioCancion.play()
        pintarAhoraSuena()
    }),

    siguiente:(function(){
         const id = Math.floor(Math.random()*canciones.length)
         canciones.forEach(cancion => {
            if(cancion.id == id +1){
                this.reproducirCancion(cancion)
            }
         });
    })


}

listaCanciones.addEventListener("click",function(event){
    if(event.target.classList.contains("btn-reproducir")){
        const id = Number(event.target.id.replace("reproducir-",""))
        const cancion = canciones.find(cancion => {return cancion.id == id})
        reproductor.reproducirCancion(cancion)
    }

    if(event.target.classList.contains("btn-like")){
         const id = Number(event.target.id.replace("like-",""))
         const elemento = document.querySelector("#cancion-" +id)
         const cancion = canciones.find(cancion => {return cancion.id == id})
         cancion.favorita = !cancion.favorita
         elemento.classList.toggle("favorita-activa")
         event.target.textContent = cancion.favorita ? "❤" : "♡"

         if(cancion.favorita){
            reproductor.meterFavoritas(cancion)
            resumenFavoritas.textContent = reproductor.favoritas.length + " favoritos"
            listaFavoritos()
         }else{
            reproductor.quitarFavoritas(cancion)
            resumenFavoritas.textContent = reproductor.favoritas.length + " favoritos"
            listaFavoritos()
         }
    }

    
})



function pintarAhoraSuena(){
    ahoraSuenaTitulo.textContent = reproductor.cancionActual.titulo
    ahoraSuenaArtista.textContent = reproductor.cancionActual.artista
    ahoraSuenaIcono.textContent = reproductor.cancionActual.icono

    if(reproductor.reproduciendo){
        botonPlay.textContent = "‖"
    }else{
        botonPlay.textContent = "▶"
    }
}

botonPlay.addEventListener("click", function(){
    if(reproductor.cancionActual == null){
        const id = Math.floor(Math.random()*canciones.length)
        const cancion = canciones.find(cancion =>{return cancion.id == id})
        reproductor.reproducirCancion(cancion)
        
    }else{
        if(reproductor.reproduciendo){
            reproductor.pausar()
        }else{
            reproductor.continuar()
        }
    }
})

botonSiguiente.addEventListener("click",function(){
     reproductor.siguiente()
})

buscador.addEventListener("input", function(event){
    const texto = event.target.value.toLowerCase()
    canciones.forEach(cancion => {
        const cancionrecorida = document.getElementById("cancion-" + cancion.id)
        const titulo = cancionrecorida.querySelector("h3")
        const coincide = titulo.textContent.toLowerCase().includes(texto)
        cancionrecorida.classList.toggle("oculta",!coincide)
    });

})

function listaFavoritos(){
    favoritasLista.innerHTML = ""
    reproductor.favoritas.forEach(favorita => {
        const elementoLista = document.createElement("p")
        elementoLista.textContent = favorita.titulo;
        favoritasLista.append(elementoLista)
    });
}

