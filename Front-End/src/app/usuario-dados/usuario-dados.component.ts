import { HttpErrorResponse  } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

import { NgForm } from '@angular/forms';

import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-usuario-dados',
  templateUrl: './usuario-dados.component.html',
  styleUrls: ['./usuario-dados.component.css']
})
export class UsuarioDadosComponent implements OnInit{

  public users:User[] = [];
  public editUser!: User | null;

  constructor (private userService: UserService){}

  ngOnInit(): void {
    this.getUsers();
    this.searchUsers();
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

  public searchUsers(): void {
    const results: User[]=[];
    let a = window.localStorage.getItem('id');
    let key: Number = Number(a);
    for(const user of this.users){
      console.log(user.id)
      if(user.id == key){
        results.push(user);
      }
    }
    this.users = results;
    if(results.length === 0 || !key) {
      alert("Dados Não encontrados");
      window.location.href = "http://localhost:4200/home";
    }
  }

  public onUpdateUser(user: User): void{
    console.log(user.cnpjcpf);
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

}
