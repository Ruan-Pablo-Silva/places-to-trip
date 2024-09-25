import {BehaviorSubject} from "rxjs";
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root'
})
export class SharedService {
  private clientFoundSubject = new BehaviorSubject<boolean>(false);  // Define o estado inicial como false
  clientFound$ = this.clientFoundSubject.asObservable();  // Componente pode se inscrever para ouvir mudanças

  updateClientFound(status: boolean) {
    this.clientFoundSubject.next(status);
  }
}
