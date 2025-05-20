package dev.java10x.CadastroDeNinjas.car.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinjas.dealership.model.DealershipModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_car")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "placa")
    private String placa;

    @ManyToOne
    @JoinColumn(name = "concessionaria_id")
    @JsonIgnore
    private DealershipModel concessionaria;

}
