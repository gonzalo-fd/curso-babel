window.onload = function() {// o esto o importar el script al final del html(mejor al final)
let h1 = document.querySelector('h1');
console.log(h1);

let listItems = document.getElementsByClassName('mascota');
console.log(listItems[0]);

let listItemPerro = document.querySelector('li');
console.log(listItemPerro);



};

const ul = document.querySelector('ul');
ul.innerHTML += "<li>Pez</li>";
function guardarMascota() {
    let inputNuevaMascota = document.getElementById('input-mascota');
    console.dir(inputNuevaMascota);
    console.log(inputNuevaMascota.value);
}

function cambiarTitulo(nuevoTitulo) {
    let h1 = document.querySelector('h1');
    console.log(h1);
    h1.textContent = nuevoTitulo;
}



/* consola
let listaItems = document.querySelectorAll(".currency-name-container.link-secondary");
let nombreMonedas = [];
for (let item of listaItems) {
    nombreMonedas.push(item.textContent);
};
nombreMonedas.sort(); */

function addEventListenersToListItems() {
    let listI = document.getElementsByTagName('li');
    for (let li of listI) {
        // li.onclick = function (event) {
        //     console.log(event);
        //     let elementLi = event.target;
        //     cambiarTitulo(elementLi.textContent);
        // }
        li.addEventListener('click', function (event) {
            console.log(event);
            let elementLi = event.target;
            cambiarTitulo(elementLi.textContent);
        })
        li.addEventListener('click', function (event) {
            let elementLi = event.target;
           console.log(elementLi.textContent);
        })
    }
}

function addMascota(){
    const tt = document.getElementById("btn-guardar");
   let boton = tt.addEventListener('click', function () {
    const aa = document.getElementById("input-mascota");
        ul.innerHTML += `<li> ${ aa.value } </li>`;
    })
}

