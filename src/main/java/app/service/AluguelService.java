package app.service;

import app.config.dto.AluguelDTO;
import app.domain.entities.Aluguel;

import java.sql.SQLException;
import java.util.List;
/*! \brief Interface - Serviço dedicado a lógica de negócio no cadastro e obtenção de alugueis no sistema. */
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public interface AluguelService {

    /**
     * @brief Get de todas os alugueis de veículos disponíveis no sistema
     * @details Retorno dos alugueis contidos no banco
     * @return Lista de objetos do tipo "AluguelDTO".
     */
    public List<AluguelDTO> getAlugueis();

    /**
     * @brief Get de um aluguel especifico se disponível no sistema
     * @details Retorno de aluguel para um dado 'id';
     * @param[in] int - ID do aluguel desejado
     * @return Objeto do tipo "AluguelDTO".
     */
    public AluguelDTO getAluguel(int idAluguel);


    /**
     * @brief Set de um dado aluguel se disponível no sistema
     * @details Persiste um aluguel com os atributos passados pelo usuário oriundos da API;
     * @param[in] Alugueis - Objeto do tipo "Aluguel"
     */
    public void setAluguel(Aluguel aluguel) throws SQLException;

}
