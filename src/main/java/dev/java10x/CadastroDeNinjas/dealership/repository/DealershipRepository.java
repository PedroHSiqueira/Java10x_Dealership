package dev.java10x.CadastroDeNinjas.dealership.repository;

import dev.java10x.CadastroDeNinjas.dealership.model.DealershipModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealershipRepository extends JpaRepository<DealershipModel, Long> {
}
