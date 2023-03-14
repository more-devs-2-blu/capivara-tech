import { HttpErrorResponse  } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

import { NgForm } from '@angular/forms';

import { User } from './user';
import { UserService } from './user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  
  public users:User[] = [];
  public editUser!: User | null;
  public deleteUser!: User | null;

  constructor (private userService: UserService){}

  ngOnInit(): void {
    this.getUsers();
  }

  public getUsers():void{
    this.userService.getUsers().subscribe(
      (response: User[])=>{
        this.users = response;
        console.log(this.users);
      },
      (error: HttpErrorResponse)=> {
        alert(error.message);
      }
    );
  }

public onAddUser(addForm: NgForm): void{
  document.getElementById('add-pet-form')?.click();

  this.userService.addUser(addForm.value).subscribe(
    (response: User) =>{
      console.log(response);
      this.getUsers();
      addForm.reset();
    },
    (error: HttpErrorResponse) =>{
      alert(error.message)
    }
  )
}

public onUpdateUser(user: User): void{
console.log(user.email);
  this.userService.updateUser(user).subscribe(
    (response: User)=>{
      console.log(response);
      this.getUsers();

    },
    (error: HttpErrorResponse)=>{
      alert(error.message)
    }
  )
}

public onDeleteUser(userId: number | undefined): void{

  this.userService.deleteUser(userId).subscribe(
    (response: void)=>{
      this.getUsers();
    },
    (error:HttpErrorResponse)=>{
      alert(error.message)
    }
  )
}

  // public searchUsers(key: string): void {
  //   const results: User[]=[];
  //   for(const user of this.users){
  //     console.log(user.name.toLowerCase())
  //     if(user.name.toLocaleLowerCase().indexOf(key.toLocaleLowerCase()) != -1
  //     || user.emailOwner.toLowerCase().indexOf(key.toLowerCase()) != -1){
  //       results.push(user);
  //     }
  //   }
  //   this.users = results;
  //   if(results.length === 0 || !key) {
  //     this.getUsers();
  //   }
  // }

  public onOpenModal(user:User | null, mode: string): void{
    const container =  document.getElementById('main-container')
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle','modal');
    
    button.setAttribute('data-target',`#${mode}PetModal`)
    
    if(mode === 'update'){
      this.editUser = user
    }
    if(mode === 'delete'){
      this.deleteUser = user
    }
    container?.appendChild(button);
    button.click();


  }
}
