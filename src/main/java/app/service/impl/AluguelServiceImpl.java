package app.service.impl;

import app.config.dto.AluguelDTO;
import app.domain.entities.Aluguel;
import app.repository.AluguelRepository;
import app.service.AluguelService;
import app.service.DadosPessoaService;
import app.service.VeiculosService;
import org.hibernate.exception.GenericJDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class AluguelServiceImpl implements AluguelService {

    @Autowired
    AluguelRepository aluguelRepository;

    @Autowired
    DadosPessoaService dadosPessoaService;

    @Autowired
    VeiculosService veiculosService;

    @Override
    public List<AluguelDTO> getAlugueis(){
        List<AluguelDTO> aluguelDTOS = new ArrayList<>();
        List<Aluguel> aluguels = aluguelRepository.findAll();
        for (Aluguel a: aluguels) {
            aluguelDTOS.add(this.getAluguelDTOFromAluguel(a));
        }
        return aluguelDTOS;
    }

    @Override
    public AluguelDTO getAluguel(int idAluguel){
        return this.getAluguelDTOFromAluguel(aluguelRepository.getOne(idAluguel));
    }

    private AluguelDTO getAluguelDTOFromAluguel(Aluguel a){
        AluguelDTO aluguelDTO = new AluguelDTO(
                a.getIdAluguel(),
                a.getDataInicio(),
                a.getFkCPFCondutor(),
                a.getFkRenavam(),
                a.getDataFim()
        );
        aluguelDTO.setNomeCondutor(dadosPessoaService.getCondutor(a.getFkCPFCondutor()).getNome());
        aluguelDTO.setPlacaVeiculo(veiculosService.getCarro(a.getFkRenavam()).getPlaca());
        return aluguelDTO;
    }

    @Override
    public void setAluguel(Aluguel aluguel) throws SQLException{
        try {
            aluguelRepository.save(aluguel);
        }catch (Exception e){
            throw new SQLException(e.getMessage(), e.getCause());
        }
    }


}
