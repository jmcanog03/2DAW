
const precioMenosDeVeinte = precio.some(function(precio){
    if(precio < 20) return precio
})

console.log(precioMenosDeVeinte)

const precioOrdenar = [...precio].sort(function(a,b){
    return a - b
})

console.log(precioOrdenar)
console.log(precio)