import { Routes } from '@angular/router';
import { FruitComponent } from './fruit/fruit.component';

export const routes: Routes = [
  { path: 'fruit/:name', component: FruitComponent },
];
