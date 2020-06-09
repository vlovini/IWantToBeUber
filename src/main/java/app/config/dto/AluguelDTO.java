package app.config.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class AluguelDTO {
    @JsonProperty("idAluguel")
    int idAluguel;

    @JsonProperty("dataInicio")
    Date dataInicio;

    @JsonProperty("dataFim")
    Date dataFim;

    @JsonProperty("fkCondutor")
    String fkCondutor;

    @JsonProperty("nomeCondutor")
    String nomeCondutor;

    @JsonProperty("fkVeiculo")
    String fkVeiculo;

    @JsonProperty("placaVeiculo")
    String placaVeiculo;


    public AluguelDTO(int idAluguel, Date dataInicio, String fkCondutor, String fkVeiculo, Date dataFim){
        this.setIdAluguel(idAluguel);
        this.setDataInicio(dataInicio);
        this.setFkCondutor(fkCondutor);
        this.setFkVeiculo(fkVeiculo);
        this.setDataFim(dataFim);
    }

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getFkCondutor() {
        return fkCondutor;
    }

    public void setFkCondutor(String fkCondutor) {
        this.fkCondutor = fkCondutor;
    }

    public String getFkVeiculo() {
        return fkVeiculo;
    }

    public void setFkVeiculo(String fkVeiculo) {
        this.fkVeiculo = fkVeiculo;
    }

    public String getNomeCondutor() {
        return nomeCondutor;
    }

    public void setNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }
}
