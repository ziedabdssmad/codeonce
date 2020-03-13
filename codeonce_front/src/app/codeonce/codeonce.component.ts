import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from '@angular/forms';
import {ApiService} from '../serivces/api/Api.service';

@Component({
  selector: 'app-codeonce',
  templateUrl: './codeonce.component.html',
  styleUrls: ['./codeonce.component.css']
})
export class CodeonceComponent implements OnInit {

  constructor(private fb: FormBuilder, private apiService: ApiService
  ) {
  }

  InputForm: FormGroup;
  occurences: number;

  ngOnInit() {
    this.InputForm = this.fb.group({
      phrase: ''
    });
  }

  submit() {
    console.log(this.InputForm.value);
    this.apiService.sendInput(this.InputForm.value).subscribe((data: any) => {
      console.log(data);
      this.occurences = data.occurence;
    });

  }

}
