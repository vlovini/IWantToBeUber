package app.config.rest.v1.controller;

import app.domain.views.DetalhesCondutor;
import app.domain.views.DetalhesCorrida;
import app.domain.views.DetalhesVeiculo;
import app.repository.DetalhesCondutorViewRepository;
import app.repository.DetalhesCorridaViewRepository;
import app.repository.DetalhesVeiculoViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/views/")
public class ViewsController {

    @Autowired
    DetalhesVeiculoViewRepository detalhesVeiculoViewRepository;

    @Autowired
    DetalhesCondutorViewRepository detalhesCondutorViewRepository;

    @Autowired
    DetalhesCorridaViewRepository detalhesCorridaViewRepository;

    @GetMapping("/corridas")
    public List<DetalhesCorrida> getCorridas() {
        return detalhesCorridaViewRepository.findAll();
    }

    @GetMapping("/veiculos")
    public List<DetalhesVeiculo> getVeiculos() {
        return detalhesVeiculoViewRepository.findAll();
    }

    @GetMapping("/condutores")
    public List<DetalhesCondutor> getCondutores() {
        return detalhesCondutorViewRepository.findAll();
    }

    @GetMapping("/corridas/{id}")
    public DetalhesCorrida getCorrida(@PathVariable int id) {
        return detalhesCorridaViewRepository.getOne(id);
    }

    @GetMapping("/veiculos/{renavam}")
    public DetalhesVeiculo getVeiculo(@PathVariable String renavam) {
        return detalhesVeiculoViewRepository.getOne(renavam);
    }

    @GetMapping("/condutores/{cpf}")
    public DetalhesCondutor getCondutor(@PathVariable String cpf) {
        return detalhesCondutorViewRepository.getOne(cpf);
    }
}


