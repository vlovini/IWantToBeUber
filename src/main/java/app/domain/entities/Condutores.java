package app.domain.entities;

import app.domain.AbstractPessoa;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*! \brief Projeção JPA para aplicação do conjunto de entidades "Condutores" no Banco de dados - Herda atributos básicos da classe "AbstractPessoa" */
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */

@Entity(name = "Condutores")
@Table(name = "CONDUTORES")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Condutores extends AbstractPessoa {

    @Id
    @Column(name = "CPF_CONDUTOR")
    @JsonProperty("cpfCondutor")
    /** Chave primaria da tabela Condutores */
    private String cpfCondutor;

    public String getCpfCondutor() {
        return cpfCondutor;
    }

    public void setCpfCondutor(String cpfCondutor) {
        this.cpfCondutor = cpfCondutor;
    }

}
