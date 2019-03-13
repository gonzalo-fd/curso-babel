import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {
  @Output() nombre = new EventEmitter<string>();
  @Output() apellidos =new EventEmitter<string>();
  @Output() fecha= new EventEmitter<Date>();
  @Output() email=new EventEmitter<string>();
  @Output() imagen=new EventEmitter();
  @Output() skill=new EventEmitter<Array<string>>();
  skills=[];

  constructor() { }

  aNombre(arg: string){
    this.nombre.emit(arg);

  }
  aApellidos(arg: string){
    this.apellidos.emit(arg);
  }
  aFecha(arg: Date){
    this.fecha.emit(arg);
  }
  aEmail(arg: string){
    this.email.emit(arg);
  }
  aImagen(arg: File){
    this.imagen.emit(arg);
  }
  aSkills(arg: any){
    this.skills.push(arg);
    this.skill.emit(this.skills);
  }
  ngOnInit() {
  }

}
