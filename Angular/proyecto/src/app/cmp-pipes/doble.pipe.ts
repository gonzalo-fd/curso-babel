import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'doble'
})
export class DoblePipe implements PipeTransform {

  transform(value: number, arg1?: any, arg2?: number): number {
    let res = value * 2;
    if(arg1){
      res +=arg1;
    }
    if(arg2){
      res -=arg2;
    }
    return res;
  }

}
