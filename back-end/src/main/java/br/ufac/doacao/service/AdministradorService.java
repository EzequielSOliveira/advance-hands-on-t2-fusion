package br.ufac.doacao.service;

import org.springframework.stereotype.Service;

import br.ufac.doacao.model.Administrador;
import br.ufac.doacao.repository.AdministradorRepository;

@Service
public class AdministradorService implements ICrudService<Administrador> {

    private final AdministradorRepository repo;

    public AdministradorService(AdministradorRepository repo) {
        this.repo = repo;
    }

    @Override
    public Administrador save(Administrador object) {
        return repo.save(object);
    }

}
