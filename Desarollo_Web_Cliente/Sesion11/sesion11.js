// Ejercicio1
function crearProducto(nombre) {
    const nuevoElemento = document.createElement("li")
    nuevoElemento.classList.add("producto")
    nuevoElemento.textContent = nombre
    return nuevoElemento;
}

function anadirProductos(nombre) {
    const lista = document.getElementById("lista-productos")
    lista.append(crearProducto(nombre))
}

function buscarProductoPorTexto(texto) {
    const lista = document.querySelectorAll(".producto")

    for (const p of lista) {

        if (p.textContent == texto) {
            return p
        }
    }

    return null;


}

function marcarAgotado(texto) {
    const elemento = buscarProductoPorTexto(texto)
    if (elemento != null) {
        elemento.classList.add("agotado")
    }
}


// marcarAgotado("Teclado mecánico")







