import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Administrador } from 'src/app/model/administrador';
import { AdministradorService } from 'src/app/service/administrador.service';
import { AlertService } from 'src/app/service/alert.service';
import { IForm } from '../i-form';

@Component({
  selector: 'app-administrador',
  templateUrl: './administrador.component.html',
  styleUrls: ['./administrador.component.scss'],
})
export class AdministradorComponent implements IForm<Administrador> {

  constructor(
    private servico: AdministradorService,
    private router: Router,
    private alertService: AlertService,
    private route: ActivatedRoute) { }

  registro: Administrador = <Administrador>{};

  // TODO: analisar fazer validação com próprio NgForm.
  submit(form: NgForm): void {
    if (form.valid) {
      this.servico.insert(this.registro).subscribe({
        complete: () => {
          form.resetForm();
          this.alertService.sendSuccessAlert();
        }
      });
    }
  }
}
