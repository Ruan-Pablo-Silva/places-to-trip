import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ChooseTripLocationsComponent} from "./choose-trip-locations/choose-trip-locations.component";
import {UpdateDataComponent} from "./update-data/update-data.component";
import {MainScreenComponent} from "./main-screen/main-screen.component";

const routes: Routes = [
  { path: '', component: MainScreenComponent },
  { path: 'update-data', component: UpdateDataComponent },
  { path: 'choose-trip-locations', component: ChooseTripLocationsComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
