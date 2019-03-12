import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cmp-databinding',
  templateUrl: './cmp-databinding.component.html',
  styleUrls: ['./cmp-databinding.component.css']
})
export class CmpDatabindingComponent implements OnInit {

  nombre: string = "Gonzalo";
  modoEditar: boolean = true;
  placeholder: string = "jaaaaaaaaaaa";
  personaje = {
    nombre: `Ned`,
    apellido: 'Stark'
  }
  nombreHijo1: string ="1";
  constructor() { }

  ngOnInit() {
  }
  cambiarModoEditar(){
    this.modoEditar = !this.modoEditar;
  }
  cambiarNombre(nombre: any) {
    console.dir(nombre);
    this.personaje.nombre = nombre;
  }
}
