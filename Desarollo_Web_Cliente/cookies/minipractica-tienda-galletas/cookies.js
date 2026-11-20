/*
 * cookies.js — Librería para trabajar con cookies
 * DWEC · 2º DAW · UT4 Almacenamiento en el navegador · Curso 2026/2027
 *
 * CÓMO SE INCLUYE: en el HTML, ANTES de tu propio código.
 *   <script src="cookies.js"></script>
 *   <script src="app.js"></script>
 *
 * CÓMO SE USA:
 *   setCookie("usuario", "Ana");                 // cookie de sesión
 *   setCookie("idioma", "es", { dias: 30 });     // cookie persistente (30 días)
 *   getCookie("idioma");                         // "es"  (o null si no existe)
 *   deleteCookie("idioma");                      // la borra
 *   getAllCookies();                             // { usuario: "Ana" }
 *
 * RECUERDA:
 *   - El tercer parámetro de setCookie es opcional y va ENTRE LLAVES: { dias: 30 }.
 *   - getCookie devuelve siempre texto (o null): "true", "5"... nunca true ni 5.
 *   - La librería ya codifica y decodifica: no uses encodeURIComponent por fuera.
 *   - Para guardar objetos o arrays: setCookie("x", JSON.stringify(obj)) y JSON.parse(getCookie("x")).
 */

// Crea o modifica una cookie.
//   nombre, valor: texto (el valor se convierte a texto si no lo es).
//   opciones (opcional):
//     dias     -> número de días que dura. Si no se pone, es una cookie de sesión.
//     path     -> ruta donde es visible. Por defecto "/" (todo el sitio).
//     sameSite -> "Lax" (por defecto), "Strict" o "None".
//     secure   -> true para que solo viaje por HTTPS.
function setCookie(nombre, valor, { dias, path = "/", sameSite = "Lax", secure = false } = {}) {
  let cookie = `${encodeURIComponent(nombre)}=${encodeURIComponent(valor)}; path=${path}; SameSite=${sameSite}`;
  if (dias !== undefined) {
    cookie += `; max-age=${Math.round(dias * 24 * 60 * 60)}`;
  }
  if (secure) {
    cookie += "; Secure";
  }
  document.cookie = cookie;
}

// Devuelve el valor de una cookie, o null si no existe.
function getCookie(nombre) {
  const clave = encodeURIComponent(nombre) + "=";
  for (const par of document.cookie.split("; ")) {
    if (par.startsWith(clave)) {
      return decodeURIComponent(par.substring(clave.length));
    }
  }
  return null;
}

// Borra una cookie. El path tiene que ser el mismo con el que se creó (por defecto "/").
function deleteCookie(nombre, path = "/") {
  document.cookie = `${encodeURIComponent(nombre)}=; path=${path}; max-age=0`;
}

// Devuelve todas las cookies visibles como un objeto { nombre: valor }.
function getAllCookies() {
  const resultado = {};
  if (document.cookie === "") return resultado;
  for (const par of document.cookie.split("; ")) {
    const pos = par.indexOf("=");
    const nombre = decodeURIComponent(par.substring(0, pos));
    const valor = decodeURIComponent(par.substring(pos + 1));
    resultado[nombre] = valor;
  }
  return resultado;
}
