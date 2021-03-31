import { Component, OnInit } from '@angular/core';
import { Rdetails } from '../rdetails';
import { RdetailsService } from '../rdetails.service';

@Component({
  selector: 'app-admin',
  template: `
  <form  #userform="ngForm"    (ngSubmit)="onsubmit(userform.value)">

<div class="form-group">
  <label>name</label>
  <input type="text" class="form-control"   name="name" [(ngModel)]='u.name'>
</div>
<button class="btn btn-primary"  type="submit">add</button>

    </form>

    
    <table >
    <thead>
      <tr>
     
        <th scope="col">Name</th>     
      </tr>
    </thead>
    <tbody>
      <tr *ngFor="let a of  array; let j=index">
       
       <td>{{a.name}}</td>
       <button (click)="delete(a.name)">delete</button>
     
     
     
      </tr>
    </tbody>
  </table>
  <a routerLink="/admin/menu/" routerLinkActive="active">menu</a> 
  <router-outlet></router-outlet>`,
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  constructor(private r:RdetailsService) { }
u=new Rdetails('');
public name="Admin";
array:Rdetails[] = [];
onsubmit(val: any)
{
 this.r.addItem(val);
 this.array.push(val);
}
delete(name:string){
  this.array = this.array.filter( h => h.name!== name);
  this.r.delete(name);

}
  ngOnInit(): void {
  }

}
