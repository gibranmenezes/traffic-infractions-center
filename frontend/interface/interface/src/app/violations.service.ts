import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ViolationsService {

  constructor(private http: HttpClient) { }
  

  getViolations() : Observable<any>{
    return this.http.get("http://localhost:8080/violations");
       
  }
    
  
}
