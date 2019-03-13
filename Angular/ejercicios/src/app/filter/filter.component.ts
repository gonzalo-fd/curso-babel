import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-filter',
  templateUrl: './filter.component.html',
  styleUrls: ['./filter.component.css']
})
export class FilterComponent implements OnInit {

  texto ="";
  aSustituir ="";
  sust="";
  elim="";
  constructor() { }

  sustituir(arg: string){
    this.aSustituir = arg;
  }
  sustitucion(arg: string){
    this.sust = arg;
  }
  eliminar(arg: string){
    this.elim = arg;
  }

  guardar(arg: string){
    this.texto = arg;
  }

  ngOnInit() {
  }

}
