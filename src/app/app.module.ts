import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainScreenComponent } from './main-screen/main-screen.component';
import { UpdateDataComponent } from './update-data/update-data.component';
import { ChooseTripLocationsComponent } from './choose-trip-locations/choose-trip-locations.component';
import { FormsModule } from '@angular/forms';
import { provideHttpClient, withInterceptorsFromDi } from '@angular/common/http';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { LeftSideBarComponent } from './left-side-bar/left-side-bar.component';

// Import the necessary Angular Material modules for sidenav
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatButtonModule } from '@angular/material/button';
import { MatListModule } from '@angular/material/list';
import {MatIcon} from "@angular/material/icon";
import { MatIconModule } from '@angular/material/icon';  // Import MatIconModule

@NgModule({
  declarations: [
    AppComponent,
    MainScreenComponent,
    UpdateDataComponent,
    ChooseTripLocationsComponent,
    LeftSideBarComponent,  // Sidebar component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    MatSnackBarModule,
    MatSidenavModule,      // Module for sidenav
    MatButtonModule,       // Module for button to toggle sidenav
    MatListModule,
    MatIcon,
    MatIconModule,         // Icon module (added)
    // Module for list of items in sidenav
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
