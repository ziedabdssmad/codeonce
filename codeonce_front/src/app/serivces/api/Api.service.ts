import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) {
  }

  sendInput(input) {
    return this.http.post('http://localhost:8090/send', input);
  }
}
