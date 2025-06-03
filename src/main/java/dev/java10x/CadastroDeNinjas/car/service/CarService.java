package dev.java10x.CadastroDeNinjas.car.service;

import dev.java10x.CadastroDeNinjas.car.model.CarModel;
import dev.java10x.CadastroDeNinjas.car.repository.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<CarModel> listCars() {
        return carRepository.findAll();
    }

    public CarModel getCarById(Long id) {
        Optional<CarModel> carById = carRepository.findById(id);
        return carById.orElse(null);
    }

    public CarModel createCar(CarModel carModel) {
        return carRepository.save(carModel);
    }

    public void deleteCarbyId(Long id){
        Optional<CarModel> carById = carRepository.findById(id);
        if (carById.isPresent()) {
            carRepository.deleteById(id);
        }
    }
}
