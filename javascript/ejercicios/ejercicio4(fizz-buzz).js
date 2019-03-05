let numero = prompt("numero: ");
let mensaje = "";

if(numero%3 == 0){
    mensaje += "Fizz";
}
if(numero%5 == 0){
    mensaje += "Buzz"
}

console.log(numero + " " + mensaje);