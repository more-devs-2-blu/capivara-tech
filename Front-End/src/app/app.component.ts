import { HttpErrorResponse  } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

import { NgForm } from '@angular/forms';

import { User } from './user';
import { UserService } from './user.service';
import { Nfse } from './nfse';
import { NfseService } from './nfse.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  
  public users:User[] = [];
  public editUser!: User | null;
  public deleteUser!: User | null;

  public nfses:Nfse[] = [];
  public editNfse!: Nfse | null;
  public deleteNfse!: Nfse | null;

  constructor (private userService: UserService, private nfseService: NfseService){}

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

// public onLoginUser(userId: number| undefined, senha: String| undefined){
//   this.getUsers() = response
// }

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

  public searchUsers(key: string): void {
    const results: User[]=[];
    for(const user of this.users){
      console.log(user.nomeRazaoSocial.toLowerCase())
      if(user.nomeRazaoSocial.toLocaleLowerCase().indexOf(key.toLocaleLowerCase()) != -1
      || user.email.toLowerCase().indexOf(key.toLowerCase()) != -1){
        results.push(user);
      }
    }
    this.users = results;
    if(results.length === 0 || !key) {
      this.getUsers();
    }
  }

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




  // Nfses nfse

  public getNfses():void{
    this.nfseService.getNfses().subscribe(
      (response: Nfse[])=>{
        this.nfses = response;
        console.log(this.nfses);
      },
      (error: HttpErrorResponse)=> {
        alert(error.message);
      }
    );
  }

public onAddNfse(addForm: NgForm): void{
  document.getElementById('add-pet-form')?.click();

  this.nfseService.addNfse(addForm.value).subscribe(
    (response: Nfse) =>{
      console.log(response);
      this.getNfses();
      addForm.reset();
    },
    (error: HttpErrorResponse) =>{
      alert(error.message)
    }
  )
}

public onUpdateNfse(nfse: Nfse): void{
console.log(nfse.id);
  this.nfseService.updateNfse(nfse).subscribe(
    (response: Nfse)=>{
      console.log(response);
      this.getNfses();

    },
    (error: HttpErrorResponse)=>{
      alert(error.message)
    }
  )
}

public onDeleteNfse(nfseId: number | undefined): void{

  this.nfseService.deleteNfse(nfseId).subscribe(
    (response: void)=>{
      this.getNfses();
    },
    (error:HttpErrorResponse)=>{
      alert(error.message)
    }
  )
}

  public searchNfsess(key: string): void {
    const results: Nfse[]=[];
    for(const nfse of this.nfses){
      console.log(nfse.prestador.toLowerCase())
      if(nfse.produtos.toLocaleLowerCase().indexOf(key.toLocaleLowerCase()) != -1
      || nfse.tomador.toLowerCase().indexOf(key.toLowerCase()) != -1){
        results.push(nfse);
      }
    }
    this.nfses = results;
    if(results.length === 0 || !key) {
      this.getNfses();
    }
  }

  public onOpenModalNfse(nfse:Nfse | null, mode: string): void{
    const container =  document.getElementById('main-container')
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle','modal');
    
    button.setAttribute('data-target',`#${mode}PetModal`)
    
    if(mode === 'update'){
      this.editNfse = nfse
    }
    if(mode === 'delete'){
      this.deleteNfse = nfse
    }
    container?.appendChild(button);
    button.click();


  }
}
