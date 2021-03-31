import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { RestaurentComponent } from './restaurent/restaurent.component';
import { MenuComponent } from './menu/menu.component';
import { AdminComponent } from './admin/admin.component';
import { FormsModule } from '@angular/forms';
import { UsermoduleComponent } from './usermodule/usermodule.component';
import { SuccessComponent } from './success/success.component';


@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    RestaurentComponent,
    MenuComponent,
    AdminComponent,
    UsermoduleComponent,
    SuccessComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
   
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
