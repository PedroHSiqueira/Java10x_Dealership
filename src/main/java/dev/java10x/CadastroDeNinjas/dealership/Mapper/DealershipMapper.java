package dev.java10x.CadastroDeNinjas.dealership.Mapper;

import dev.java10x.CadastroDeNinjas.dealership.DTO.DealershipDTO;
import dev.java10x.CadastroDeNinjas.dealership.model.DealershipModel;
import org.springframework.stereotype.Component;

@Component
public class DealershipMapper {
    public DealershipModel map(DealershipDTO dealershipDTO) {
        DealershipModel dealershipModel = new DealershipModel();
        dealershipModel.setId(dealershipDTO.getId());
        dealershipModel.setNome(dealershipDTO.getNome());
        dealershipModel.setEmail(dealershipDTO.getEmail());
        dealershipModel.setCarros(dealershipDTO.getCarros());

        return dealershipModel;
    }

    public DealershipDTO map(DealershipModel dealershipModel) {
        DealershipDTO dealershipDTO = new DealershipDTO();
        dealershipDTO.setId(dealershipModel.getId());
        dealershipDTO.setNome(dealershipModel.getNome());
        dealershipDTO.setEmail(dealershipModel.getEmail());
        dealershipDTO.setCarros(dealershipModel.getCarros());

        return dealershipDTO;
    }
}
