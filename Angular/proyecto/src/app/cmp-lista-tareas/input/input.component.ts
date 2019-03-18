import { Component, OnInit } from '@angular/core';
import { DatosService } from './datos.service';
import {FormGroup, FormControl, Validators, FormArray, FormBuilder} from '@angular/forms'


@Component({
  selector: 'app-input',
  templateUrl: './input.component.html',
  styleUrls: ['./input.component.css']
})
export class InputComponent implements OnInit {
  miForm: FormGroup;
  constructor(private datosService: DatosService, private formBuilder: FormBuilder) { }
  tareas=[];
  ngOnInit() {
    this.tareas= this.datosService.getTareas();
    this.initForm();
  }

  private initForm(){
    this.tareas= this.datosService.getTareas();
    this.miForm =  this.formBuilder.group({
      tarea:  this.formBuilder.array([this.formBuilder.control("", [Validators.required])])
    });
  
  }

  agregarTarea(): void{
    //  this.datosService.setTarea(tarea);
    //   tarea.value="";
    const nombreTarea = this.miForm.controls.value.tarea;
    this.datosService.setTarea(nombreTarea);
    }
  setCompleta(tarea: HTMLInputElement){
    this.datosService.setCompleta(tarea.value);
    tarea.value="";
  }
  eliminarTarea(tarea: HTMLInputElement){
    this.datosService.eliminarTarea(tarea.value);
  }
}
