import { Component, OnInit } from '@angular/core';
import { DatosService } from '../datos.service';

@Component({
  selector: 'app-cmp-b',
  templateUrl: './cmp-b.component.html',
  styleUrls: ['./cmp-b.component.css'],
  // providers: [
  //   DatosService
  // ]
})
export class CmpBComponent implements OnInit {

  datos = [];
  datoRecibido="";
  constructor(private datosService: DatosService) { }
  ngOnInit() {
    this.datos= this.datosService.getDatos();
    this.datosService.datoEmitido.subscribe(dato => {
      this.datoRecibido = dato;
    }); 
  }

  addDato(nuevoDato: HTMLInputElement){

    this.datosService.setDato(nuevoDato.value);
    nuevoDato.value="";
  }

  enviarDato(dato: HTMLInputElement){
    this.datosService.sendDato(dato.value);
   dato.value="";
  }
}