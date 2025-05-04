package dev.java10x.CadastroDeNinjas.Car.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {

    @GetMapping
    public ResponseEntity<String> getCar() {
        return new ResponseEntity<>("Carros cadastrados", HttpStatus.OK);
    };
}
