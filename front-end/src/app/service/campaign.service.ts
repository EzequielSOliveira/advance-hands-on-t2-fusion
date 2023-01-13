import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Campaign } from '../model/campaign';
import { ICrudService } from './i-crud-service';

@Injectable({
  providedIn: 'root'
})
export class CampaignService implements ICrudService<Campaign> {

  apiUrl: string = environment.API_URL + '/campaign/';

  constructor(private http: HttpClient) {}
  
  insert(objeto: Campaign): Observable<Campaign> {
    return this.http.post<Campaign>(this.apiUrl, objeto);
  }

}