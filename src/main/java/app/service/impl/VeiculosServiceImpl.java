package app.service.impl;

import app.config.dto.VeiculosDTO;
import app.domain.entities.Modelos;
import app.domain.entities.Veiculos;
import app.repository.MarcasRepository;
import app.repository.ModelosRepository;
import app.repository.VeiculosRepository;
import app.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class VeiculosServiceImpl implements VeiculosService {

    @Autowired
    VeiculosRepository veiculosRepository;

    @Autowired
    ModelosRepository modelosRepository;

    @Autowired
    MarcasRepository marcasRepository;

    @Override
    public List<VeiculosDTO> getCarros(){
        List<VeiculosDTO> veiculosDTOS = new ArrayList<>();
        List<Veiculos> veiculos = veiculosRepository.findAll();
        for (Veiculos v: veiculos) {
            veiculosDTOS.add(this.getVeiculoDTOFromVeiculo(v));
        }
        return veiculosDTOS;
    }

    @Override
    public VeiculosDTO getCarro(String Renavam){
        return this.getVeiculoDTOFromVeiculo(veiculosRepository.getOne(Renavam));
    }

    private VeiculosDTO getVeiculoDTOFromVeiculo(Veiculos v){
        VeiculosDTO veiculoDTO = new VeiculosDTO(
                v.getRenavam(),
                v.getPlaca(),
                v.getAno(),
                v.getFkModelo()
        );
        Modelos modelo = modelosRepository.getOne(v.getFkModelo());
        veiculoDTO.setModelo(modelo.getNome());
        veiculoDTO.setMarca(marcasRepository.getOne(modelo.getFkMarca()).getNome());
        return veiculoDTO;
    }
}
