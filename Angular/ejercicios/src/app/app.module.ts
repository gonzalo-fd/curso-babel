import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FilterComponent } from './filter/filter.component';
import { MiFiltroPipe } from './filter/mi-filtro.pipe';
import { PrincipalComponent } from './curriculum/principal/principal.component';
import { FormularioComponent } from './curriculum/formulario/formulario.component';
import { VistaComponent } from './curriculum/vista/vista.component';

@NgModule({
  declarations: [
    AppComponent,
    FilterComponent,
    MiFiltroPipe,
    PrincipalComponent,
    FormularioComponent,
    VistaComponent,
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
