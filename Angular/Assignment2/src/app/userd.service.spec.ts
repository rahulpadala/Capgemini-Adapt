import { TestBed } from '@angular/core/testing';

import { UserdService } from './userd.service';

describe('UserdService', () => {
  let service: UserdService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserdService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
