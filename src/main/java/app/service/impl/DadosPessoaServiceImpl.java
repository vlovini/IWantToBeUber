package app.service.impl;

import app.domain.entities.Condutores;
import app.domain.entities.Passageiros;
import app.repository.CondutoresRepository;
import app.repository.PassageirosRepository;
import app.service.DadosPessoaService;
import br.com.caelum.stella.validation.CPFValidator;
import org.hibernate.exception.GenericJDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DadosPessoaServiceImpl implements DadosPessoaService {

    @Autowired
    CondutoresRepository condutoresRepository;

    @Autowired
    PassageirosRepository passageirosRepository;

    CPFValidator cpfValidator = new CPFValidator();

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
    public Condutores getCondutor(String CPF){ return condutoresRepository.getOne(CPF);
    }

    @Override
    public void setPassageiro(Passageiros passageiro){
        try {
            cpfValidator.assertValid(passageiro.getCpfPassageiro());
            passageirosRepository.save(passageiro);
        }catch (GenericJDBCException ex){
            throw ex;
        }
    }

    @Override
    public void setCondutor(Condutores condutores){
        try {
            cpfValidator.assertValid(condutores.getCpfCondutor());
            condutoresRepository.save(condutores);
        }catch (GenericJDBCException ex){
            throw ex;
        }
    }

}
