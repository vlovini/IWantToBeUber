package app.service;

import app.config.dto.VeiculosDTO;

import java.util.List;

public interface VeiculosService {

    List<VeiculosDTO> getCarros();

    VeiculosDTO getCarro(String Renavam);
}
