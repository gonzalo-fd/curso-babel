import { Component, OnInit } from '@angular/core';
import { DatosService } from '../datos.service';

@Component({
  selector: 'app-cmp-a',
  templateUrl: './cmp-a.component.html',
  styleUrls: ['./cmp-a.component.css'],
  // providers: [
  //   DatosService
  // ]
})
export class CmpAComponent implements OnInit {

  datos = [];
  constructor(private datosService: DatosService) { }
  ngOnInit() {
    this.datos= this.datosService.getDatos();
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
