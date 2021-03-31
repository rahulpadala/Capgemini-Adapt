import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AngulartableComponent } from './angulartable/angulartable.component';
import { EditproductComponent } from './editproduct/editproduct.component';

const routes: Routes = [
  {
    path:'showall',component:EditproductComponent
  },
  {
    path:'edit/:id',component:AngulartableComponent
  }
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 
 
}
export const routingComponenets=[AngulartableComponent,EditproductComponent]

