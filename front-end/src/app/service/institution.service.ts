import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Institution } from '../model/institution';
import { ICrudService } from './i-crud-service';

@Injectable({
  providedIn: 'root'
})
export class InstitutionService implements ICrudService<Institution> {

  apiUrl: string = environment.API_URL + '/institution/';

  constructor(private http: HttpClient) {}
  
  insert(objeto: Institution): Observable<Institution> {
    return this.http.post<Institution>(this.apiUrl, objeto);
  }

}