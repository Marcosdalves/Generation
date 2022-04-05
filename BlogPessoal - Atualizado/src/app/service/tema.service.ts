import { HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { Tema } from '../model/Tema';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TemaService {

  constructor(private http: HttpClient) { }
    token = {
      headers: new HttpHeaders().set('Authorization', environment.token)
    }

    getAllTema(): Observable<Tema[]>{
      return this.http.get<Tema[]>('http://localhost:4200/tema',this.token)
    }
   postTema(tema:Tema): Observable<Tema>{
    return this.http.post<Tema>('http://localhost:4200/tema',this.token)
 }   

}