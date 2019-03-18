import {Routes} from '@angular/router'
import { InfoComponent } from './info.component';
import { EditarComponent } from '../editar/editar.component';
import { InfoGuard } from './info.guard';
import { EditarGuard } from '../editar/editar.guard';

export const USUARIOS_ROUTES: Routes = [
    {path: ":id/info", component: InfoComponent, canActivate: [InfoGuard]},
    {path: ":id/editar", component: EditarComponent, canDeactivate: [EditarGuard]}
];