import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class DatosService {
  tareas=[];
  constructor() { }

  getTareas(){
    return this.tareas;
  }
  setTarea(tarea: string){
    let tar: Object ={
      nombre: tarea,
      completa: false
    }
    this.tareas.push(tar);
    console.log(this.tareas);
  }
  setCompleta(tarea: string){
    for (let i = 0; i < this.tareas.length; i++) {
      if(this.tareas[i].nombre == tarea)
        this.tareas[i].completa = !this.tareas[i].completa;
    }
  }
  eliminarTarea(tarea: string){
    for (let i = 0; i < this.tareas.length; i++) {
      if(this.tareas[i].nombre == tarea)
      this.tareas.splice(i, 1);
    } 
  }
}
