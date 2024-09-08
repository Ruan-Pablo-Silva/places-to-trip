import {NgModule} from '@angular/core';
import {BrowserModule, provideClientHydration} from '@angular/platform-browser';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {MainScreenComponent} from './main-screen/main-screen.component';
import {UpdateDataComponent} from './update-data/update-data.component';
import {ChooseTripLocationsComponent} from './choose-trip-locations/choose-trip-locations.component';
import {FormsModule} from "@angular/forms";
import {provideHttpClient, withInterceptorsFromDi} from "@angular/common/http";
import {provideAnimationsAsync} from '@angular/platform-browser/animations/async';
import {LeftSideBarComponent} from "./left-side-bar/left-side-bar.component";

@NgModule({
  declarations: [
    AppComponent,
    MainScreenComponent,
    UpdateDataComponent,
    ChooseTripLocationsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    MatSnackBarModule,
    LeftSideBarComponent
  ],
  providers: [
    provideClientHydration(),
    provideHttpClient(withInterceptorsFromDi()),
    provideAnimationsAsync()

  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
