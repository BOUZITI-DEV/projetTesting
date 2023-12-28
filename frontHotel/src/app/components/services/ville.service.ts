import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ville } from '../../models/Ville';

@Injectable({
  providedIn: 'root'
})
export class VilleService {
  url: string = "http://localhost:8888/CHAMBRE-SERVICE/api/ville/";

  constructor(private http: HttpClient) { }

  public findAll(): Observable<Ville[]> {
    return this.http.get<Ville[]>(this.url + "findAll");
  }

  public save(ville: Ville) {
    return this.http.post<Ville>(this.url + "save", ville);
  }

  public delete(id: number) {
    return this.http.delete<Ville>(this.url + "delete/" + id);
  }

  public findById(id: number) {
    return this.http.get<Ville>(this.url + "find/" + id);
  }

  public update(ville: Ville) {
    return this.http.put<Ville>(this.url + "save", ville);
  }
}
