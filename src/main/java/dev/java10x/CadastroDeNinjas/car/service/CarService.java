package dev.java10x.CadastroDeNinjas.car.service;

import dev.java10x.CadastroDeNinjas.car.DTO.CarDTO;
import dev.java10x.CadastroDeNinjas.car.Mapper.CarMapper;
import dev.java10x.CadastroDeNinjas.car.model.CarModel;
import dev.java10x.CadastroDeNinjas.car.repository.CarRepository;
import dev.java10x.CadastroDeNinjas.dealership.model.DealershipModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
        this.carMapper = new CarMapper();
    }

    public List<CarModel> listCars() {
        return carRepository.findAll();
    }

    public CarDTO getCarById(Long id) {
        Optional<CarModel> carById = carRepository.findById(id);
        CarModel car = carById.orElse(null);
        return car != null ? carMapper.map(car) : null;
    }

    public CarDTO createCar(CarDTO carDTO) {
        CarModel carModel = carMapper.map(carDTO);
        carModel = carRepository.save(carModel);
        return carMapper.map(carModel);
    }

    public CarModel updateCar(Long id, CarDTO carModel) {
        if (carRepository.existsById(id)) {
            carModel.setId(id);
            return carRepository.save(carMapper.map(carModel));
        }
        return null;
    }

    public void deleteCarbyId(Long id){
        Optional<CarModel> carById = carRepository.findById(id);
        if (carById.isPresent()) {
            carRepository.deleteById(id);
        }
    }
}
