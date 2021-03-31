import { Injectable } from '@angular/core';
import { Mdetails } from './mdetails';

@Injectable({
  providedIn: 'root'
})
export class MdetailsService {

  constructor() { }

  private _items:Mdetails[]= [];
  addItem(item: Mdetails) {
    this._items.push(item);
}
delete(name:any) {
  this._items = this._items.filter( h => h.name!== name);
}

getItems() {
  return this._items;
}

}


