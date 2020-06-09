package app.repository;

import app.domain.views.DetalhesCorrida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalhesCorridaViewRepository extends JpaRepository<DetalhesCorrida, Integer>, JpaSpecificationExecutor<DetalhesCorrida> {

}
