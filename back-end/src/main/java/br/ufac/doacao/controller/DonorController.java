package br.ufac.doacao.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufac.doacao.model.Donor;
import br.ufac.doacao.service.DonorService;

@RestController
@RequestMapping("/donor")
public class DonorController implements ICrudController<Donor> {

    private DonorService service;

    public DonorController(DonorService service) {
        this.service = service;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<Donor> insert(@RequestBody Donor object) {
        Donor record = service.save(object);
        return new ResponseEntity<>(record, HttpStatus.CREATED);
    }

}
