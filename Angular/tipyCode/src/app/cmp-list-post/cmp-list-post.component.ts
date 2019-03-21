import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { PostService } from '../post.service';
import { post } from 'selenium-webdriver/http';

@Component({
  selector: 'app-cmp-list-post',
  templateUrl: './cmp-list-post.component.html',
  styleUrls: ['./cmp-list-post.component.css']
})
export class CmpListPostComponent implements OnInit {

  public posts:any

  constructor(private httpClient:HttpClient, private postService: PostService) { 
    this.getPosts()
  }


  ngOnInit() {
  }

  public getPosts(){
    let observable = this.postService.listar("https://jsonplaceholder.typicode.com/posts");
    observable.subscribe(
      data => this.posts = data,
    err => console.log(err)
    )    
  }
}