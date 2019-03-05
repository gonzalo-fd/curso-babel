let num = Math.floor(Math.random()*51);
let guess;
let cont = 0;
let ok = true;
do{
    do{
        guess = prompt("Introduce un numero entre 0 y 50: ");
        
        if(guess < 0 || guess > 50 ){
            console.log("Introduce un numero entre 0 y 50");
        }
        else{
            if(num < guess){
                console.log(guess +" es mayor");
            }
            if(num > guess){
                console.log(guess +" es menor");
            }
            cont++;
        }
    }while(num != guess || guess < 0 || guess > 50);

    console.log("Has acertado");
    console.log("Intentos: " + cont);
    ok = confirm("Volver a jugar?");
}while(ok);