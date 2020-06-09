package app.repository;

import app.domain.entities.Corridas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorridasRepository extends JpaRepository<Corridas, Integer> {

}
