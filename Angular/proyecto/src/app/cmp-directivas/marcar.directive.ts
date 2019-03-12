import { Directive, ElementRef, HostBinding, Input, OnInit, HostListener } from '@angular/core';

@Directive({
  selector: '[appMarcar]'
})
export class MarcarDirective implements OnInit {

  @HostBinding('style.backgroundColor') colorFondo;
  @Input("appMarcar") color = "blue";
  constructor(private elemRef: ElementRef) { //equivalente constructor normal
    //elemRef.nativeElement.style.backgroundColor = "blue";
  }

  ngOnInit() {
    this.color = this.color ? this.color : "blue";
  }

  @HostListener('mouseover') onmouseover(){
    this.colorFondo = this.color;
  }
  @HostListener('mouseleave') onmouseleave(){
    this.colorFondo = 'white';
  }

}
