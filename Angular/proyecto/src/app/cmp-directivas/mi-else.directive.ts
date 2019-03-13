import { Directive, TemplateRef, ViewContainerRef, Input } from '@angular/core';

@Directive({
  selector: '[appMiElse]'
})
export class MiElseDirective{

  constructor(private templateRef: TemplateRef<any>, private viewContRef: ViewContainerRef) { }

  @Input() set appMiElse(condicion: boolean){
    if(condicion){
      this.viewContRef.clear();
    }
    else{
      this.viewContRef.createEmbeddedView(this.templateRef);
    }
  }
}
