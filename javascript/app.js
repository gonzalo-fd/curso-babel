console.log("Hola mundo");
num = 4;
num = 'Un num' // ; opcional
console.log(num);
var textto = "un texto";
let  otroTexto = "otro texto";
const UNTEXTO = "un texto"; //constante

// var vs let

var n = 1;
let m = 1;
let j;
console.log(j);

if(true){
    h = 10;
    var n = 2;
    let m = 2;

    console.log('dentro: ' + n);
    console.log('dentro: ' + m);
}

console.log('fuera: ' + n);
console.log('fuera: ' + m);

console.log('paco dijo \'hail hydra\'');
console.log("paco dijo 'hail hydra'");


let colores = ["blanco", "gris", "negro"];
colores.push("naranja");
colores[0]= "verde";
colores[4]= "caqui";
colores[6]= "blanco"
console.log(colores);

//console.dir(document.querySelector('h1'));// info sobre h1

for (let i = 0; i < colores.length; i++) {
    console.log(colores[i]);
}

for (let i in colores){//la i guarda posicion
    console.log(colores[i]);
}

for (let i of colores){// la i guarda el color
    console.log(i);
}

let persona = {
    nombre: "Robb",
    apellido: "stark"
};

for (let i in persona){
    console.log(i);
}

for (let i of Object.values(persona)){
    console.log(i);
}

const nums = [1,2,3,4];

const numsX2 = nums.map(function(num){
    return num * 2;
});
console.log(numsX2);

const numsMenoresA7 = numsX2.filter(function(num){
    return num < 7;
});
console.log(numsMenoresA7);

const suma = nums.reduce(function(acc, num){
    return acc += num;
},10)
