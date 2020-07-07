package app.repository;

import app.domain.views.DetalhesCorrida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/*! \brief Camada de abstração feita pelo ORM (JPA) para acesso e gestão de dados na view especificada em app.domain.views.DetalhesCorrida */
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */

@Repository
public interface DetalhesCorridaViewRepository extends JpaRepository<DetalhesCorrida, Integer>, JpaSpecificationExecutor<DetalhesCorrida> {

}
