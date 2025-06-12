package dev.java10x.CadastroDeNinjas.car.controller;

import dev.java10x.CadastroDeNinjas.car.DTO.CarDTO;
import dev.java10x.CadastroDeNinjas.car.model.CarModel;
import dev.java10x.CadastroDeNinjas.car.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/listar")
    public List<CarModel> getCar() {
        return carService.listCars();
    };

    @GetMapping("/listar/{id}")
    public CarDTO getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @PostMapping("/criar")
    public CarDTO createCar(@RequestBody CarDTO carDTO) {
        return carService.createCar(carDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCar(@PathVariable String id) {
        return new ResponseEntity<>("Carros atualizado" + id, HttpStatus.OK);
    };

    @DeleteMapping("/deletar/{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCarbyId(id);
    };
}
