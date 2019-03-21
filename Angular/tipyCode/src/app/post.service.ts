import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Users } from './entidades/users';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  public user:Users;
  constructor(private httpClient:HttpClient) { }

  public listar(url: string):Observable<any>{
    return this.httpClient.get(url);
  }

  public getUser(id): Observable<any>{
    return this.httpClient.get("https://jsonplaceholder.typicode.com/users/"+id);
  }
  public getComment(id): Observable<any>{
    return this.httpClient.get("https://jsonplaceholder.typicode.com/comments?postId="+id);
  }
}
