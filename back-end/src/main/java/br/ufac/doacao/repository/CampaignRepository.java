package br.ufac.doacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ufac.doacao.model.Campaign;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {

}
