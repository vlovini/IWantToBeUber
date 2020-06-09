package app.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "Aluguel")
@Table(name = "ALUGUEL")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Aluguel {

    @Id
    @GeneratedValue(generator = "UUID_GENERATOR")
    @Column(name = "IDALUGUEL")
    @JsonProperty("idAluguel")
    private int idAluguel;

    @NotNull
    @Column(name = "DATA_INICIO")
    @JsonProperty("dataInicio")
    private Date dataInicio;

    @Column(name = "DATA_FIM")
    @JsonProperty("dataFim")
    private Date dataFim;

    @NotNull
    @Column(name = "FK_CPF_CONDUTOR", nullable = false)
    @JsonProperty("fkCPFCondutor")
    private String fkCPFCondutor;

    @NotNull
    @Column(name = "FK_RENAVAM", nullable = false)
    @JsonProperty("fkRenavam")
    private String fkRenavam;

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

    public String getFkCPFCondutor() {
        return fkCPFCondutor;
    }

    public void setFkCPFCondutor(String fkCPFCondutor) {
        this.fkCPFCondutor = fkCPFCondutor;
    }

    public String getFkRenavam() {
        return fkRenavam;
    }

    public void setFkRenavam(String fkRenavam) {
        this.fkRenavam = fkRenavam;
    }
}
