package app.repository;

import app.domain.entities.Marcas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*! \brief Camada de abstração feita pelo ORM (JPA) para acesso e gestão de dados na tabela "Marcas" */
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */

@Repository
public interface MarcasRepository extends JpaRepository<Marcas, Integer> {

}
