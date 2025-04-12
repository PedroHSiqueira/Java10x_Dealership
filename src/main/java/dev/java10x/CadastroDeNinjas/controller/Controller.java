package dev.java10x.CadastroDeNinjas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas")
public class Controller {

    @GetMapping
    public ResponseEntity<String> getNinjas() {
        return new ResponseEntity<>("Ninjas", HttpStatus.OK);
    }
}
