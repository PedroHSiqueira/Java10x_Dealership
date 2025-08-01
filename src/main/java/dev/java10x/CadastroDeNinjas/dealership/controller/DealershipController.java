package dev.java10x.CadastroDeNinjas.dealership.controller;

import dev.java10x.CadastroDeNinjas.dealership.DTO.DealershipDTO;
import dev.java10x.CadastroDeNinjas.dealership.model.DealershipModel;
import dev.java10x.CadastroDeNinjas.dealership.service.DealershipService;
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
    public DealershipDTO createDealership(@RequestBody DealershipDTO dealershipModel) {
        return dealershipService.createDealership(dealershipModel);
    }

    @PutMapping("/atualizar/{id}")
    public DealershipModel updateDealership(@PathVariable Long id, @RequestBody DealershipModel dealershipModelAtualizado) {
        return dealershipService.updateDealership(id, dealershipModelAtualizado);
    }

    @DeleteMapping("/deletar/{id}")
    public void deleteDealeship(@PathVariable Long id) {
        dealershipService.deleteDealershipById(id);
    }
}
