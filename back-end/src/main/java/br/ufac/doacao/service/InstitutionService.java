package br.ufac.doacao.service;

import org.springframework.stereotype.Service;

import br.ufac.doacao.model.Institution;
import br.ufac.doacao.repository.InstitutionRepository;

@Service
public class InstitutionService implements ICrudService<Institution> {

    private final InstitutionRepository repo;

    public InstitutionService(InstitutionRepository repo) {
        this.repo = repo;
    }

    @Override
    public Institution save(Institution object) {

        return repo.save(object);
    }

}
