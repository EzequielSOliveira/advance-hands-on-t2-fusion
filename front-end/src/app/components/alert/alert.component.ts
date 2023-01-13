import { Component } from '@angular/core';
import { NavigationStart, Router } from '@angular/router';
import { Alert } from 'src/app/model/alert';
import { EAlertType } from 'src/app/model/e-alert-type';
import { AlertService } from 'src/app/service/alert.service';

@Component({
  selector: 'app-alert',
  templateUrl: './alert.component.html',
  styleUrls: ['./alert.component.scss']
})
export class AlertComponent {

  constructor(
    private service: AlertService,
    private router: Router
  ) { }

  showAlert(alert: Alert): void {
    const elementoAlerta = document.querySelector<HTMLElement>('div.alert');
    const elementoAlertaMensagem = document.querySelector<HTMLElement>('div.alert p#message');
    if (elementoAlerta && elementoAlertaMensagem) {
      elementoAlertaMensagem.innerText = alert.message;
      elementoAlerta.classList.add(alert.type);
      elementoAlerta.classList.remove('d-none');
    }
  }

  closeAlert(): void {
    const elementoAlerta = document.querySelector<HTMLElement>('div.alert');
    if (elementoAlerta) {
      elementoAlerta.classList.add('d-none');
      elementoAlerta.classList.remove(
        EAlertType.SUCCESS,
        EAlertType.ERROR
      );
    }
  }

  ngOnInit(): void {

    this.service.receiveAlert().subscribe(
      (alert) => {
        this.showAlert(alert);
      }
    );

    this.router.events.subscribe(
      (evento) => {
        if (evento instanceof NavigationStart) {
          this.closeAlert();
        }
      }
    );

  }

}
