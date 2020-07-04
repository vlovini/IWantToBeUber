package app.service.impl;

import app.config.dto.AluguelDTO;
import app.config.dto.CorridasDTO;
import app.domain.entities.Corridas;
import app.repository.CorridasRepository;
import app.service.AluguelService;
import app.service.CorridasService;
import app.service.DadosPessoaService;
import org.hibernate.exception.GenericJDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
/*! \brief Implementação/Componente - Implementação do serviço dedicado a lógica de negócio no cadastro e obtenção de corridas no sistema. */
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
@Component
public class CorridasServiceImpl implements CorridasService {

    @Autowired
    AluguelService aluguelService;

    @Autowired
    DadosPessoaService dadosPessoaService;

    @Autowired
    CorridasRepository corridasRepository;

    /**
     * @brief Get de todas as corridas disponíveis no sistema
     * @details Retorno de corridas persistidas no banco
     * @return Lista de objetos do tipo "CorridaDTO".
     */
    @Override
    public List<CorridasDTO> getCorridas(){
        List<CorridasDTO> corridasDTOS = new ArrayList<>();
        List<Corridas> corridas = corridasRepository.findAll();
        for (Corridas c: corridas) {
            corridasDTOS.add(this.getCorridaDTOFromCorrida(c));
        }
        return corridasDTOS;
    }

    /**
     * @brief Get de uma dada corrida se disponível no sistema
     * @details Retorno de corrida para um dado 'id';
     * @param[in] int - ID da corrida desejada
     * @return Objeto do tipo "CorridaDTO".
     */
    @Override
    public CorridasDTO getCorrida(int idCorrida){
        return this.getCorridaDTOFromCorrida(corridasRepository.getOne(idCorrida));
    }
    /**
     * @brief Para uma dada corrida, cria um objeto CorridaDTO
     * @details Método auxiliar que retorna um "CorridaDTO" para uma dada corrida
     * @param[in] Corrida - Corrida com dados preenchidos
     * @return Objeto populado do tipo "CorridaDTO".
     */
    private CorridasDTO getCorridaDTOFromCorrida(Corridas c){
        CorridasDTO corridasDTO = new CorridasDTO(
                c.getIdCorrida(),
                c.getDataInicio(),
                c.getOrigem(),
                c.getDestino(),
                c.getFkAluguel(),
                c.getFkCPFPassageiro(),
                c.getTarifa(),
                c.getDistancia(),
                c.getDataFim(),
                c.getAvaliacaoCondutor(),
                c.getAvaliacaoVeiculo()
        );
        AluguelDTO aluguelDTO = aluguelService.getAluguel(c.getFkAluguel());
        corridasDTO.setNomeCondutor(aluguelDTO.getNomeCondutor());
        corridasDTO.setNomePassageiro(dadosPessoaService.getPassageiro(c.getFkCPFPassageiro()).getNome());
        return corridasDTO;
    }

    /**
     * @brief Set de uma dada corrida se disponível no sistema
     * @details Persiste uma corrida com os atributos passados pelo usuário oriundos da API;
     * @param[in] Corridas - Objeto do tipo "Corridas"
     */
    @Override
    public void setCorrida(Corridas corrida) throws GenericJDBCException{
        try {
            corridasRepository.save(corrida);
        }catch (GenericJDBCException e){
            throw new GenericJDBCException(e.getSQLException().getCause().toString(), e.getSQLException());
        }
    }
}
