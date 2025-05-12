package dev.java10x.CadastroDeNinjas.car.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {

    @GetMapping
    public ResponseEntity<String> getCar() {
        return new ResponseEntity<>("Carros cadastrados", HttpStatus.OK);
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
