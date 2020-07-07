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
/*! \brief ViewsController */
/*! \details O que é apenas uma query em banco de dados, nesta aplicação se tornou uma classe. \n
A classe ViewsController busca do banco de dados uma síntese das informações detalhadas dos veículos, condutores e corridas. .*/
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public class ViewsController {

    @Autowired
    DetalhesVeiculoViewRepository detalhesVeiculoViewRepository;

    @Autowired
    DetalhesCondutorViewRepository detalhesCondutorViewRepository;

    @Autowired
    DetalhesCorridaViewRepository detalhesCorridaViewRepository;

    @GetMapping("/corridas")
    public List<DetalhesCorrida> getCorridas() {
/// Utiliza o repositório "DetalhesCorridaViewRepository" para encontrar todos os objetos Corridas, conforme especificado na view. <br>
/// As regras da view são definidas em app.domain.views.DetalhesCorrida.
        return detalhesCorridaViewRepository.findAll();
    }

    @GetMapping("/veiculos")
    public List<DetalhesVeiculo> getVeiculos() {
/// Utiliza o repositório "detalhesVeiculoViewRepository" para encontrar todos os objetos Veiculos, conforme especificado na view. <br>
/// As regras da view são definidas em app.domain.views.DetalhesVeiculo.
        return detalhesVeiculoViewRepository.findAll();
    }

    @GetMapping("/condutores")
    public List<DetalhesCondutor> getCondutores() {
/// Utiliza o repositório "detalhesCondutorViewRepository" para encontrar todos os objetos Condutores, conforme especificado na view. <br>
/// As regras da view são definidas em app.domain.views.DetalhesCondutor.
        return detalhesCondutorViewRepository.findAll();
    }

    @GetMapping("/corridas/{id}")
    public DetalhesCorrida getCorrida(@PathVariable int id) {
/// Utiliza o repositório "DetalhesCorridaViewRepository" para comunicar com o banco e encontrar um único objeto Corridas, conforme especificado na view e com base no ID informado no parametro. <br>
/// As regras da view são definidas em app.domain.views.DetalhesCorrida.
        return detalhesCorridaViewRepository.getOne(id);
    }

    @GetMapping("/veiculos/{renavam}")
    public DetalhesVeiculo getVeiculo(@PathVariable String renavam) {
/// Utiliza o repositório "detalhesVeiculoViewRepository" para comunicar com o banco e encontrar um único objeto Veiculos, conforme especificado na view e com base no RENAVAM informado no parametro. <br>
/// As regras da view são definidas em app.domain.views.DetalhesVeiculo.
        return detalhesVeiculoViewRepository.getOne(renavam);
    }

    @GetMapping("/condutores/{cpf}")
    public DetalhesCondutor getCondutor(@PathVariable String cpf) {
/// Utiliza o repositório "detalhesCondutorViewRepository" para comunicar com o banco e encontrar um único objeto Condutor, conforme especificado na view e com base no CPF informado no parametro. <br>
/// As regras da view são definidas em app.domain.views.DetalhesCondutor.
        return detalhesCondutorViewRepository.getOne(cpf);
    }
}