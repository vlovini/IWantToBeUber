package app.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity(name = "Modelos")
@Table(name = "MODELOS")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
/*! \brief Implementação da Classe Modelos (dos carros), com base na tabela homônima constante no Banco de Dados */
/*! \details Projeção JPA do conjunto de entidades "Modelos" (dos carros) no Banco de dados. /*
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public class Modelos {

    @Id
    @Column(name = "IDMODELO")
    @JsonProperty("idModelo")
	///  
	/// Atributo do tipo int para ser utilizado como Primary Key.
    private int idModelo;

    @NotNull
    @Column(name = "NOME")
    @JsonProperty("nome")
	///  
	/// Atributo do tipo String para ser utilizado como nome da modelo do carro.
    private String nome;

    @NotNull
    @Column(name = "FK_MARCA", nullable = false)
    @JsonProperty("fkMarca")
	///  
	/// Atributo do tipo int para ser utilizado foreign key com a marca deste modelo de carro. nome da modelo do carro.
    private int fkMarca;

    public int getIdModelo() {
	/// Método para obter a primary key do objeto instanciado.
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
	/// Método para definir a primary key do objeto a ser instanciado, com base no parametro informado.
        this.idModelo = idModelo;
    }

    public String getNome() {
	/// Método para obter o objeto String com o nome do modelo do carro.
        return nome;
    }

    public void setNome(String nome) {
	/// Método para definir o nome do modelo do carro, conforme String informada como parametro.
        this.nome = nome;
    }

    public int getFkMarca() {
	/// Método para obter a Foreign  Key que vincula este modelo de carro a uma marca de carro.
        return fkMarca;
    }

    public void setFkMarca(int fkMarca) {
	/// Método para definir a Foreign Key da marca de carro.
        this.fkMarca = fkMarca;
    }


}
