package app.domain.entities;

import app.domain.AbstractPessoa;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Condutores")
@Table(name = "CONDUTORES")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Condutores extends AbstractPessoa {

    @Id
    @Column(name = "CPF_CONDUTOR")
    @JsonProperty("cpfCondutor")
    private String cpfCondutor;

    public String getCpfCondutor() {
        return cpfCondutor;
    }

    public void setCpfCondutor(String cpfCondutor) {
        this.cpfCondutor = cpfCondutor;
    }

}
