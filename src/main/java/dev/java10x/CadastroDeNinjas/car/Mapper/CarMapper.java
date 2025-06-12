package dev.java10x.CadastroDeNinjas.car.Mapper;

import dev.java10x.CadastroDeNinjas.car.DTO.CarDTO;
import dev.java10x.CadastroDeNinjas.car.model.CarModel;
import dev.java10x.CadastroDeNinjas.dealership.model.DealershipModel;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    public CarModel map(CarDTO carDTO) {
        CarModel carModel = new CarModel();
        carModel.setId(carDTO.getId());
        carModel.setModelo(carDTO.getModelo());
        carModel.setMarca(carDTO.getMarca());
        carModel.setPlaca(carDTO.getPlaca());
        carModel.setConcessionaria(carDTO.getConcessionaria());
        return carModel;
    }

    public CarDTO map(CarModel carModel) {
        CarDTO carDTO = new CarDTO();
        carDTO.setId(carModel.getId());
        carDTO.setModelo(carModel.getModelo());
        carDTO.setMarca(carModel.getMarca());
        carDTO.setPlaca(carModel.getPlaca());
        carDTO.setConcessionaria(carModel.getConcessionaria());
        return carDTO;
    }
}
