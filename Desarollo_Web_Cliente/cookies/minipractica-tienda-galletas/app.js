// Minipráctica · La tienda de galletas (UT4 Cookies, sesiones 1 y 2)
// Abre la página con Live Server. Las funciones de cookies.js ya están disponibles:
// setCookie, getCookie, deleteCookie y getAllCookies (mira el principio de cookies.js).

const PRECIOS = { chocolate: 1.5, avena: 1.2, mantequilla: 1.0, canela: 1.3 };

const saludo = document.querySelector("#saludo");
const formNombre = document.querySelector("#form-nombre");
const inputNombre = document.querySelector("#nombre");
const listaCesta = document.querySelector("#cesta");
const total = document.querySelector("#total");
const tbody = document.querySelector("#tabla-cookies tbody");

// ---------------------------------------------------------------- 1 · Saludo
// Si existe la cookie "nombre", muestra "Hola de nuevo, <nombre>".
// Si no, muestra "Hola. ¿Cómo te llamas?".
function mostrarSaludo() {
  const nombre = getCookie("nombre")
  if (nombre != null) {
    saludo.textContent = "Hola de nuevo, " + nombre
  } else {
    saludo.textContent = "Hola ¿Como te llamas?"
  }
}


formNombre.addEventListener("submit", (e) => {
  e.preventDefault();
  const nombre = inputNombre.value.trim()
  if(nombre === "") return;
  setCookie("nombre", nombre,  { dias: 30 })
  mostrarSaludo()
  mostrarCookies()
});

// ---------------------------------------------------------------- 2 y 3 · Cesta
// La cesta es un array de productos, por ejemplo ["chocolate", "avena", "chocolate"],
// guardado en UNA cookie de SESIÓN llamada "cesta" con JSON.stringify.

const cesta = document.cookie = "cesta=" + encodeURIComponent(JSON.stringify(PRECIOS))
// Devuelve el array guardado, o [] si no hay cesta.
function leerCesta() {
  const texto = getCookie("cesta")
  if(texto === null){
    return [];
  }
  return JSON.parse(texto)
}

// Guarda el array en la cookie "cesta" (de sesión).
function guardarCesta(cesta) {
  setCookie("cesta",JSON.stringify(cesta))
}

// Pinta la cesta (un <li> por producto) y el total con 2 decimales.
// Pista: total.toFixed(2).replace(".", ",") + " €"
function mostrarCesta() {

}

document.querySelectorAll("#productos button").forEach((boton) => {
  boton.addEventListener("click", () => {
    // TODO: añade boton.dataset.producto a la cesta, guárdala y actualiza la página.
  });
});

document.querySelector("#vaciar").addEventListener("click", () => {
  // TODO: borra la cookie "cesta" y actualiza la página.
});

// ---------------------------------------------------------------- 4 · Mis cookies
// Pinta una fila por cada cookie (getAllCookies). Usa textContent, no innerHTML.
function mostrarCookies() {
  // TODO
}

// ---------------------------------------------------------------- Al cargar
mostrarSaludo();
mostrarCesta();
mostrarCookies();
