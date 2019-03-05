
// var parrafos = document.querySelectorAll('body p');
// let li = document.createTextNode('<li>2</li>');
// lista.appendChild(li);

function editList(){
    let lista = document.getElementById('lista');
    console.log(lista);
    lista.removeChild(lista.children[2]);

    var li = document.createElement("LI");
    var t = document.createTextNode("2");      
    li.appendChild(t);                          
    lista.insertBefore(li, lista.children[1]);
    var li2 = document.createElement("LI");
    var t2 = document.createTextNode("4");
    li2.appendChild(t2);                               
    lista.insertBefore(li2, lista.children[3]);
}

carr();

function carr(){
    let pos = 0;
    let img = document.getElementById("img");
    let izq = document.getElementById("izq");
   let botonIzq = izq.addEventListener('click', function (event) {
    if(pos == 0)
        pos = 2;
    else
        pos--;
    
    if(pos == 0)
        img.src="homer 1.PNG";
    else if(pos == 1)
        img.src="homer 2.PNG";
    else if(pos == 2)
        img.src="homer 3.PNG";
        
    })

    let der = document.getElementById("der");
   let botonDer = der.addEventListener('click', function (event) {
    if(pos == 2)
        pos = 0;
    else
        pos++;
    
    if(pos == 0)
        img.src="homer 1.PNG";
    else if(pos == 1)
        img.src="homer 2.PNG";
    else if(pos == 2)
        img.src="homer 3.PNG";
        
    })
}