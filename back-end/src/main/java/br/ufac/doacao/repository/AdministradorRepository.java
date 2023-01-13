package br.ufac.doacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ufac.doacao.model.Administrador;

public interface AdministradorRepository extends JpaRepository<Administrador, Long> {

}
