import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { RestaurentComponent } from './restaurent/restaurent.component';
import { SuccessComponent } from './success/success.component';
import { UserComponent } from './user/user.component';
import { UsermoduleComponent } from './usermodule/usermodule.component';

const routes: Routes = [
  {path:"user",component:UserComponent},
  {path:"main",component:AppComponent},
  {path:"user/restaurent",component:RestaurentComponent},
  {path:"user/restaurent/menu/:name",component:MenuComponent},
  {path:"admin/menu",component:UsermoduleComponent},
  {path:"admin/menu/:name",component:MenuComponent},
  {path:"admin",component:AdminComponent},
  {path:"success",component:SuccessComponent},
  
    {path:"admin/restaurent",component:RestaurentComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingcomponenets=[UserComponent,RestaurentComponent,MenuComponent,AdminComponent,UsermoduleComponent,AppComponent,SuccessComponent]
