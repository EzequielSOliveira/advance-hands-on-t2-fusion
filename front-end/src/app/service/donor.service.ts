import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Donor } from '../model/donor';
import { ICrudService } from './i-crud-service';

@Injectable({
  providedIn: 'root'
})
export class DonorService implements ICrudService<Donor> {

  apiUrl: string = environment.API_URL + '/donor/';

  constructor(private http: HttpClient) {}
  
  insert(objeto: Donor): Observable<Donor> {
    return this.http.post<Donor>(this.apiUrl, objeto);
  }

}