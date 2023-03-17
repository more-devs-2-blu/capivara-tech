import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UsuarioCComponent } from './usuario-c.component';

describe('UsuarioCComponent', () => {
  let component: UsuarioCComponent;
  let fixture: ComponentFixture<UsuarioCComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UsuarioCComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UsuarioCComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
