package dev.java10x.CadastroDeNinjas.dealership.model;

import dev.java10x.CadastroDeNinjas.Car.model.CarModel;
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
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email", unique = true)
    private String email;

    @OneToMany(mappedBy = "concessionaria") // uma concessionaria para varios carros | Mapeado pelo campo da outra tabela
    private List<CarModel> carros;
}
