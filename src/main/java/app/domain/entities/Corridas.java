package app.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "Corridas")
@Table(name = "CORRIDAS")
@JsonIgnoreProperties(ignoreUnknown = true)
@Cacheable(false)
public class Corridas {

    @Id
    @Column(name = "IDCORRIDA")
    @JsonProperty("idCorrida")
    private int idCorrida;

    @NotNull
    @Column(name = "AVALIACAO_CONDUTOR")
    @JsonProperty("avaliacaoCondutor")
    private int avaliacaoCondutor;

    @NotNull
    @Column(name = "AVALIACAO_VEICULO")
    @JsonProperty("avaliacaoVeiculo")
    private int avaliacaoVeiculo;

    @NotNull
    @Column(name = "DATA_INICIO")
    @JsonProperty("dataInicio")
    private Date dataInicio;

    @Column(name = "DATA_FIM")
    @JsonProperty("dataFim")
    private Date dataFim;

    @Column(name = "ORIGEM")
    @JsonProperty("origem")
    private String origem;

    @Column(name = "DESTINO")
    @JsonProperty("destino")
    private String destino;

    @Column(name = "TARIFA")
    @JsonProperty("tarifa")
    private float tarifa;

    @Column(name = "DISTANCIA")
    @JsonProperty("distancia")
    private float distancia;

    @NotNull
    @Column(name = "FK_ALUGUEL", nullable = false)
    @JsonProperty("fkAluguel")
    private int fkAluguel;

    @NotNull
    @Column(name = "FK_CPF_PASSAGEIRO", nullable = false)
    @JsonProperty("fkCPFPassageiro")
    private String fkCPFPassageiro;

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

    public String getFkCPFPassageiro() {
        return fkCPFPassageiro;
    }

    public void setFkCPFPassageiro(String fkCPFPassageiro) {
        this.fkCPFPassageiro = fkCPFPassageiro;
    }
}
