import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Chambre } from '../../models/Chambre';

@Injectable({
  providedIn: 'root'
})
export class ChambreService {
  url: string = "http://localhost:8888/CHAMBRE-SERVICE/api/chambre/";

  constructor(private http: HttpClient) { }

  public findAll(): Observable<Chambre[]> {
    return this.http.get<Chambre[]>(this.url + "findAll");
  }

  public save(chambre: Chambre) {
    return this.http.post<Chambre>(this.url + "save", chambre);
  }

  public delete(id: number) {
    return this.http.delete<Chambre>(this.url + "delete/" + id);
  }

  public findById(id: number) {
    return this.http.get<Chambre>(this.url + "find/" + id);
  }

  public update(chambre: Chambre) {
    return this.http.put<Chambre>(this.url + "save", chambre);
  }
}
