package dev.java10x.CadastroDeNinjas.car.controller;

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

    @GetMapping
    public List<CarModel> getCar() {
        return carService.listCars();
    };

    @PostMapping("/")
    public ResponseEntity<String> postCar() {
        return new ResponseEntity<>("Carro Criado", HttpStatus.OK);
    };

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCar(@PathVariable String id) {
        return new ResponseEntity<>("Carros atualizado" + id, HttpStatus.OK);
    };

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable String id) {
        return new ResponseEntity<>("Carros Deletado" + id, HttpStatus.OK);
    };
}
