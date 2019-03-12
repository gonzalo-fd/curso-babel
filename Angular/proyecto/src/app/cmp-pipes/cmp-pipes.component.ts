import { Component, OnInit } from '@angular/core';
import { resolve } from 'q';

@Component({
  selector: 'app-cmp-pipes',
  templateUrl: './cmp-pipes.component.html',
  styleUrls: ['./cmp-pipes.component.css']
})
export class CmpPipesComponent implements OnInit {
  texto = "winter is coming!";
  precio = 12;
  fecha = new Date(2019, 3, 15);
  starks = ["Arya", "Bran", "Rickon", "Sansa", "Robb"];

  mensaje = new Promise<string>((resolve, reject) => {
    setTimeout(() => {
      resolve("un mensaje secreto...")
    }, 2000);
  });

  constructor() { }

  ngOnInit() {
  }

}
