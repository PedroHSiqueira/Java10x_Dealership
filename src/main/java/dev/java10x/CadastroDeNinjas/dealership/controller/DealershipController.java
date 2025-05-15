package dev.java10x.CadastroDeNinjas.dealership.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dealership")
public class DealershipController {

    @GetMapping("/")
    public ResponseEntity<String> getDealership() {
        return new ResponseEntity<>("Dealership", HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String>postDealership() {
        return new ResponseEntity<>("Dealership", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateDealership(@PathVariable String id) {
        return new ResponseEntity<>("Dealership atualizado" + id, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDealership(@PathVariable String id) {
        return new ResponseEntity<>("Dealership deletado" + id, HttpStatus.OK);
    }
}
