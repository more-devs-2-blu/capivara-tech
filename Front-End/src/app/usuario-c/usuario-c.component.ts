import { HttpErrorResponse  } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

import { NgForm } from '@angular/forms';

import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-usuario-c',
  templateUrl: './usuario-c.component.html',
  styleUrls: ['./usuario-c.component.css']
})
export class UsuarioCComponent implements OnInit{
  
  public users:User[] = [];

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
    document.getElementById('add-user-form')?.click();
    const a = document.getElementById('add-user-form');
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

}
