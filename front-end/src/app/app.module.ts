import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestComponent } from './components/test/test.component';
import { AdministradorComponent } from './components/administrator/administrador.component';
import { CadastroFormComponent } from './components/cadastro-form/cadastro-form.component';
import { HomeComponent } from './components/home/home.component';
import { CampaignComponent } from './components/campaign/campaign.component';
import { AlertComponent } from './components/alert/alert.component';
import { SidemenuComponent } from './components/administrator/sidemenu/sidemenu.component';
import { CampaignUpdateComponent } from './components/campaign/update/update.component';
import { CampaignFinishComponent } from './components/campaign/finish/finish.component';
import { CampaignVisualizeComponent } from './components/campaign/visualize/visualize.component';
import { DisclosureComponent } from './components/disclosure/disclosure.component';
import { ContactComponent } from './components/contact/contact.component';
import { AboutComponent } from './components/about/about.component';
import { PrivacyComponent } from './components/privacy/privacy.component';
import { TermsComponent } from './components/terms/terms.component';
import { ImportanceComponent } from './components/importance/importance.component';
import { InstitutionComponent } from './components/institution/institution.component';
import { NgxMaskDirective, NgxMaskPipe, provideNgxMask } from 'ngx-mask';

@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    AdministradorComponent,
    CadastroFormComponent,
    HomeComponent,
    CampaignComponent,
    AlertComponent,
    SidemenuComponent,
    CampaignUpdateComponent,
    CampaignFinishComponent,
    CampaignVisualizeComponent,
    DisclosureComponent,
    ContactComponent,
    AboutComponent,
    PrivacyComponent,
    TermsComponent,
    ImportanceComponent,
    InstitutionComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    NgxMaskDirective,
    NgxMaskPipe
  ],
  providers: [provideNgxMask()],
  bootstrap: [AppComponent]
})
export class AppModule { }
