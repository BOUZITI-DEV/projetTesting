import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../../models/User';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  url: string = "http://localhost:8888/USER-SERVICE/api/user/";

  constructor(private http: HttpClient) {}

  public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.url + "findAll");
  }

  public save(user: User) {
    return this.http.post<User>(this.url + "save", user);
  }

  public delete(id: number) {
    return this.http.delete<User>(this.url + "delete/" + id);
  }

  public findById(id: number) {
    return this.http.get<User>(this.url + "find/" + id);
  }

  public update(user: User) {
    return this.http.put<User>(this.url + "save", user);
  }
}
