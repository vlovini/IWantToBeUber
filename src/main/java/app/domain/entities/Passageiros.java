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

/*! \brief Implementação da Classe Passageiros, com base na tabela homônima constante no Banco de Dados */
/*! \details Projeção JPA do conjunto de entidades "Passageiros" no Banco de dados - Herda atributos básicos da classe "AbstractPessoa" */
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public class Passageiros extends AbstractPessoa {

    @Id
    @Column(name = "CPF_PASSAGEIRO")
    @JsonProperty("cpfPassageiro")
    
	/// Atributo privado. Utilizado como Primary key.
	private String cpfPassageiro;

    public String getCpfPassageiro() {
	/// Método para invocar o CPF de um passageiro
        return cpfPassageiro;
    }

    public void setCpfPassageiro(String cpfPassageiro) {
	/// Método para atribuir o CPF de um passageiro
        this.cpfPassageiro = cpfPassageiro;
    }

}
