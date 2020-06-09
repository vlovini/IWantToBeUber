package app.config.rest.v1.controller;

import app.domain.entities.Condutores;
import app.domain.entities.Passageiros;
import app.service.DadosPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DadosPessoaController {

    @Autowired
    DadosPessoaService dadosPessoaService;

    @GetMapping("/passageiros")
    public List<Passageiros> getPassageiros() {
        return dadosPessoaService.getPassageiros();
    }

    @GetMapping("/passageiros/{CPF}")
    public Passageiros getPassageiros(@PathVariable String CPF) {
        return dadosPessoaService.getPassageiro(CPF);
    }

    @PostMapping("/passageiros/")
    public void setNewPassageiro(@Valid @RequestBody Passageiros passageiro){
        dadosPessoaService.setPassageiro(passageiro);
    }

    @GetMapping("/condutores")
    public List<Condutores> getCondutores() {
        return dadosPessoaService.getCondutores();
    }

    @GetMapping("/condutores/{CPF}")
    public Condutores getCondutores(@PathVariable String CPF) {
        return dadosPessoaService.getCondutor(CPF);
    }

    @PostMapping("/condutores/")
    public void setNewCondutor(@Valid @RequestBody Condutores condutor){
        dadosPessoaService.setCondutor(condutor);
    }
}