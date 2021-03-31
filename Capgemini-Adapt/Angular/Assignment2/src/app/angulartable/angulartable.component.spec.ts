import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AngulartableComponent } from './angulartable.component';

describe('AngulartableComponent', () => {
  let component: AngulartableComponent;
  let fixture: ComponentFixture<AngulartableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AngulartableComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AngulartableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
