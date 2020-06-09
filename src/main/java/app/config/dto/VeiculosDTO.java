package app.config.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VeiculosDTO {

    @JsonProperty("renavam")
    String renavam;

    @JsonProperty("placa")
    String placa;

    @JsonProperty("ano")
    String ano;

    @JsonProperty("fkModelo")
    int fkModelo;

    @JsonProperty("modelo")
    String modelo;

    @JsonProperty("marca")
    String marca;

    public VeiculosDTO(String renavam, String placa, String ano, int fkModelo){
        this.setAno(ano);
        this.setRenavam(renavam);
        this.setPlaca(placa);
        this.setFkModelo(fkModelo);
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getFkModelo() {
        return fkModelo;
    }

    public void setFkModelo(int fkModelo) {
        this.fkModelo = fkModelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}