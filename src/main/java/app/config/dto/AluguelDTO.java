package app.config.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
/*! \brief AluguelDTO - Data Transfer Object */
/*! \details A classe AluguelDTO possui o objetivo de mapear atributos dos objetos de entrada/saída da aplicação. \n 
Conjunto de atributos mapeados com propriedades JSON a fim de serem mapeados pela biblioteca JacksonXML serem parseadas em um objeto JSON. \n 
Desta forma, serão utilizados como objetos de passagem, sendo populados através de objetos do tipo "Aluguel", na classe AluguelService*/
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public class AluguelDTO {
    @JsonProperty("idAluguel")
    int idAluguel;

    @JsonProperty("dataInicio")
    Date dataInicio;

    @JsonProperty("dataFim")
    Date dataFim;

    @JsonProperty("fkCondutor")
    String fkCondutor;

    @JsonProperty("nomeCondutor")
    String nomeCondutor;

    @JsonProperty("fkVeiculo")
    String fkVeiculo;

    @JsonProperty("placaVeiculo")
    String placaVeiculo;

    public AluguelDTO(int idAluguel, Date dataInicio, String fkCondutor, String fkVeiculo, Date dataFim){
/// Método construtor da classe AluguelDTO. <br> 
/// Recebe os parâmetros informados pelo usuário e os atribui ao objeto criado utilizando os métodos setters.
        this.setIdAluguel(idAluguel);
        this.setDataInicio(dataInicio);
        this.setFkCondutor(fkCondutor);
        this.setFkVeiculo(fkVeiculo);
        this.setDataFim(dataFim);
    }

    public int getIdAluguel() {
/// Método getIdAluguel
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
/// Método setIdAluguel
        this.idAluguel = idAluguel;
    }

    public Date getDataInicio() {
/// Método getDataInicio
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
/// Método setDataInicio
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
/// Método getDataFim
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
/// Método setDataFim
        this.dataFim = dataFim;
    }

    public String getFkCondutor() {
/// Método getFkCondutor
        return fkCondutor;
    }

    public void setFkCondutor(String fkCondutor) {
/// Método setFkCondutor
        this.fkCondutor = fkCondutor;
    }

    public String getFkVeiculo() {
/// Método getFkVeiculo
        return fkVeiculo;
    }

    public void setFkVeiculo(String fkVeiculo) {
/// Método setFkVeiculo
        this.fkVeiculo = fkVeiculo;
    }

    public String getNomeCondutor() {
/// Método getNomeCondutor
        return nomeCondutor;
    }

    public void setNomeCondutor(String nomeCondutor) {
/// Método setNomeCondutor
        this.nomeCondutor = nomeCondutor;
    }

    public String getPlacaVeiculo() {
/// Método getPlacaVeiculo
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
/// Método setPlacaVeiculo
        this.placaVeiculo = placaVeiculo;
    }
}