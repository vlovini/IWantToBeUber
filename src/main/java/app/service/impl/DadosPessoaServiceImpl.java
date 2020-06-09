package app.service.impl;

import app.domain.entities.Condutores;
import app.domain.entities.Passageiros;
import app.repository.CondutoresRepository;
import app.repository.PassageirosRepository;
import app.service.DadosPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DadosPessoaServiceImpl implements DadosPessoaService {

    @Autowired
    CondutoresRepository condutoresRepository;

    @Autowired
    PassageirosRepository passageirosRepository;

    @Override
    public List<Passageiros> getPassageiros(){
        return passageirosRepository.findAll();
    }

    @Override
    public List<Condutores> getCondutores(){
        return condutoresRepository.findAll();
    }

    @Override
    public Passageiros getPassageiro(String CPF){
        return passageirosRepository.getOne(CPF);
    }

    @Override
    public Condutores getCondutor(String CPF){
        return condutoresRepository.getOne(CPF);
    }

    @Override
    public void setPassageiro(Passageiros passageiro){
        passageirosRepository.save(passageiro);
    }

    @Override
    public void setCondutor(Condutores condutores){
        condutoresRepository.save(condutores);
    }

}
