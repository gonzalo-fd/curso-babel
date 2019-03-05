function Serie(titulo, episodiosTotales, episodiosvistos, finalizada){
    this.titulo = titulo;
    this.episodiosTotales = episodiosTotales;
    this.episodiosvistos = episodiosvistos;
    this.finalizada = finalizada;
};

Serie.prototype.episodiosRestantes = function() {
   return this.episodiosTotales - this.episodiosvistos;
}

let series = [new Serie("GOT", 50, 30, false), new Serie("Sherlock", 20, 20, true), 
new Serie("Friends", 100, 100, true), new Serie("Breaking Bad", 80, 30, false)];

/*function finalizadas (){

let fin = [];
    for (let i = 0; i < series.length; i++) {
        if(!series[i].finalizada)
            fin.push(series[i]);
    }
    return fin;
}*/
/*
 let finalizadas = series.filter(elem => {
        return !elem.finalizada;
    });
*/

function finalizadas(){
    return series.filter(function(elem){
        return !elem.finalizada;
    })

}

console.log(finalizadas());

texto = "Paco viene con las rebajas"
t1 = texto.replace("a", "*");
t2 = texto.replace(/a/g, "*");

console.log(t1, t2);