import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { AdvertisementformComponent } from '../advertisementform/advertisementform.component';
import { User } from '../user';
import { UserdService } from '../userd.service';
@Component({
  selector: 'app-angulartable',
  template:`
  <div class="container-fluid">
    <h1>new form</h1>
    <form  #userform="ngForm"    (ngSubmit)="onsubmit(userform.value)">


<hr>


<div class="form-group">
  <label>id</label>
  <input type="text" class="form-control"   name="id" [(ngModel)]='u.id'>

</div>
<div class="form-group">
    <label>name</label>
    <input type="text" class="form-control"   name="user" [(ngModel)]='u.name'>

</div>


<div class="form-group">
    <label>description
    </label>
    <input type="text" class="form-control" name="description" [(ngModel)]='u.description' >
    
</div>

<button class="btn btn-primary"  type="submit">add</button>

<button (click)="update(u)">update</button>

`,
  styleUrls: ['./angulartable.component.css']
})
export class AngulartableComponent implements OnInit {

public emp=[] as any;
  public id:any;
  array:User[] = [];
  public u=new User('','','','');
  constructor(private a:UserdService,private router:ActivatedRoute) { }

  ngOnInit(): void {
    this.router.paramMap.subscribe((params : ParamMap)=> {  
      this.id=params.get('id');  

      this.array=this.a.getItem();


})
  }
  
    update(obj:any)
    {
   this.a.updateitem(obj,this.id);
    }
    onsubmit(v:any){}
    

}
