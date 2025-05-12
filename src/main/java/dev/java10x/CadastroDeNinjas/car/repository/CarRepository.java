package dev.java10x.CadastroDeNinjas.car.repository;

import dev.java10x.CadastroDeNinjas.car.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarModel, Long> {
}
