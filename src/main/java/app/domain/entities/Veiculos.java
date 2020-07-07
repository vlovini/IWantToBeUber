package app.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity(name = "Veiculos")
@Table(name = "VEICULOS")
@JsonIgnoreProperties(ignoreUnknown = true)

/*! \brief Implementação da Classe Veiculos, com base na tabela homônima constante no Banco de Dados */
/*! \details Projeção JPA do conjunto de entidades "Veiculos" no Banco de dados. /*
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */

public class Veiculos {

    @Id
    @Column(name = "RENAVAM")
    @JsonProperty("renavam")
	///   
	/// Atributo String que contém o Renavam do veículo, sendo sua Primary Key
    private String renavam;

    @NotNull
    @Column(name = "PLACA")
    @JsonProperty("placa")
	///   
	/// Atributo String que contém a placa do veículo.
    private String placa;

    @NotNull
    @Column(name = "FK_MODELO", nullable = false)
    @JoinColumn(name = "idModelo")
    @JsonProperty("fkModelo")
	///   
	/// Atributo int que contém a Foreign Key para vincular o veículo a um modelo de carro.
    private int fkModelo;

    @NotNull
    @Column(name = "ANO", nullable = false)
    @JsonProperty("ano")
	///   
	/// Atributo String para registrar o ano de fabricação do veículo.
    private String ano;

    public String getRenavam() {
	/// Método para obter o Renavam do veículo, que é sua Primary Key.
        return renavam;
    }

    public void setRenavam(String renavam) {
	/// Método para definir o Renavam do veículo, que é sua Primary Key.
        this.renavam = renavam;
    }

    public String getPlaca() {
	/// Método para obter a String com a placa do veículo.
        return placa;
    }

    public void setPlaca(String placa) {
	/// Método para definir a placa do veículo, com base na String informada como parametro.
        this.placa = placa;
    }

    public int getFkModelo() {
	/// Método para obter a Foreign Key que vincula o Veículo a um modelo de carro.
        return fkModelo;
    }

    public void setFkModelo(int fkModelo) {
	/// Método para definir a Foreign Key que vincula o Veículo a um modelo de carro, utilizando um inteiro passado como parametro.
        this.fkModelo = fkModelo;
    }

    public String getAno() {
	/// Método para obter a String com o ano de fabricação do veículo.
        return ano;
    }

    public void setAno(String ano) {
	/// Método para definir a String com o ano de fabricação do veículo, com base no parametro informado.
        this.ano = ano;
    }

}
