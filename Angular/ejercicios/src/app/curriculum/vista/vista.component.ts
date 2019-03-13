import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-vista',
  templateUrl: './vista.component.html',
  styleUrls: ['./vista.component.css']
})
export class VistaComponent implements OnInit {
  @Input() nombre="";
  @Input() apellidos="";
  @Input() email="";
  @Input() fecha="";
  @Input() imagen="";
  @Input() skill=[];

  constructor() { }

  ngOnInit() {
  }

}
