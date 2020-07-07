package app.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "Marcas")
@Table(name = "MARCAS")
/*! \brief Implementação da Classe Marcas, com base na tabela homônima constante no Banco de Dados */
/*! \details Projeção JPA do conjunto de entidades "Marcas" (dos carros) no Banco de dados. /*
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public class Marcas {

    @Id
    @Column(name = "IDMARCA")
    @JsonProperty("idMarca")
	///  
	/// Atributo Primary Key dos objetos Marca
    private int idMarca;

    @NotNull
    @Column(name = "NOME")
    @JsonProperty("nome")
	///  
	/// Atributo referente ao nome da Marca
    private String nome;

    public int getIdMarca() {
	/// Método para acessar a Primary Key dos objetos 'Marca'.
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
	/// Método para definir a Primary Key dos objetos 'Marca', com base no parametro de entrada.
        this.idMarca = idMarca;
    }

    public String getNome() {
	/// Método para acessar o nome da Marca.
        return nome;
    }

    public void setNome(String nome) {
	/// Método para definir o nome da Marca.
        this.nome = nome;
    }


}
