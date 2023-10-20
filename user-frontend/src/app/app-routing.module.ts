import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserListComponent } from './user-list/user-list.component';
import { MyComponentComponent } from './my-component/my-component.component'; // Import the new component

const routes: Routes = [
  { path: 'users', component: UserListComponent }, // Existing route
  { path: 'my-component', component: MyComponentComponent }, // New route
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
