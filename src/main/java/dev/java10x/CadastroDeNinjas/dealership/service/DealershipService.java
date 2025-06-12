package dev.java10x.CadastroDeNinjas.dealership.service;

import dev.java10x.CadastroDeNinjas.dealership.DTO.DealershipDTO;
import dev.java10x.CadastroDeNinjas.dealership.Mapper.DealershipMapper;
import dev.java10x.CadastroDeNinjas.dealership.model.DealershipModel;
import dev.java10x.CadastroDeNinjas.dealership.repository.DealershipRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DealershipService {

    private final DealershipRepository dealershipRepository;
    private final DealershipMapper dealershipMapper;

    public DealershipService(DealershipRepository dealershipRepository) {
        this.dealershipRepository = dealershipRepository;
        this.dealershipMapper = new DealershipMapper();
    }

    public List<DealershipModel> listDealership() {
        return dealershipRepository.findAll();
    }

    public DealershipModel getDealershipById(Long id) {
        Optional<DealershipModel> dealershipById = dealershipRepository.findById(id);
        return dealershipById.orElse(null);
    }

    public DealershipDTO createDealership(DealershipDTO dealershipDTO) {
        DealershipModel dealershipModel = dealershipMapper.map(dealershipDTO);
        DealershipModel dealership = dealershipRepository.save(dealershipModel);
        return dealershipMapper.map(dealership);
    }

    public void deleteDealershipById(Long id) {
        Optional<DealershipModel> dealershipById = dealershipRepository.findById(id);
        if (dealershipById.isPresent()) {
            dealershipRepository.delete(dealershipById.get());
        }
    }

    public DealershipModel updateDealership(Long id, DealershipModel dealershipModel) {
        if (dealershipRepository.existsById(id)){
            dealershipModel.setId(id);
            return dealershipRepository.save(dealershipModel);
        }
        return null;
    }
}
