import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Cliente } from './cliente';
import { environment } from 'src/environments/environment';

@Injectable({providedIn: 'root'})
export class ClienteService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient){}

  public getClientes(): Observable<Cliente[]> {
    return this.http.get<Cliente[]>(`${this.apiServerUrl}/cliente/all`);
  }

  public addCliente(cliente: Cliente): Observable<Cliente> {
    return this.http.post<Cliente>(`${this.apiServerUrl}/cliente/add`, cliente);
  }

  public updateCliente(cliente: Cliente): Observable<Cliente> {
    return this.http.put<Cliente>(`${this.apiServerUrl}/cliente/update`, cliente);
  }

  public deleteCliente(clienteId: number | undefined): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/cliente/delete/${clienteId}`);
  }
}