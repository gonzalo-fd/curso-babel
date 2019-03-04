import Mascota from './mascota.mjs';
// const Masc = require('./mascota.mjs');
class Coche {
    constructor(marca, modelo, sonido, color, dueño) {
        this.marca = marca;
        this.modelo = modelo;
        this.sonido = sonido;
        this.color = color;
        var _dueño = dueño;
        this.getDueño = () => {
            return _dueño;
        }
        this.setDueño = (dueño) => {
            _dueño = dueño;
        }
    }
    pitar() {
        console.log(this.sonido);
    }

    static getNumRuedas() {
        return 4;
    }
}

const audi = new Coche('Audi', 'A4', 'piiiiiiii', 'negro', 'yo');
audi.pitar();
console.log(audi.marca);
console.log(Coche.getNumRuedas());
console.log(audi.getDueño());
audi.setDueño('feo');
console.log(audi.getDueño());

class Rectangulo {
    constructor(lado, altura) {
        this.lado = lado;
        this.altura = altura;
    }
    getArea() {
        return this.lado * this.altura;
    }
}

class Cuadrado extends Rectangulo {
    constructor(lado) {
        super(lado, lado);
    }
}

const c1 = new Cuadrado(3);
console.log(c1.getArea());

const perro = new Mascota("Luca", "gloton");
const gato = new Mascota("Isis", "demonio");
console.log(perro);