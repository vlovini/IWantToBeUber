package app.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.util.Date;
/*! \brief Classe AbstractPessoa*/
/*! \details Classe pai com estrutura de atributos base de dados referentes a pessoas, sendo aproveitada para Condutores e Passageiros*/
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
@MappedSuperclass
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbstractPessoa {
	/// DIVISORIA
    @NotNull
    @Column(name = "NOME")
    @JsonProperty("nome")
    /// Atributo privado do tipo String.
	private String nome;
	/// DIVISORIA
    
	@NotNull
    @Column(name = "TELEFONE")
    @JsonProperty("telefone")
    /// Atributo privado do tipo String.
	private String telefone;
	/// DIVISORIA
    
	@NotNull
    @Column(name = "DATA_CADASTRO")
    @JsonProperty("dataCadastro")
	/// Atributo privado do tipo Date.
    private Date dataCadastro;
	
    public String getNome() {
	/// Método retorna um objeto nome do tipo String. \n
        return nome;
    }

    public void setNome(String nome) {
	/// Método atribui ao objeto criado as propriedades de um objeto string 'nome' passado como parametro. \n
        this.nome = nome;
    }

    public String getTelefone() {
	/// Método retorna um objeto telefone do tipo String. \n
        return telefone;
    }

    public void setTelefone(String telefone) {
	/// Método atribui ao objeto criado as propriedades de um objeto string 'telefone' passado como parametro. \n
        this.telefone = telefone;
    }

    public Date getDataCadastro() {
	/// Método retorna um objeto DataCadastro do tipo Date. \n
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
	/// Método atribui ao objeto criado as propriedades de um objeto Date 'dataCadastro' passado como parametro. \n
        this.dataCadastro = dataCadastro;
    }
}
