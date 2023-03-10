import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImportanceComponent } from './importance.component';

describe('ImportanceComponent', () => {
  let component: ImportanceComponent;
  let fixture: ComponentFixture<ImportanceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ImportanceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ImportanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
