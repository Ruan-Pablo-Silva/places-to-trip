import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainScreenComponent } from './main-screen/main-screen.component';
import { UpdateDataComponent } from './update-data/update-data.component';
import { ChooseTripLocationsComponent } from './choose-trip-locations/choose-trip-locations.component';
import {FormsModule} from "@angular/forms";
import { provideHttpClient, withInterceptorsFromDi} from "@angular/common/http";
import {MainScreenServiceService} from "./main-screen/main-screen-service.service";

@NgModule({
  declarations: [
    AppComponent,
    MainScreenComponent,
    UpdateDataComponent,
    ChooseTripLocationsComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule
    ],
  providers: [
    provideClientHydration(),
    provideHttpClient(withInterceptorsFromDi())

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
