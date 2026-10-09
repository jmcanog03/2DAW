const productos = [
  { id: 1, nombre: "Teclado mecánico", precio: 45, favorito: false },
  { id: 2, nombre: "Ratón inalámbrico", precio: 20, favorito: false },
  { id: 3, nombre: "Monitor 24\"", precio: 180, favorito: false },
  { id: 4, nombre: "Auriculares", precio: 60, favorito: false },
  { id: 5, nombre: "Webcam HD", precio: 35, favorito: false }
];

// Referencias a elementos de la página (ya están listas, no hace falta tocarlas)
const rejilla = document.getElementById("rejilla-productos");
const buscador = document.getElementById("buscador");
const carritoLista = document.getElementById("carrito-lista");
const carritoContador = document.getElementById("carrito-contador");
const carritoTotal = document.getElementById("carrito-total");
const vaciarBtn = document.getElementById("vaciar-carrito");


