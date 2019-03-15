import { Component, OnInit } from '@angular/core';
import { LogService } from './log.service';
import { DatosService } from './datos.service';

@Component({
  selector: 'app-cmp-servicios',
  templateUrl: './cmp-servicios.component.html',
  styleUrls: ['./cmp-servicios.component.css'],
   providers: [
    DatosService
  ]
})
export class CmpServiciosComponent implements OnInit {

  constructor(private logService: LogService, private datosService: DatosService) { }
  datos=[];
  datoRecibido="";
  ngOnInit() {
    this.datos= this.datosService.getDatos();
    this.datosService.datoEmitido.subscribe(dato => {
      this.datoRecibido = dato;
    }); 
  }


  mostrarMsg(){
    this.logService.mostrarMsg("Un mensaje");
  }
}
