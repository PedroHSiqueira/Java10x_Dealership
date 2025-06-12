package dev.java10x.CadastroDeNinjas.car.DTO;

import dev.java10x.CadastroDeNinjas.dealership.model.DealershipModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
    private long id;
    private String modelo;
    private String marca;
    private String placa;
    private DealershipModel concessionaria;
}
