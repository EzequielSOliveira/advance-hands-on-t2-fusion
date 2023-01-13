package br.ufac.doacao.service;

import org.springframework.stereotype.Service;

import br.ufac.doacao.model.Campaign;
import br.ufac.doacao.repository.CampaignRepository;

@Service
public class CampaignService implements ICrudService<Campaign> {

    private final CampaignRepository repo;

    public CampaignService(CampaignRepository repo) {
        this.repo = repo;
    }

    @Override
    public Campaign save(Campaign object) {
        return repo.save(object);
    }

}
