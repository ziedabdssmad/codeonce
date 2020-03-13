import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CodeonceComponent } from './codeonce.component';

describe('CodeonceComponent', () => {
  let component: CodeonceComponent;
  let fixture: ComponentFixture<CodeonceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CodeonceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CodeonceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
