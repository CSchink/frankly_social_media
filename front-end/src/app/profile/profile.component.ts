import { Component, OnInit } from '@angular/core';
import { Post } from '../models/post';
import { User } from '../models/user';
import { PostService } from '../services/post.service';
import { UserServicesService } from '../services/user-services.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {


  user: User;
  allPosts: Post[];

  constructor(private userService: UserServicesService, private postService: PostService) { }

  ngOnInit(): void {
    this.getCurrentUser();
    this.getUsersPosts();
  }

  getCurrentUser(){
     this.userService.getUserSession().subscribe(user => {
      this.user = user;
    })
  }

  async getUsersPosts(){
    
    this.postService.getAllPosts().subscribe(posts =>{
      
      
      this.allPosts = posts.filter(x => x.userId.userId == this.user.userId);
    }
      
    )
  }

}
