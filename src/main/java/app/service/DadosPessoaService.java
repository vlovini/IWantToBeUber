package app.service;

import app.domain.entities.Condutores;
import app.domain.entities.Passageiros;

import java.util.List;

public interface DadosPessoaService {

    public List<Passageiros> getPassageiros();

    public List<Condutores> getCondutores();

    public Passageiros getPassageiro(String CPF);

    public Condutores getCondutor(String CPF);

    public void setPassageiro(Passageiros passageiro);

    public void setCondutor(Condutores condutor);


}
