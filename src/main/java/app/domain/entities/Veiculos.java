package app.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity(name = "Veiculos")
@Table(name = "VEICULOS")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Veiculos {

    @Id
    @Column(name = "RENAVAM")
    @JsonProperty("renavam")
    private String renavam;

    @NotNull
    @Column(name = "PLACA")
    @JsonProperty("placa")
    private String placa;

    @NotNull
    @Column(name = "FK_MODELO", nullable = false)
    @JoinColumn(name = "idModelo")
    @JsonProperty("fkModelo")
    private int fkModelo;

    @NotNull
    @Column(name = "ANO", nullable = false)
    @JsonProperty("ano")
    private String ano;

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

    public int getFkModelo() {
        return fkModelo;
    }

    public void setFkModelo(int fkModelo) {
        this.fkModelo = fkModelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

}
