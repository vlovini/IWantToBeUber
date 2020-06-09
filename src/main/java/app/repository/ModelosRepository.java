package app.repository;

import app.domain.entities.Modelos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelosRepository extends JpaRepository<Modelos, Integer> {

}
