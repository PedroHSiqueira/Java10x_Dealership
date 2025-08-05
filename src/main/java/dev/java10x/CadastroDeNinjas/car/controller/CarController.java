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
    public ResponseEntity<String> createCar(@RequestBody CarDTO carDTO) {
        carService.createCar(carDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("O item foi criado com sucesso");
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> updateCar(@PathVariable Long id, @RequestBody CarDTO carDTO) {
        if (carService.getCarById(id) == null){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("o item não encontrado!");
        }

        carService.updateCar(id, carDTO);
        return  ResponseEntity.status(HttpStatus.OK).body("Item atualizado com sucesso!");
    };

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable Long id) {
        if (carService.getCarById(id) == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O item não foi encontrado");
        }
        carService.deleteCarbyId(id);
        return ResponseEntity.status(HttpStatus.OK).body("O item foi deletado com sucesso");
    };
}
