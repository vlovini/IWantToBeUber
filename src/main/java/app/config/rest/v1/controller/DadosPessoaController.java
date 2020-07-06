package app.config.rest.v1.controller;

import app.domain.entities.Condutores;
import app.domain.entities.Passageiros;
import app.service.DadosPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/*! \brief DadosPessoaController */
/*! \details A classe DadosPessoaController intermedia o acesso do programa ao banco de dados, buscando um ou mais objetos dos tipos "Passageiro" ou "Condutor".*/
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */

@RestController
public class DadosPessoaController {

    @Autowired
    DadosPessoaService dadosPessoaService;

    @GetMapping("/passageiros")
    public List<Passageiros> getPassageiros() {
/// Invoca a classe dadosPessoaService para obter do Banco de Dados os objetos de cada passageiro cadastrado, salvando estes objetos em uma variavel do tipo lista.
        return dadosPessoaService.getPassageiros();
    }

    @GetMapping("/passageiros/{CPF}")
    public Passageiros getPassageiros(@PathVariable String CPF) {
/// Invoca a classe dadosPessoaService para obter do Banco de Dados um objeto passageiro específico, de acordo com o CPF informado como parametro.
        return dadosPessoaService.getPassageiro(CPF);
    }

    @PostMapping("/passageiros/")
    public void setNewPassageiro(@Valid @RequestBody Passageiros passageiro){
/// Invoca a classe dadosPessoaService para gravar no Banco de Dados um novo passageiro, conforme objeto passado como parametro.
        dadosPessoaService.setPassageiro(passageiro);
    }

    @GetMapping("/condutores")
    public List<Condutores> getCondutores() {
/// Invoca a classe dadosPessoaService para obter do Banco de Dados os objetos de cada condutor cadastrado, salvando estes objetos em uma variavel do tipo lista.
        return dadosPessoaService.getCondutores();
    }

    @GetMapping("/condutores/{CPF}")
    public Condutores getCondutores(@PathVariable String CPF) {
/// Invoca a classe dadosPessoaService para obter do Banco de Dados um objeto condutor específico, de acordo com o CPF informado como parametro.
        return dadosPessoaService.getCondutor(CPF);
    }

    @PostMapping("/condutores/")
    public void setNewCondutor(@Valid @RequestBody Condutores condutor){
/// Invoca a classe dadosPessoaService para gravar no Banco de Dados um novo conduto, conforme objeto passado como parametro.
        dadosPessoaService.setCondutor(condutor);
    }
}