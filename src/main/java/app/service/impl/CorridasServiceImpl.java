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

@Component
public class CorridasServiceImpl implements CorridasService {

    @Autowired
    AluguelService aluguelService;

    @Autowired
    DadosPessoaService dadosPessoaService;

    @Autowired
    CorridasRepository corridasRepository;

    @Override
    public List<CorridasDTO> getCorridas(){
        List<CorridasDTO> corridasDTOS = new ArrayList<>();
        List<Corridas> corridas = corridasRepository.findAll();
        for (Corridas c: corridas) {
            corridasDTOS.add(this.getCorridaDTOFromCorrida(c));
        }
        return corridasDTOS;
    }

    @Override
    public CorridasDTO getCorrida(int idCorrida){
        return this.getCorridaDTOFromCorrida(corridasRepository.getOne(idCorrida));
    }

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

    @Override
    public void setCorrida(Corridas corrida) throws GenericJDBCException{
        try {
            corridasRepository.save(corrida);
        }catch (GenericJDBCException e){
            throw new GenericJDBCException(e.getSQLException().getCause().toString(), e.getSQLException());
        }
    }
}
