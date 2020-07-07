package app.service;

import app.config.dto.VeiculosDTO;

import java.util.List;
/*! \brief Interface - Serviço dedicado a lógica de negócio no cadastro e obtenção de registros de carros no sistema. */
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public interface VeiculosService {
    /**
     * @brief Get de todas os carros disponíveis no sistema
     * @details Retorno do registro dos carros contigos no banco
     * @return Lista de objetos do tipo "VeiculosDTO".
     */
    List<VeiculosDTO> getCarros();
     /**
     * @brief Get de um veículo específico se disponível no sistema
     * @details Retorno do carro para um dado 'Renavam';
     * @param[String] Renavam - ID do veículo desejado.
     * @return Objeto do tipo "VeiculosDTO".
     */
    VeiculosDTO getCarro(String Renavam);
}
