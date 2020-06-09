package app.repository;

import app.domain.views.DetalhesCondutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalhesCondutorViewRepository extends JpaRepository<DetalhesCondutor, String>, JpaSpecificationExecutor<DetalhesCondutor> {

}
