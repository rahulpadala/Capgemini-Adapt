import { Component, OnInit } from '@angular/core';
import { Mdetails } from '../mdetails';
import { MdetailsService } from '../mdetails.service';

@Component({
  selector: 'app-usermodule',
  template: ` <form  #userform="ngForm"    (ngSubmit)="onsubmit(userform.value)">

  <div class="form-group">
    <label>name</label>
    <input type="text" class="form-control"   name="name" [(ngModel)]='u.name'>
  </div>
  <div class="form-group">
  <label>item1</label>
    <input type="text" class="form-control"   name="item1" [(ngModel)]='u.item1'>
  </div>
  <div class="form-group">
  <label>item2</label>
  <input type="text" class="form-control"   name="item2" [(ngModel)]='u.item2'>
</div>
<div class="form-group">
<label>item3</label>
    <input type="text" class="form-control"   name="item3" [(ngModel)]='u.item3'>
  </div>
  <button class="btn btn-primary"  type="submit">add</button>
      </form>
      <table >
      <thead>
        <tr>
          <th scope="col">Name</th>  
          <th scope="col">item1</th>  
          <th scope="col">item2</th>  
          <th scope="col">item3</th>     
        </tr>
      </thead>
      <tbody>
        <tr *ngFor="let a of  array; let j=index">
         
         <td>{{a.name}}</td>
         <td>{{a.item1}}</td>
         <td>{{a.item2}}</td>
         <td>{{a.item3}}</td>
         <button (click)="delete(a.name)">delete</button>
        </tr>
      </tbody>
    </table>






    <router-outlet></router-outlet>`,
  styleUrls: ['./usermodule.component.css']
})
export class UsermoduleComponent implements OnInit {

  constructor(private r:MdetailsService) { }
  u=new Mdetails('','','','');
  
  array:Mdetails[] = [];
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
