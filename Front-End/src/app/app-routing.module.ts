import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClientesComponent } from './clientes/clientes.component';
import { EmissaoNotasComponent } from './emissao-notas/emissao-notas.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { NotasFiscaisComponent } from './notas-fiscais/notas-fiscais.component';
import { UsuarioCComponent } from './usuario-c/usuario-c.component';
import { UsuarioDadosComponent } from './usuario-dados/usuario-dados.component';

const routes: Routes = [

{path: 'login', component:LoginComponent},

// {path: '**', redirectTo:'login'},

{path: 'home', component:HomeComponent},

{path: 'cadastroUser', component:UsuarioCComponent},

{path: 'cadastroNota', component:EmissaoNotasComponent},

{path: 'notasFiscais', component:NotasFiscaisComponent},

{path: 'usuariosDados', component:UsuarioDadosComponent},

{path: 'clientes', component:ClientesComponent},
];

@NgModule({
  declarations:[],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
