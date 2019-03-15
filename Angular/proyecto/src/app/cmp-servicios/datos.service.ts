import { Injectable, EventEmitter } from '@angular/core';
import { LogService } from './log.service';

@Injectable({
  providedIn: 'root'
})
export class DatosService {
  datos = ["dato1"];
  constructor(private logService: LogService) { }
  datoEmitido= new EventEmitter<string>();
  getDatos(){
    return this.datos;
  }
  setDato(nuevoDato: string){
    this.datos.push(nuevoDato);
    this.logService.mostrarMsg("Se ha añadido " + nuevoDato)
  }
  sendDato(dato: string){
    this.datoEmitido.emit(dato);
  }
}
