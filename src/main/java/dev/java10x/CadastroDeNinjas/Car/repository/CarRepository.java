package dev.java10x.CadastroDeNinjas.Car.repository;

import dev.java10x.CadastroDeNinjas.Car.model.CarroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarroModel, Long> {
}
