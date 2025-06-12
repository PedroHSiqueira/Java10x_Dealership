package dev.java10x.CadastroDeNinjas.dealership.DTO;

import dev.java10x.CadastroDeNinjas.car.model.CarModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealershipDTO {
    private Long id;
    private String nome;
    private String email;
    private List<CarModel> carros;
}
