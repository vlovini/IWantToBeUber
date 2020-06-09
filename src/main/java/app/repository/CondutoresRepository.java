package app.repository;

import app.domain.entities.Condutores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondutoresRepository extends JpaRepository<Condutores, String> {

}
