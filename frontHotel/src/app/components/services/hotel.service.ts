import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Hotel } from '../../models/Hotel';

@Injectable({
  providedIn: 'root'
})
export class HotelService {
  url: string = "http://localhost:8888/CHAMBRE-SERVICE/api/hotel/";

  constructor(private http: HttpClient) { }

  public findAll(): Observable<Hotel[]> {
    return this.http.get<Hotel[]>(this.url + "findAll");
  }

  public save(hotel: Hotel) {
    return this.http.post<Hotel>(this.url + "save", hotel);
  }

  public delete(id: number) {
    return this.http.delete<Hotel>(this.url + "delete/" + id);
  }

  public findById(id: number) {
    return this.http.get<Hotel>(this.url + "find/" + id);
  }

  public update(hotel: Hotel) {
    return this.http.put<Hotel>(this.url + "save", hotel);
  }
}

