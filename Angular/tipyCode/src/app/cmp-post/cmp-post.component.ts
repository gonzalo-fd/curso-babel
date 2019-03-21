import { Component, OnInit, Input } from '@angular/core';
import { Post } from '../entidades/post';
import { Users } from '../entidades/users';
import { PostService } from '../post.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-cmp-post',
  templateUrl: './cmp-post.component.html',
  styleUrls: ['./cmp-post.component.css']
})
export class CmpPostComponent implements OnInit {
  @Input() public post:Post
  user: Users = new Users('', 0);
  mostrar = false;
  
  constructor(private httpClient:HttpClient, private postService: PostService) {
    
   }

  ngOnInit() {
    this.setUser();
    this.setComments();

  }
  public setUser(){
    const observable = this.postService.getUser(this.post.userId);
    observable.subscribe(
      data => this.user = data,
      err => console.log(err)
    )   
  } 

  public setComments(){
    const observable = this.postService.getComment(this.post.id);
    observable.subscribe(
      data => this.post.comments = data,
      err => console.log(err)
    )   
  }

  public cambiarMostrar(){
    this.mostrar = !this.mostrar;
  }
}
 
