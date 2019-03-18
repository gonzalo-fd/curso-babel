import { Component, OnInit } from '@angular/core';
import {FormGroup, FormControl, Validators, FormArray, FormBuilder} from '@angular/forms'
@Component({
  selector: 'app-form-reactivo',
  templateUrl: './form-reactivo.component.html',
  styleUrls: ['./form-reactivo.component.css']
})
export class FormReactivoComponent implements OnInit {
  miForm: FormGroup;
  nombres = ["tony","arya", "rickon", "bran", "sansa", "robb"];
  constructor(private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.miForm =  this.formBuilder.group({
      usuario:  this.formBuilder.control("asdf", [Validators.required, this.esStark(this.nombres)]),
      password:  this.formBuilder.control("", [Validators.required, Validators.minLength(5)]),
      email:  this.formBuilder.control("", Validators.required),
      skills:  this.formBuilder.array([
         this.formBuilder.control("React"),
         this.formBuilder.control("Angular")
      ])
    });
  }

  enviarDatos(){
    console.log(this.miForm);
  }

  addSkill(skill: string){
    (<FormArray>this.miForm.controls.skills).push(this.formBuilder.control(skill, Validators.required));
  }

  esStark(nombres: Array<string>){
    return (formControl: FormControl) =>{
    if(nombres.includes(formControl.value.toLowerCase())) {
      //valido
      return null;
    }
    //invalido
    return {esStark: `El valor introducido no esta entre $ {nombres.join(',')}`};
    }
  }
}
