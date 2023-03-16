import { Component,OnInit} from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';
import { HttpErrorResponse  } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{

    
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


  public onLoginUser(key: string, senha: String): void {
    
    const results: User[]=[];
    for(const user of this.users){
      console.log(user.email.toLowerCase())
      if(user.senha.toLocaleLowerCase().indexOf(senha.toLocaleLowerCase()) != -1
      || user.email.toLowerCase().indexOf(key.toLowerCase()) != -1){
        results.push(user);
      }
    }
    this.users = results;
    if(results.length === 0 || !key) {
      alert("Nenhum Usuário cadastrado");
    }
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

  public onOpenModal(user:User | null, mode: string): void{
    console.log("teste")
    const container =  document.getElementById('containerCentralr')
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle','modal');
    
    button.setAttribute('data-target',`#${mode}PetModal`)
    
    container?.appendChild(button);
    button.click();


  }

}
