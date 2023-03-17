import { HttpErrorResponse  } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

import { NgForm } from '@angular/forms';

import { Nfse } from '../nfse';
import { NfseService } from '../nfse.service';

@Component({
  selector: 'app-emissao-notas',
  templateUrl: './emissao-notas.component.html',
  styleUrls: ['./emissao-notas.component.css']
})
export class EmissaoNotasComponent implements OnInit{
  
  public nfses:Nfse[] = [];

  constructor (private nfseService: NfseService){}

  ngOnInit(): void {
    this.getNfses();
  }

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
    document.getElementById('add-user-form')?.click();
    const a = document.getElementById('add-user-form');
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

}
