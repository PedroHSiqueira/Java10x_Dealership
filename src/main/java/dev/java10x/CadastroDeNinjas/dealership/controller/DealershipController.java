package dev.java10x.CadastroDeNinjas.dealership.controller;

import dev.java10x.CadastroDeNinjas.dealership.model.DealershipModel;
import dev.java10x.CadastroDeNinjas.dealership.service.DealershipService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dealership")
public class DealershipController {

    private DealershipService dealershipService;

    public DealershipController(DealershipService dealershipService) {
        this.dealershipService = dealershipService;
    }

    @GetMapping("/listar")
    public List<DealershipModel> getDealership() {
        return dealershipService.listDealership();
    }

    @GetMapping("/listar/{id}")
    public DealershipModel getDealershipById(@PathVariable Long id) {
        return dealershipService.getDealershipById(id);
    }

    @PostMapping("/criar")
    public DealershipModel createDealership(@RequestBody DealershipModel dealershipModel) {
        return dealershipService.createDealership(dealershipModel);
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
