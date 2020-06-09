package app.config.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class CorridasDTO {
    @JsonProperty("idCorrida")
    int idCorrida;

    @JsonProperty("avaliacaoCondutor")
    int avaliacaoCondutor;

    @JsonProperty("avaliacaoVeiculo")
    int avaliacaoVeiculo;

    @JsonProperty("dataInicio")
    Date dataInicio;

    @JsonProperty("dataFim")
    Date dataFim;

    @JsonProperty("origem")
    String origem;

    @JsonProperty("destino")
    String destino;

    @JsonProperty("tarifa")
    float tarifa;

    @JsonProperty("distancia")
    float distancia;

    @JsonProperty("fkAluguel")
    int fkAluguel;

    @JsonProperty("nomeCondutor")
    String nomeCondutor;

    @JsonProperty("fkPassageiro")
    String fkPassageiro;

    @JsonProperty("nomePassageiro")
    String nomePassageiro;


    public CorridasDTO(int idCorrida, Date dataInicio, String origem, String destino, int fkAluguel,
                       String fkPassageiro, float tarifa, float distancia, Date dataFim, int avaliacaoCondutor, int avaliacaoVeiculo){
        this.setIdCorrida(idCorrida);
        this.setDataInicio(dataInicio);
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setFkAluguel(fkAluguel);
        this.setFkPassageiro(fkPassageiro);
        this.setTarifa(tarifa);
        this.setDistancia(distancia);
        this.setDataFim(dataFim);
        this.setAvaliacaoCondutor(avaliacaoCondutor);
        this.setAvaliacaoVeiculo(avaliacaoVeiculo);
    }

    public int getIdCorrida() {
        return idCorrida;
    }

    public void setIdCorrida(int idCorrida) {
        this.idCorrida = idCorrida;
    }

    public int getAvaliacaoCondutor() {
        return avaliacaoCondutor;
    }

    public void setAvaliacaoCondutor(int avaliacaoCondutor) {
        this.avaliacaoCondutor = avaliacaoCondutor;
    }

    public int getAvaliacaoVeiculo() {
        return avaliacaoVeiculo;
    }

    public void setAvaliacaoVeiculo(int avaliacaoVeiculo) {
        this.avaliacaoVeiculo = avaliacaoVeiculo;
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

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public int getFkAluguel() {
        return fkAluguel;
    }

    public void setFkAluguel(int fkAluguel) {
        this.fkAluguel = fkAluguel;
    }

    public String getFkPassageiro() {
        return fkPassageiro;
    }

    public void setFkPassageiro(String fkPassageiro) {
        this.fkPassageiro = fkPassageiro;
    }

    public String getNomeCondutor() {
        return nomeCondutor;
    }

    public void setNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }
}
