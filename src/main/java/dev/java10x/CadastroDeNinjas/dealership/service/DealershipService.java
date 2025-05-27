package dev.java10x.CadastroDeNinjas.dealership.service;

import dev.java10x.CadastroDeNinjas.dealership.model.DealershipModel;
import dev.java10x.CadastroDeNinjas.dealership.repository.DealershipRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DealershipService {

    private DealershipRepository dealershipRepository;

    public DealershipService(DealershipRepository dealershipRepository) {
        this.dealershipRepository = dealershipRepository;
    }

    public List<DealershipModel> listDealership() {
        return dealershipRepository.findAll();
    }

    public DealershipModel getDealershipById(Long id) {
        Optional<DealershipModel> dealershipById = dealershipRepository.findById(id);
        return dealershipById.orElse(null);
    }

    public DealershipModel createDealership(DealershipModel dealershipModel) {
        return dealershipRepository.save(dealershipModel);
    }
}
