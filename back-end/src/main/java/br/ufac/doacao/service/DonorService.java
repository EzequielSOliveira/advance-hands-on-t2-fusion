package br.ufac.doacao.service;

import org.springframework.stereotype.Service;

import br.ufac.doacao.model.Donor;
import br.ufac.doacao.repository.DonorRepository;

@Service
public class DonorService implements ICrudService<Donor> {

    private final DonorRepository repo;

    public DonorService(DonorRepository repo) {
        this.repo = repo;
    }

    @Override
    public Donor save(Donor object) {
        return repo.save(object);
    }

}
