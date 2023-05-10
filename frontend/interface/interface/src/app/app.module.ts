import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { ViolationsComponent } from './violations/violations.component';
import { ViolationsService } from './violations.service';

@NgModule({
  declarations: [
    AppComponent,
    ViolationsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [ViolationsService, HttpClientModule],
  bootstrap: [AppComponent]
})
export class AppModule { }
