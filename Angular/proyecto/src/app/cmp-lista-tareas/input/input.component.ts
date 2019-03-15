import { Component, OnInit } from '@angular/core';
import { DatosService } from './datos.service';


@Component({
  selector: 'app-input',
  templateUrl: './input.component.html',
  styleUrls: ['./input.component.css']
})
export class InputComponent implements OnInit {

  constructor(private datosService: DatosService) { }
  tareas=[];
  ngOnInit() {
    this.tareas= this.datosService.getTareas();
  }

  agregarTarea(tarea: HTMLInputElement){
    this.datosService.setTarea(tarea.value);
    tarea.value="";
    }
  setCompleta(tarea: HTMLInputElement){
    this.datosService.setCompleta(tarea.value);
    tarea.value="";
  }
  eliminarTarea(tarea: HTMLInputElement){
    this.datosService.eliminarTarea(tarea.value);
  }
}
