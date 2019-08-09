import { Routes } from '@angular/router';

import { Component } from '@angular/core';

import { HomeComponent} from './home/home.component'
import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';

export const AppRoutes: Routes = [

  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'dashboard',
    redirectTo: 'dashboard-cmp',
    pathMatch: 'full',
  },
  {
    path: '',
    component: AdminLayoutComponent,
    children: [
        {
      path: '',
      loadChildren: './layouts/admin-layout/admin-layout.module#AdminLayoutModule'
  }]},
  {
   path: '**',
   redirectTo: 'home'
  }
]
