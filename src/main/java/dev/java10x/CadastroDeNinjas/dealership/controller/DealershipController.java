package dev.java10x.CadastroDeNinjas.dealership.controller;

import dev.java10x.CadastroDeNinjas.dealership.DTO.DealershipDTO;
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
    public DealershipDTO getDealershipById(@PathVariable Long id) {
        return dealershipService.getDealershipById(id);
    }

    @PostMapping("/criar")
    public ResponseEntity<String> createDealership(@RequestBody DealershipDTO dealershipModel) {
        dealershipService.createDealership(dealershipModel);
        return ResponseEntity.status(HttpStatus.CREATED).body("A concessionaria foi adicionada com sucesso!");
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> updateDealership(@PathVariable Long id, @RequestBody DealershipModel dealershipModelAtualizado) {
        if (dealershipService.getDealershipById(id) == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Item não encontrado!");
        }

        dealershipService.updateDealership(id, dealershipModelAtualizado);
        return ResponseEntity.status(HttpStatus.OK).body("Item atualizado com sucesso!");
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deleteDealeship(@PathVariable Long id) {
        if (dealershipService.getDealershipById(id) == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Item não encontrado!");
        }
        dealershipService.deleteDealershipById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Item deletado com sucesso!");
    }
}
