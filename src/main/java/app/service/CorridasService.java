package app.service;

import app.config.dto.CorridasDTO;
import app.domain.entities.Corridas;
import org.hibernate.exception.GenericJDBCException;

import java.util.List;
/*! \brief Interface - Serviço dedicado a lógica de negócio no cadastro e obtenção de corridas no sistema. */
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public interface CorridasService {
    /**
     * @brief Get de todas as corridas disponíveis no sistema
     * @details Retorno de corridas persistidas no banco
     * @return Lista de objetos do tipo "CorridaDTO".
     */
    public List<CorridasDTO> getCorridas();

    /**
     * @brief Get de uma dada corrida se disponível no sistema
     * @details Retorno de corrida para um dado 'id';
     * @param[in] int - ID da corrida desejada
     * @return Objeto do tipo "CorridaDTO".
     */
    public CorridasDTO getCorrida(int idCorrida);

    /**
     * @brief Set de uma dada corrida se disponível no sistema
     * @details Persiste uma corrida com os atributos passados pelo usuário oriundos da API;
     * @param[in] Corridas - Objeto do tipo "Corridas"
     */
    public void setCorrida(Corridas corrida) throws GenericJDBCException;

}
