import { convertUpdateArguments } from '@angular/compiler/src/compiler_util/expression_converter';
import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserdService {
  private _items:User[] = [];

  addItem(item: User) {
    this._items.push(item);
}
getItem(){
  return this._items;
}
  constructor() { }


updateitem(obj:any,id:any){
  id--;
  this._items[id]=obj
}


}