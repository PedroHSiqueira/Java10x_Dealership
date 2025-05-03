package dev.java10x.CadastroDeNinjas.Car.model;

import dev.java10x.CadastroDeNinjas.dealership.model.ConcessionariaModel;
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
    @Column(name = "id")
    private Long id;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "placa", unique = true)
    private String placa;
    @Column(name = "cor")
    private String cor;

    @ManyToOne // Muitos carros para uma concessionaria
    @JoinColumn(name = "concessionaria_id")
    private ConcessionariaModel concessionaria;
}
