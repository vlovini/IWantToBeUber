package app.config.rest.v1.controller;

import app.config.dto.VeiculosDTO;
import app.domain.entities.Marcas;
import app.domain.entities.Modelos;
import app.repository.MarcasRepository;
import app.repository.ModelosRepository;
import app.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/*! \brief VeiculosController */
/*! \details A classe VeiculosController intermedia o acesso do programa ao banco de dados, buscando um ou mais objetos veiculos, com base na estrutura de objeto definida em VeiculosDTO.*/
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */

@RestController
@RequestMapping("/veiculos")
public class VeiculosController {

    @Autowired
    MarcasRepository marcasRepository;

    @Autowired
    ModelosRepository modelosRepository;

    @Autowired
    VeiculosService veiculosService;

    @GetMapping
    public List<VeiculosDTO> getVeiculos() {
/// Este método invoca a classe que trata direto com o banco (veiculosService) e retorna uma lista de objetos do tipo VeiculosDTO que contém todos os registros de veiculos contidos no banco de dados.
        return veiculosService.getCarros();
    }

    @GetMapping("/{renavam}")
    public VeiculosDTO getVeiculo(@PathVariable String renavam) {
/// Este método invoca a classe que trata direto com o banco (veiculosService) e retorna um objeto do tipo VeiculosDTO referente ao RENAVAM informado como parâmetro.
        return veiculosService.getCarro(renavam);
    }

    @GetMapping("/marcas")
    public List<Marcas> getMarcas(){
/// Utiliza a interface marcasRepository, que é uma extensão de JpaRepository, para obter a lista completa de objetos 'Marcas' contidos no banco de dados.
        return marcasRepository.findAll();
    }

    @GetMapping("/marcas/{id}")
    public Marcas getMarca(@PathVariable int id){
/// Utiliza a interface marcasRepository, que é uma extensão de JpaRepository, para obter um único objeto do tipo 'Marcas' contido no banco de dados, com base no ID informado como parametro.
        return marcasRepository.getOne(id);
    }

    @PostMapping("/marcas")
    public void setMarca(@Valid @RequestBody Marcas marca){
/// Utiliza a interface marcasRepository, que é uma extensão de JpaRepository, para gravar um objeto do tipo 'Marcas' no banco de dados, com base no objeto passado como parametro.
        marcasRepository.save(marca);
    }


    @GetMapping("/modelos")
    public List<Modelos> getModelos(){
/// Utiliza a interface modelosRepository, que é uma extensão de JpaRepository, para obter a lista completa de objetos 'Modelos' contidos no banco de dados.
        return modelosRepository.findAll();
    }

    @GetMapping("/modelos/{id}")
    public Modelos getModelo(@PathVariable int id){
/// Utiliza a interface modelosRepository, que é uma extensão de JpaRepository, para obter um único objeto do tipo 'Modelos' contido no banco de dados, com base no ID informado como parametro.
        return modelosRepository.getOne(id);
    }

    @PostMapping("/modelos")
    public void setModelo(@Valid @RequestBody Modelos modelo){
/// Utiliza a interface marcasRepository, que é uma extensão de JpaRepository, para gravar um objeto do tipo 'Modelos' no banco de dados, com base no objeto passado como parametro.
        modelosRepository.save(modelo);
    }
}
