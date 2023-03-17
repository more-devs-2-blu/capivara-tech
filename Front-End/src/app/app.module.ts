import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { UserService } from './user.service';

import { FormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { UsuarioCComponent } from './usuario-c/usuario-c.component';
import { NotasFiscaisComponent } from './notas-fiscais/notas-fiscais.component';
import { EmissaoNotasComponent } from './emissao-notas/emissao-notas.component';
import { UsuarioDadosComponent } from './usuario-dados/usuario-dados.component';
import { ClientesComponent } from './clientes/clientes.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    UsuarioCComponent,
    NotasFiscaisComponent,
    EmissaoNotasComponent,
    UsuarioDadosComponent,
    ClientesComponent,
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
