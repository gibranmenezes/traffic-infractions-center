import { Component, OnInit } from '@angular/core';
import { ViolationsService } from '../violations.service';

@Component({
  selector: 'app-violations',
  templateUrl: './violations.component.html',
  styleUrls: ['./violations.component.css']
})
export class ViolationsComponent implements OnInit {
  
  violations: Array<any> = new Array();
  
  constructor (private violationsService: ViolationsService){

  }
  ngOnInit(): void {
    this.getViolations();
    throw new Error('Method not implemented.');
  }

  getViolations(){
    this.violationsService.getViolations().subscribe(violations => {
      this.violations  = violations; 
    }, err => {
      console.log('Faild', err);
    })

  }

}
