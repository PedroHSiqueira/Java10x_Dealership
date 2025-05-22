package dev.java10x.CadastroDeNinjas.car.service;

import dev.java10x.CadastroDeNinjas.car.model.CarModel;
import dev.java10x.CadastroDeNinjas.car.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<CarModel> listCars() {
        return carRepository.findAll();
    }
}
