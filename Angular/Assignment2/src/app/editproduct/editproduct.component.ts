import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AdvertisementformComponent } from '../advertisementform/advertisementform.component';
import { User } from '../user';
import { UserdService } from '../userd.service';

@Component({
  selector: 'app-editproduct',
  template:`<h1>hello</h1>
  

  <table >
  <thead>
    <tr>
    <th scope="col">id</th>
      <th scope="col">Name</th>
      <th scope="col">category</th>
      <th scope="col">description</th>      
    </tr>
  </thead>
  <tbody>

    <tr *ngFor="let a of  array">
      <td>{{a.id}}</td>
     <td>{{a.name}}</td>
     <td>{{a.category}}</td> 
     <td>{{ a.description}}</td>
     <button (click)="delete(a.id)">delete</button>
     <button (click)="edit(a.id)">edit</button>
     
    
   
    </tr>
  </tbody>
</table>

     
  <router-outlet></router-outlet>


`,
  styleUrls: ['./editproduct.component.css']
})
export class EditproductComponent implements OnInit {

   array:User[] = [];
  constructor(private route:Router,private userservice:UserdService) { }

  public printItems(){
    console.log('items in warehouse:');
    console.log(this.userservice.getItem());
 }

 delete(id:string){
   let a=prompt("are you sure want to delete");
   if(a=='yes')
  this.array = this.array.filter( h => h.id !== id);
 
 }
 edit(obj: any){
  console.log(obj);
 this.route.navigate(['/edit',obj])
  
   }
 

  ngOnInit(): void {

    this.array=this.userservice.getItem();
  


 }

  
}
