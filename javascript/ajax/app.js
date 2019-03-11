const URL_GENEROS = " https://ejemplos-dc1c1.firebaseio.com/generos.json"
const URL_PELICULAS = " https://ejemplos-dc1c1.firebaseio.com/peliculas/"

function getDatos() {
    let xhr = new XMLHttpRequest();
    xhr.open('GET', URL_GENEROS);
    xhr.addEventListener('readystatechange', () => {
        if(xhr.readyState === 4) {
            console.log(xhr.responseText);
            const generos = JSON.parse(xhr.responseText);
            const opcion = prompt(`Elige generos de peliculas: 0 (Terror) o 1 (Action)`);
            const generoElegido = generos[parseInt(opcion)];
            let span = document.getElementById('tipo');
            span.textContent = generoElegido;//toTittleCase();
            getPeliculas(generoElegido);
        }
    });
    xhr.send();
}

function getPeliculas(genero){
    const xhr = new XMLHttpRequest();
    xhr.open("GET", URL_PELICULAS+`${genero}.json`);
    xhr.addEventListener('readystatechange', () => {
        if (xhr.readyState === 4){
            let peliculas = JSON.parse(xhr.responseText);
            peliculas = Object.values(peliculas)[0];
            let ul = document.getElementById('lista-peliculas');
            ul.innerHTML = peliculas.map(elem => `<li>${elem}</li>`).join('');
        }
    });
    xhr.send();
}

function getGenerosProm() {
    return fetch(URL_GENEROS)
    .then(res => {
        return res.json();
    })
}

function getPeliculasProm(genero) {
    return fetch(URL_PELICULAS+`${genero}.json`)
    .then(res => {
        return res.json();
    })
}

//getGenerosProm()
function start(){
   return new Promise((resolve, reject) => {
    setTimeout(() => {function findOdd(A) {
let array = [];
  for(let i = 0; i < A.lenght; i++){
   //var coche = {"color":"rojo","marca":"seat","modelo":"leon"};
   //var coche = {color:"rojo",CV:100,AC:true};
   array[A[i]]++;
  }
  return 0;
}
        resolve('Mi promesa funciona');
        reject('Mi promesa no funciona');
    }, 3000)
    });
}

start()
    .then(msg => {
        console.log(msg);
        return getGenerosProm();
    })
.then(generos => {
    const opcion = prompt(`Elige generos de peliculas: 0 (Terror) o 1 (Action)`);
            const generoElegido = generos[parseInt(opcion)];
            let span = document.getElementById('tipo');
            span.textContent = generoElegido;
            return getPeliculasProm(generoElegido);
})
.then(peliculas => {
    peliculas = Object.values(peliculas)[0];
    let ul = document.getElementById('lista-peliculas');
    ul.innerHTML = peliculas.map(elem => `<li>${elem}</li>`).join('');
})
.catch (err => {
    console.log(err);
});

