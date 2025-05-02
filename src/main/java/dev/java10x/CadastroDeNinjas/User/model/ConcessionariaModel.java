package dev.java10x.CadastroDeNinjas.User.model;

import dev.java10x.CadastroDeNinjas.Car.model.CarroModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_concessionaria")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConcessionariaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomes;
    private String email;

    @OneToMany(mappedBy = "concessionaria") // uma concessionaria para varios carros | Mapeado pelo campo da outra tabela
    private List<CarroModel> carros;
}
