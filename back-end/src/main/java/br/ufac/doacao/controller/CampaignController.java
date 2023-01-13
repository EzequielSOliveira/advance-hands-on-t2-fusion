package br.ufac.doacao.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufac.doacao.model.Campaign;
import br.ufac.doacao.service.CampaignService;

@RestController
@RequestMapping("/campaign")
public class CampaignController implements ICrudController<Campaign> {

    private CampaignService service;

    public CampaignController(CampaignService service) {
        this.service = service;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<Campaign> insert(@RequestBody Campaign object) {
        Campaign record = service.save(object);
        return new ResponseEntity<>(record, HttpStatus.CREATED);
    }

}
