package dev.java10x.CadastroDeNinjas.dealership.service;

import dev.java10x.CadastroDeNinjas.dealership.model.DealershipModel;
import dev.java10x.CadastroDeNinjas.dealership.repository.DealershipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealershipService {

    private DealershipRepository dealershipRepository;

    public DealershipService(DealershipRepository dealershipRepository) {
        this.dealershipRepository = dealershipRepository;
    }

    public List<DealershipModel> listDealership() {
        return dealershipRepository.findAll();
    }
}
