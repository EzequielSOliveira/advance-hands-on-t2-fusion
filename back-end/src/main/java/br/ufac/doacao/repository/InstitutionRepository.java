package br.ufac.doacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufac.doacao.model.Institution;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {

}
