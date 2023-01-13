package br.ufac.doacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufac.doacao.model.Donor;

public interface DonorRepository extends JpaRepository<Donor, Long> {

}
