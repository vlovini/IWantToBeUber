package app.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.util.Date;
/*! \brief Classe pai com estrutura de atributos base de dados referentes a pessoas*/
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
@MappedSuperclass
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbstractPessoa {

    @NotNull
    @Column(name = "NOME")
    @JsonProperty("nome")
    private String nome;

    @NotNull
    @Column(name = "TELEFONE")
    @JsonProperty("telefone")
    private String telefone;

    @NotNull
    @Column(name = "DATA_CADASTRO")
    @JsonProperty("dataCadastro")
    private Date dataCadastro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
