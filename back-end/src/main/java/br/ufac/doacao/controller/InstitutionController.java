package br.ufac.doacao.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufac.doacao.model.Institution;
import br.ufac.doacao.service.InstitutionService;

@RestController
@RequestMapping("/institution")
public class InstitutionController implements ICrudController<Institution> {

    private InstitutionService service;

    public InstitutionController(InstitutionService service) {
        this.service = service;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<Institution> insert(@RequestBody Institution object) {
        Institution record = service.save(object);
        return new ResponseEntity<>(record, HttpStatus.CREATED);
    }

}
