import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmissaoNotasComponent } from './emissao-notas.component';

describe('EmissaoNotasComponent', () => {
  let component: EmissaoNotasComponent;
  let fixture: ComponentFixture<EmissaoNotasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmissaoNotasComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmissaoNotasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
