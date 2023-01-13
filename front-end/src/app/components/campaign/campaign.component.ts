import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Campaign } from 'src/app/model/campaign';
import { Item } from 'src/app/model/item';
import { AlertService } from 'src/app/service/alert.service';
import { CampaignService } from 'src/app/service/campaign.service';
import { IForm } from '../i-form';

@Component({
  selector: 'app-campaign',
  templateUrl: './campaign.component.html',
  styleUrls: ['./campaign.component.scss']
})
export class CampaignComponent implements IForm<Campaign> {

  constructor(
    private servico: CampaignService,
    private alertService: AlertService,
    private router: Router,
    private route: ActivatedRoute) { }

  registro: Campaign = <Campaign>{};
  newItem: Item = <Item>{};
  item: Item[] = Array<Item>();

  submit(form: NgForm): void {
    this.registro.item = this.item;
    this.servico.insert(this.registro).subscribe({
      complete: () => {
        form.resetForm();
        this.alertService.sendSuccessAlert();
      }
    });
    this.item = Array<Item>();
  }

  addItem() {
    this.item.push(this.newItem);
    console.log(this.item)
    this.newItem = <Item>{};
  }

  removeItem(itemId: any) {
    delete this.item[itemId];
    this.item = this.item.filter(function (item) { return item; });
  }

}
