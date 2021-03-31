import { convertUpdateArguments } from '@angular/compiler/src/compiler_util/expression_converter';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { User } from '../user';
import { UserdService } from '../userd.service';


@Component({
  selector: 'app-advertisementform',
  templateUrl: './advertisementform.component.html',
  styleUrls: ['./advertisementform.component.css']
})

export class AdvertisementformComponent implements OnInit {


categories=['furniture','hardware','mobile']



u=new User('','','','');
 array = new Array();
b=this.u;

onsubmit(val: any)
{
  console.log(val);
  this.array.push(val);
  this.uservice.addItem(val);
}
  constructor(private route:Router,private router:ActivatedRoute,private uservice:UserdService) { }

  showall()
  {
    for(let a of this.array)
    console.log(a);
    console.log(this.array.length);
  }

  ngOnInit(): void {

    
  
}
length(){
  console.log(this.array.length);
}
 
 delete(id:string){
  this.array = this.array.filter( h => h.id !== id);
 
     console.log(this.array.length);}
 
 edit(obj: any,index: any){
console.log(obj);
this.u.id=obj.id;
this.u.name=obj.name;
this.u.category=obj.category;
this.u.description=obj.description;


 }
update(obj:any)
{
obj.id=this.u.id;
obj.name=this.u.name;
obj.category=this.u.category;
obj.description=this.u.description;
}
}