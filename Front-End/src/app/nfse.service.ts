import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Nfse } from './nfse';
import { environment } from 'src/environments/environment';

@Injectable({providedIn: 'root'})
export class NfseService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient){}

  public getNfses(): Observable<Nfse[]> {
    return this.http.get<Nfse[]>(`${this.apiServerUrl}/nfse/all`);
  }

  public addNfse(nfse: Nfse): Observable<Nfse> {
    return this.http.post<Nfse>(`${this.apiServerUrl}/nfse/add`, nfse);
  }

  public updateNfse(nfse: Nfse): Observable<Nfse> {
    return this.http.put<Nfse>(`${this.apiServerUrl}/nfse/update`, nfse);
  }

  public deleteNfse(nfseId: number | undefined): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/nfse/delete/${nfseId}`);
  }
}