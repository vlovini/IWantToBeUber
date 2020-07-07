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


/*! \brief Implementação da Classe Condutores, com base na tabela homônima constante no Banco de Dados */
/*! \details Projeção JPA do conjunto de entidades "Condutores" no Banco de dados - Herda atributos básicos da classe "AbstractPessoa" */
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public class Condutores extends AbstractPessoa {
    @Id
    @Column(name = "CPF_CONDUTOR")
    @JsonProperty("cpfCondutor")

	/// Atributo privado. Utilizado como Primary key.
    private String cpfCondutor;

    public String getCpfCondutor() {
/// Método para invocar o CPF de um condutor
        return cpfCondutor;
    }


    public void setCpfCondutor(String cpfCondutor) {
/// Método para atribuir o CPF de um condutor
        this.cpfCondutor = cpfCondutor;
    }

}
