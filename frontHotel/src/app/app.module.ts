import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { UserService } from './components/services/user.service';
import { HotelService } from './components/services/hotel.service';
import { VilleService } from './components/services/ville.service';
import { ChambreService } from './components/services/chambre.service';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    UserService,
    HotelService,
    VilleService,
    ChambreService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
