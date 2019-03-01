//funciones autoejecutables

(function() {
    console.log("funcion autoejecutable");
}());

!!function() {
    console.log("funcion autoejecutable");
}();

var fn = function() {
    console.log("funcion autoejecutable con nombre");
}();

!!function (algo) {
    console.log("funcion autoejecutable " + algo);
}("algo");

/*objetos*/

const coche = {
    marca: "Tesla",
    modelo: "Model S3",
    color: "Negro"
};

let prop = "marca";

console.log(coche.marca);//normal
console.log(coche['marca']);// no deberia usarse
console.log(coche[prop]);// usar cuando el atributo al que queremos acceder esta en una variable

console.log(coche.color);
coche.color = "Blanco";
console.log(coche.color);

delete coche.modelo;
console.log(coche.modelo);
coche.modelo = "Model S"
console.log(coche.modelo);

coche.conductor = "Melon Musk"
console.log(coche);

coche.pitar = function() {
    console.log("Piiiiiiiiiiiiiiii");
}

 coche.pitar();

 function Coche(marca, modelo, sonido, color) {
     this.marca = marca;
     this.modelo = modelo;
     this.sonido = sonido;
     this.color = color;
     /*this.pitar = function() {
         console.log(this.sonido);
     }*/
 }

 Coche.prototype.pitar = function() {
    console.log(this.sonido);
}

 let seat = new Coche("seat", "ibiza", "piiiiipoooooo", "verde");
 let bmw = new Coche("bmw", "120", "PIII", "rosa");

 console.log(seat);
 seat.pitar();
 console.log(bmw);
 bmw.pitar();

 const nombre = "yo";
 const apellidos = "ape llidos";

 console.log(`Me llamo:
    Nombre: ${nombre}
    Apellidos: ${apellidos}
 `);

 a = function(){
     console.log('a');
 }

 b = () => {
     console.log('b');
 }

 c= num => {
    console.log('c');
 }

 d = (num,pos) => {
    console.log('d');
 }

 e = (n1,n2) => {
     return n1+n2;
 }

 f = (n1,n2) => n1+n2;

 function getNumLoteria(n1,...nums){
     console.log(`Sorteo: ${n1} -- ${nums.sort().join(",")}`);
 }

 getNumLoteria(2,3,4,5,6,23);