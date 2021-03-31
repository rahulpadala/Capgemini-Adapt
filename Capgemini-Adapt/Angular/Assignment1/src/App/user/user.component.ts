import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-user',
  template: `
  <a routerLink="/user/restaurent" routerLinkActive="active">restaurent</a> 
      <router-outlet></router-outlet>
  `,
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  
  
  }
  

}
