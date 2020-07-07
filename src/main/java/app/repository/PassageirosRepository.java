package app.repository;

import app.domain.entities.Passageiros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*! \brief Camada de abstração feita pelo ORM (JPA) para acesso e gestão de dados na tabela "Passageiros" */
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */

@Repository
public interface PassageirosRepository extends JpaRepository<Passageiros, String> {

}
