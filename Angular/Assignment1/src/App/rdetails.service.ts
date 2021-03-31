import { Injectable } from '@angular/core';
import { Rdetails } from './rdetails';

@Injectable({
  providedIn: 'root'
})
export class RdetailsService {


  private _items:Rdetails[]= [];
  addItem(item: Rdetails) {
    this._items.push(item);
}
delete(name:any) {
  this._items = this._items.filter( h => h.name!== name);
}

getItems() {
  return this._items;
}
  constructor() { }
}
