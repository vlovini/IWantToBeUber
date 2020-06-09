package app.repository;

import app.domain.entities.Passageiros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassageirosRepository extends JpaRepository<Passageiros, String> {

}
