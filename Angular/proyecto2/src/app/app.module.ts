import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CmpRoutingComponent } from './cmp-routing/cmp-routing.component';
import { InicioComponent } from './cmp-routing/inicio/inicio.component';
import { NuevoUsuarioComponent } from './cmp-routing/nuevo-usuario/nuevo-usuario.component';
import { ROUTING } from './cmp-routing/app.routes';
import { UsuarioComponent } from './cmp-routing/usuario/usuario.component';
import { EditarComponent } from './cmp-routing/inicio/editar/editar.component';
import { InfoComponent } from './cmp-routing/inicio/info/info.component';

@NgModule({
  declarations: [
    AppComponent,
    CmpRoutingComponent,
    InicioComponent,
    NuevoUsuarioComponent,
    UsuarioComponent,
    EditarComponent,
    InfoComponent
  ],
  imports: [
    BrowserModule,
    ROUTING
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
