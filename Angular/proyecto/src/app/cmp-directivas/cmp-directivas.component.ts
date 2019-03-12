import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cmp-directivas',
  templateUrl: './cmp-directivas.component.html',
  styleUrls: ['./cmp-directivas.component.css']
})
export class CmpDirectivasComponent implements OnInit {
  mostrar = true;
  items = ['Item 1','Item 2','Item 3','Item 4'];
  persona = {
    nombre: "nombre",
    apellido: "apellido"
  }
  miMascota = "arg";
  constructor() { }

  cambiarMostrar(){
    this.mostrar=!this.mostrar;
  }
  ngOnInit() {
  }

}
