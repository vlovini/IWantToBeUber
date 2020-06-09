package app.repository;

import app.domain.entities.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculosRepository extends JpaRepository<Veiculos, String> {

    Veiculos findByRenavam(String renavam);

}
