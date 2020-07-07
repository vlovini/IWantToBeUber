package app.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "Aluguel")
@Table(name = "ALUGUEL")
@JsonIgnoreProperties(ignoreUnknown = true)

/*! \brief Implementação da Classe Aluguel, com base na tabela homônima constante no Banco de Dados */
/*! \details Projeção JPA do conjunto de entidades "Aluguel" no Banco de dados. */
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public class Aluguel {

    @Id
    @GeneratedValue(generator = "UUID_GENERATOR")
    @Column(name = "IDALUGUEL")
    @JsonProperty("idAluguel")
	///  
	/// Atributo Primary Key dos objetos aluguel.
    private int idAluguel;
	
    @NotNull
    @Column(name = "DATA_INICIO")
    @JsonProperty("dataInicio")
	///  
	/// Atributo Date para registro da data de inicio dos objetos aluguel.
    private Date dataInicio;

    @Column(name = "DATA_FIM")
    @JsonProperty("dataFim")
	///  
	/// Atributo Date para registro da data de fim dos objetos aluguel.
    private Date dataFim;

    @NotNull
    @Column(name = "FK_CPF_CONDUTOR", nullable = false)
    @JsonProperty("fkCPFCondutor")
	///  
	/// Atributo String para registro da Foreign Key do condutor deste aluguel.
    private String fkCPFCondutor;

    @NotNull
    @Column(name = "FK_RENAVAM", nullable = false)
    @JsonProperty("fkRenavam")
	///  
	/// Atributo String para registro da Foreign Key do veículo deste aluguel.
    private String fkRenavam;

    public int getIdAluguel() {
	/// Método retorna um inteiro referente ao ID do registro Aluguel.
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
	/// Método define um ID para o registro aluguel, com base no parametro passado.
        this.idAluguel = idAluguel;
    }

    public Date getDataInicio() {
	/// Método retorna uma informação do tipo date que diz respeito a data de inicio do aluguel.
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
	/// Método define uma data de inicio do aluguel no objeto instanciado. Recebe uma informação do tipo date como parametro.
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
	/// Método retorna uma informação do tipo date que diz respeito a data de fim do aluguel.
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
	/// Método define uma data de fim do aluguel no objeto instanciado. Recebe uma informação do tipo date como parametro.
        this.dataFim = dataFim;
    }

    public String getFkCPFCondutor() {
	/// Método para acessar a foreign Key referente ao CPF do condutor. 
        return fkCPFCondutor;
    }

    public void setFkCPFCondutor(String fkCPFCondutor) {
	/// Método para definir a foreign Key do CPF do condutor. 
        this.fkCPFCondutor = fkCPFCondutor;
    }

    public String getFkRenavam() {
	/// Método para acessar a foreign Key referente ao Renavam do veiculo. 
        return fkRenavam;
    }

    public void setFkRenavam(String fkRenavam) {
	/// Método para definir a foreign Key do Renavam do veiculo. 
        this.fkRenavam = fkRenavam;
    }
}
