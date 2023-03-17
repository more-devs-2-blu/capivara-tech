import { Component, OnInit } from '@angular/core';
import { Cliente } from '../cliente';
import { ClienteService } from '../cliente.service';
import { NgForm } from '@angular/forms';
import { HttpErrorResponse  } from '@angular/common/http';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})
export class ClientesComponent implements OnInit{
  
  public clientes:Cliente[] = [];
  public clientes1:number[]= [];


  constructor (private clienteService: ClienteService){}

  ngOnInit(): void {
    // this.getClientes();
    this.clientes1 = [1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4]
  }

  // public getClientes():void{
  //   this.clienteService.getClientes().subscribe(
  //     (response: Cliente[])=>{
  //       this.clientes = response;
  //       console.log(this.clientes);
  //     },
  //     (error: HttpErrorResponse)=> {
  //       alert(error.message);
  //     }
  //   );
  // }

}
