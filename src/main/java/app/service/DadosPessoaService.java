package app.service;

import app.domain.entities.Condutores;
import app.domain.entities.Passageiros;

import java.util.List;
/*! \brief Interface - Serviço dedicado a lógica de negócio no cadastro e obtenção do registro de pessoas no sistema. */
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public interface DadosPessoaService {

    /**
     * @brief Get de todos os passageiros disponíveis no sistema
     * @details Retorno dos passageiros contidos no banco
     * @return Lista de objetos do tipo "Passageiros".
     */
    public List<Passageiros> getPassageiros();
    /**
     * @brief Get de todas os condutores disponíveis no sistema
     * @details Retorno dos condutores cadastrados no banco
     * @return Lista de objetos do tipo "Condutores".
     */
    public List<Condutores> getCondutores();
    /**
     * @brief Get de uma um passageiro especifico se disponível no sistema
     * @details Retorno um objeto passageiro para um dado 'CPF';
     * @param[in] String - CPF do passageiro desejado.
     * @return Objeto do tipo "Passageiros".
     */
    public Passageiros getPassageiro(String CPF);
    /**
     * @brief Get de uma um condutor especifico se disponível no sistema
     * @details Retorna um objeto Condutores para um dado 'CPF';
     * @param[in] String - CPF do condutor desejado.
     * @return Objeto do tipo "Condutores".
     */
    public Condutores getCondutor(String CPF);
    /**
     * @brief Set de um dado passageiro se disponível no sistema
     * @details Define um passageiro com os atributos passados pelo usuário oriundos da API;
     * @param[in] Passageiros - Objeto do tipo "Passageiros"
     */
    public void setPassageiro(Passageiros passageiro);
    /**
     * @brief Set de um dado condutor se disponível no sistema
     * @details Define um condutor com os atributos passados pelo usuário oriundos da API;
     * @param[in] Condutores - Objeto do tipo "Condutores"
     */
    public void setCondutor(Condutores condutor);


}
