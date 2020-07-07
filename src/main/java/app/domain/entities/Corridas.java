package app.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "Corridas")
@Table(name = "CORRIDAS")
@JsonIgnoreProperties(ignoreUnknown = true)
@Cacheable(false)

/*! \brief Implementação da Classe Corridas, com base na tabela homônima constante no Banco de Dados */
/*! \details Projeção JPA do conjunto de entidades "Corridas" no Banco de dados. /*
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public class Corridas {

    @Id
    @Column(name = "IDCORRIDA")
    @JsonProperty("idCorrida")
	///   
	/// Atributo int que é a Primary dos objetos instanciados.
    private int idCorrida;

    @NotNull
    @Column(name = "AVALIACAO_CONDUTOR")
    @JsonProperty("avaliacaoCondutor")
	///   
	/// Atributo int para registro da avaliação do condutor por parte do passageiro nesta corrida.
    private int avaliacaoCondutor;

    @NotNull
    @Column(name = "AVALIACAO_VEICULO")
    @JsonProperty("avaliacaoVeiculo")
	///   
	/// Atributo int para registro da avaliação do veículo por parte do passageiro nesta corrida.
    private int avaliacaoVeiculo;

    @NotNull
    @Column(name = "DATA_INICIO")
    @JsonProperty("dataInicio")
    ///   
	/// Atributo Date para registro da data de inicio da corrida.
	private Date dataInicio;

    @Column(name = "DATA_FIM")
    @JsonProperty("dataFim")
    ///   
	/// Atributo Date para registro da data de fim da corrida.
    private Date dataFim;

    @Column(name = "ORIGEM")
    @JsonProperty("origem")
	///   
	/// Atributo String para registro do ponto de origem da corrida.
    private String origem;

    @Column(name = "DESTINO")
    @JsonProperty("destino")
	///   
	/// Atributo String para registro do ponto de destino da corrida.
    private String destino;

    @Column(name = "TARIFA")
    @JsonProperty("tarifa")
	///   
	/// Atributo floar para registro da tarifa da corrida.
    private float tarifa;

    @Column(name = "DISTANCIA")
    @JsonProperty("distancia")
	///   
	/// Atributo floar para registro da distancia a ser percorrida na corrida.
    private float distancia;

    @NotNull
    @Column(name = "FK_ALUGUEL", nullable = false)
    @JsonProperty("fkAluguel")
	///   
	/// Atributo int de Foreign Key para vincular a corrida a um registro de aluguel (que vincula um veiculo a um condutor).
    private int fkAluguel;

    @NotNull
    @Column(name = "FK_CPF_PASSAGEIRO", nullable = false)
    @JsonProperty("fkCPFPassageiro")
	///   
	/// Atributo int de Foreign Key para vincular a corrida a um passageiro.
    private String fkCPFPassageiro;

    public int getIdCorrida() {
	/// Método que retorna a Primary Key da corrida.
        return idCorrida;
    }

    public void setIdCorrida(int idCorrida) {
	/// Método que define a Primary Key da corrida, com base no parametro informado.
        this.idCorrida = idCorrida;
    }

    public int getAvaliacaoCondutor() {
	/// Método que retorna a avaliação do condutor, por parte do passageiro.
        return avaliacaoCondutor;
    }

    public void setAvaliacaoCondutor(int avaliacaoCondutor) {
	/// Método que define a avaliação do condutor, por parte do passageiro, com base no parametro informado.
        this.avaliacaoCondutor = avaliacaoCondutor;
    }

    public int getAvaliacaoVeiculo() {
	/// Método que retorna a avaliação do veiculo, por parte do passageiro.
        return avaliacaoVeiculo;
    }

    public void setAvaliacaoVeiculo(int avaliacaoVeiculo) {
	/// Método que define a avaliação do veiculo, por parte do passageiro.
        this.avaliacaoVeiculo = avaliacaoVeiculo;
    }

    public Date getDataInicio() {
	/// Método que retorna a data de inicio da corrida.
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
	/// Método que define a data de inicio da corrida.
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
	/// Método que retorna a data de fim da corrida.
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
	/// Método que define a data de fim da corrida.
        this.dataFim = dataFim;
    }

    public String getOrigem() {
	/// Método que obtém o ponto de origem da corrida.
        return origem;
    }

    public void setOrigem(String origem) {
	/// Método que define o ponto de origem da corrida, com base no parametro String informado.
        this.origem = origem;
    }

    public String getDestino() {
	/// Método que obtém o ponto de destino da corrida.
        return destino;
    }

    public void setDestino(String destino) {
	/// Método que define o ponto de destino da corrida, com base no parametro String informado.
        this.destino = destino;
    }

    public float getTarifa() {
	/// Método que obtém o valor da tarifa da corrida.
        return tarifa;
    }

    public void setTarifa(float tarifa) {
	/// Método que define o valor da tarifa, em float, da corrida.
        this.tarifa = tarifa;
    }

    public float getDistancia() {
	/// Método que obtém o valor da distancia percorrida na corrida.
        return distancia;
    }

    public void setDistancia(float distancia) {
	/// Método que define o valor da distancia percorrida na corrida.
        this.distancia = distancia;
    }

    public int getFkAluguel() {
	/// Método que obtém a Foreign Key que vincula a corrida a um registro de aluguel do banco de dados.
        return fkAluguel;
    }

    public void setFkAluguel(int fkAluguel) {
	/// Método que define a Foreign Key que vincula a corrida a um registro de aluguel do banco de dados.
        this.fkAluguel = fkAluguel;
    }

    public String getFkCPFPassageiro() {
	/// Método que obtém a Foreign Key que vincula a corrida a um passageiro do banco de dados.
        return fkCPFPassageiro;
    }

    public void setFkCPFPassageiro(String fkCPFPassageiro) {
	/// Método que define a Foreign Key que vincula a corrida a um passageiro do banco de dados.
        this.fkCPFPassageiro = fkCPFPassageiro;
    }
}
