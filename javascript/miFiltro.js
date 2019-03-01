

function palindromo(mensaje){
    mensaje = mensaje.toLowerCase().replace(/ /g, "");
    array = mensaje.split("");
    array = array.reverse();
    mensaje2 = array.join("");
    return mensaje == mensaje2;
}

array = [1,2,3,4,5];
array2 = [1,2,3,4,5,6,7,8,9,10];

function miFiltro(array, miFuncion) {
    const resultado = [];
    array.forEach(function(elem){
        if(miFuncion(elem)){
            resultado.push(elem);
        }
    });
    return resultado;
 }
 
 console.log(miFiltro(["a b a","a a","a c"],palindromo));
