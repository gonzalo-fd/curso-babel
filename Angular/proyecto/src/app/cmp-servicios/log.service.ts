import { Injectable } from '@angular/core';

class TimeLogService {
  mostrarMsg(msg) {
    console.log(new Date().toDateString() + "MSG: " + msg);
  }
}
@Injectable({
  providedIn: 'root',
  useClass: TimeLogService
})
export class LogService {

  mostrarMsg(msg){
    console.log("MSG: " + msg);
  }
}
