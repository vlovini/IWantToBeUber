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
        return veiculosService.getCarros();
    }

    @GetMapping("/{renavam}")
    public VeiculosDTO getVeiculo(@PathVariable String renavam) {
        return veiculosService.getCarro(renavam);
    }

    @GetMapping("/marcas")
    public List<Marcas> getMarcas(){
        return marcasRepository.findAll();
    }

    @GetMapping("/marcas/{id}")
    public Marcas getMarca(@PathVariable int id){
        return marcasRepository.getOne(id);
    }

    @PostMapping("/marcas")
    public void setMarca(@Valid @RequestBody Marcas marca){
        marcasRepository.save(marca);
    }


    @GetMapping("/modelos")
    public List<Modelos> getModelos(){
        return modelosRepository.findAll();
    }

    @GetMapping("/modelos/{id}")
    public Modelos getModelo(@PathVariable int id){
        return modelosRepository.getOne(id);
    }

    @PostMapping("/modelos")
    public void setModelo(@Valid @RequestBody Modelos modelo){
        modelosRepository.save(modelo);
    }



}
