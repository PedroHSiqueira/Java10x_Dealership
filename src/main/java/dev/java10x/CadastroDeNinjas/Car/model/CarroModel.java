package dev.java10x.CadastroDeNinjas.Car.model;

import dev.java10x.CadastroDeNinjas.User.model.ConcessionariaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_car")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    @Column(unique = true)
    private String placa;
    private String cor;

    @ManyToOne // Muitos carros para uma concessionaria
    @JoinColumn(name = "concessionaria_id")
    private ConcessionariaModel concessionaria;
}
