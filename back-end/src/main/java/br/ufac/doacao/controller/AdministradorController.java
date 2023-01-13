package br.ufac.doacao.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufac.doacao.model.Administrador;
import br.ufac.doacao.service.AdministradorService;

@RestController
@RequestMapping("/administrador")
public class AdministradorController implements ICrudController<Administrador> {

    private AdministradorService service;
    
    public AdministradorController(AdministradorService service) {
        this.service = service;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<Administrador> insert(@RequestBody Administrador object) {
        Administrador record = service.save(object);
        return new ResponseEntity<>(record, HttpStatus.CREATED);
    }
    
}
