import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TestComponent } from './components/test/test.component';
import { AdministradorComponent } from './components/administrator/administrador.component';
import { CadastroFormComponent } from './components/cadastro-form/cadastro-form.component';
import { HomeComponent } from './components/home/home.component';
import { CampaignComponent } from './components/campaign/campaign.component';
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

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'test', component: TestComponent },
  { path: 'campanha/cadastro', component: CampaignComponent },
  { path: 'campanha/atualizar', component: CampaignUpdateComponent },
  { path: 'campanha/concluir', component: CampaignFinishComponent },
  { path: 'campanha/visualizar', component: CampaignVisualizeComponent },
  { path: 'instituicao', component: InstitutionComponent },
  { path: 'administrador/cadastro', component: AdministradorComponent },
  { path: 'cadastro', component: CadastroFormComponent },
  { path: 'divulgacao-do-projeto', component: DisclosureComponent },
  { path: 'fale-consco', component: ContactComponent },
  { path: 'quem-somos', component: AboutComponent },
  { path: 'politica-de-privacidade', component: PrivacyComponent },
  { path: 'termos-de-uso', component: TermsComponent },
  { path: 'importancia-de-doar', component: ImportanceComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
