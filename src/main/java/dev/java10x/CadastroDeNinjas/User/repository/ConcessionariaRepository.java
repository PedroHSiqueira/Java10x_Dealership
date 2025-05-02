package dev.java10x.CadastroDeNinjas.User.repository;

import dev.java10x.CadastroDeNinjas.User.model.ConcessionariaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcessionariaRepository extends JpaRepository<ConcessionariaModel, Long> {
}
