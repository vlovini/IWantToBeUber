package app.domain.entities;

import app.domain.AbstractPessoa;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

<<<<<<< HEAD
=======
/*! \brief Projeção JPA para aplicação do conjunto de entidades "Condutores" no Banco de dados - Herda atributos básicos da classe "AbstractPessoa" */
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
>>>>>>> dfa6bfa7c1eaf5b8c615d640b64196325ed3712f

@Entity(name = "Condutores")
@Table(name = "CONDUTORES")
@JsonIgnoreProperties(ignoreUnknown = true)


/*! \brief Projeção JPA do conjunto de entidades "Condutores" no Banco de dados - Herda atributos básicos da classe "AbstractPessoa" */
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public class Condutores extends AbstractPessoa {
    @Id
    @Column(name = "CPF_CONDUTOR")
    @JsonProperty("cpfCondutor")
<<<<<<< HEAD
/*! @param cpfCondutor é uma primary key */
=======
    /** Chave primaria da tabela Condutores */
>>>>>>> dfa6bfa7c1eaf5b8c615d640b64196325ed3712f
    private String cpfCondutor;
/**
 * Método para invocar o CPF de um condutor
*/
    public String getCpfCondutor() {
        return cpfCondutor;
    }
/**
  * Método para invocar o CPF de um condutor
*/
    public void setCpfCondutor(String cpfCondutor) {
        this.cpfCondutor = cpfCondutor;
    }

}
