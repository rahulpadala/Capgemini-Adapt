import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Mdetails } from '../mdetails';
import { MdetailsService } from '../mdetails.service';

@Component({
  selector: 'app-menu',
  
  template: `
  
  <h1>{{restaurentname}}</h1>
  <li *ngFor="let a of items">
  <tr>
  <th>items</th></tr><tr>
<<td><button (click)="onclick()">{{a.item1}}</button></td>
<td></td>
<td><button (click)="onclick()">{{a.item2}}</button></td>
<td></td>
<td><button (click)="onclick()">{{a.item3}}</button></td>
</tr></li>`,
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

   public restaurentname: any;
public d:any;
   items: Mdetails[] = [];

      menu=[{rname:"chandu",item1:"chicken" ,item2:"pizza"},{rname:"sekhar",item1:"chicken" ,item2:"pizza"}]
      array:Mdetails[] = [];

      r=new Mdetails('','','','');

  constructor(private router:Router,private route:ActivatedRoute,private rs:MdetailsService) { }

  ngOnInit(): void {
    
    this.array=this.rs.getItems();
    this.restaurentname = this.route.snapshot.paramMap.get('name'); 
    this.d=this.array.find(e => e.name === this.restaurentname); 
    this.items.push(this.d);
    console.log(this.d);

  }
  onclick(){
    this.router.navigate(['/success']);
  }

}
