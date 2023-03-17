import { HttpErrorResponse  } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

import { NgForm } from '@angular/forms';


import { Nfse } from '../nfse';
import { NfseService } from '../nfse.service';

@Component({
  selector: 'app-notas-fiscais',
  templateUrl: './notas-fiscais.component.html',
  styleUrls: ['./notas-fiscais.component.css']
})
export class NotasFiscaisComponent {

  public nfses:Nfse[] = [];

  constructor (private nfseService: NfseService){}

  ngOnInit(): void {
    this.getNfses();
    this.searchNfses();
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

  public searchNfses(): void {
    const tabela = document.querySelector('#tabela');
    const results: Nfse[]=[];
    // for(const nfse of this.nfses){
      for(let i = 0;i<3;i++){

      const tr = document.createElement('tr');
      const td1 = document.createElement('td');
      const td2 = document.createElement('td');
      const td3= document.createElement('td');
      const td4= document.createElement('td');
      const td5= document.createElement('td');

      td4.innerText = `${i}`;
      tr.setAttribute('scope','row');


      const button = document.createElement('button');
      button.classList.add('botaoCancelaNota');
      button.addEventListener('click', () => {
        this.onDeleteNfse(i);
      });
      tr?.appendChild(button);

      tr?.appendChild(td5);
      tr?.appendChild(td1);
      tr?.appendChild(td2);
      tr?.appendChild(td3);
      tr?.appendChild(td4);


      tr.setAttribute('id',`${i}`);
      tabela?.appendChild(tr);
    }
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

}
