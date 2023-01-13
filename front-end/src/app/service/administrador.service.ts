import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Administrador } from '../model/administrador';
import { ICrudService } from './i-crud-service';

@Injectable({
  providedIn: 'root'
})
export class AdministradorService implements ICrudService<Administrador> {

  apiUrl: string = environment.API_URL + '/administrador/';

  constructor(private http: HttpClient) {}
  
  insert(objeto: Administrador): Observable<Administrador> {
    return this.http.post<Administrador>(this.apiUrl, objeto);
  }

}