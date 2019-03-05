function play(){
    let puntuacion = 0;
    let puntCasa = 0;
    let confirmacion = true;
    
    do {
         confirmacion = confirm(`Tu puntuación es ${puntuacion} , quieres sacar otra carta?`);
        if(confirmacion)
            puntuacion += Math.floor((Math.random()*10)+1);
    }while(confirmacion && puntuacion <= 20)
    
    if(puntuacion > 20)
        console.log(`Te pasas de 20, pierdes. Puntuacion: ${puntuacion}`);
    else{
        do {
            puntCasa += Math.floor((Math.random()*10)+1);
       }while(puntCasa < 17)

       if(puntCasa > 20)
            console.log(`La maquina se pasa. Ganas
            Tu puntuacion: ${puntuacion}
            Puntuacion maquina: ${puntCasa}`);

        else if(puntCasa > puntuacion){
            console.log(`La maquina gana.
            Tu puntuacion: ${puntuacion}
            Puntuacion maquina: ${puntCasa}`);
        }
        else{
            console.log(`Ganas
            Tu puntuacion: ${puntuacion}
            Puntuacion maquina: ${puntCasa}`);
        }
    }
    
}