package app.domain.entities;

import app.domain.AbstractPessoa;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Passageiros")
@Table(name = "PASSAGEIROS")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Passageiros extends AbstractPessoa {

    @Id
    @Column(name = "CPF_PASSAGEIRO")
    @JsonProperty("cpfPassageiro")
    private String cpfPassageiro;

    public String getCpfPassageiro() {
        return cpfPassageiro;
    }

    public void setCpfPassageiro(String cpfCondutor) {
        this.cpfPassageiro = cpfCondutor;
    }

}
