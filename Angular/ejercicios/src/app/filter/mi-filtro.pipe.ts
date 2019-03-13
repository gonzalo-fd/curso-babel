import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'miFiltro'
})
export class MiFiltroPipe implements PipeTransform {

  transform(value: string, arg1: string, arg2: string, arg3: string): any {
    let texto = value.split("");
    let sustituir = arg1.split("");
    let eliminar = arg3.split("");
    let j = 0;
    let k = 0;
    let resultado = [];
    let condicion = true;
    for (const i of texto) {
        if(i == sustituir[j]){
          j++;
          if(j == sustituir.length){
            resultado.push(arg2);
          }
        }
        else if(i == eliminar[k]){
          k++;
          if(j == eliminar.length){
            condicion = false;
          }
          
        }
        else{
          j=0;
          k=0;
          if(condicion){
            resultado.push(i);
            condicion = true;
          }
        }
      }
    return resultado.join("");
  }
}
