package app.config.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
/*! \brief CorridasDTO - Data Transfer Object */
/*! \details A classe CorridasDTO possui o objetivo de mapear atributos dos objetos de entrada/saída da aplicação. \n
Conjunto de atributos mapeados com propriedades JSON a fim de serem mapeados pela bibliteca JacksonXML serem parseadas em um objeto JSON. \n
Desta forma, serão utilizados como objetos de passagem, sendo populados através de objetos do tipo "Corrida", na classe CorridasService*/
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public class CorridasDTO {
    @JsonProperty("idCorrida")
    int idCorrida;

    @JsonProperty("avaliacaoCondutor")
    int avaliacaoCondutor;

    @JsonProperty("avaliacaoVeiculo")
    int avaliacaoVeiculo;

    @JsonProperty("dataInicio")
    Date dataInicio;

    @JsonProperty("dataFim")
    Date dataFim;

    @JsonProperty("origem")
    String origem;

    @JsonProperty("destino")
    String destino;

    @JsonProperty("tarifa")
    float tarifa;

    @JsonProperty("distancia")
    float distancia;

    @JsonProperty("fkAluguel")
    int fkAluguel;

    @JsonProperty("nomeCondutor")
    String nomeCondutor;

    @JsonProperty("fkPassageiro")
    String fkPassageiro;

    @JsonProperty("nomePassageiro")
    String nomePassageiro;


    public CorridasDTO(int idCorrida, Date dataInicio, String origem, String destino, int fkAluguel,
                       String fkPassageiro, float tarifa, float distancia, Date dataFim, int avaliacaoCondutor, int avaliacaoVeiculo){
/// Método construtor da classe CorridasDTO. <br> 
/// Recebe os parâmetros informados pelo usuário e os atribui ao objeto criado utilizando os métodos setters.
        this.setIdCorrida(idCorrida);
        this.setDataInicio(dataInicio);
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setFkAluguel(fkAluguel);
        this.setFkPassageiro(fkPassageiro);
        this.setTarifa(tarifa);
        this.setDistancia(distancia);
        this.setDataFim(dataFim);
        this.setAvaliacaoCondutor(avaliacaoCondutor);
        this.setAvaliacaoVeiculo(avaliacaoVeiculo);
    }

    public int getIdCorrida() {
/// Método getIdCorrida
        return idCorrida;
    }

    public void setIdCorrida(int idCorrida) {
/// Método setIdCorrida
        this.idCorrida = idCorrida;
    }

    public int getAvaliacaoCondutor() {
/// Método getAvaliacaoCondutor
        return avaliacaoCondutor;
    }

    public void setAvaliacaoCondutor(int avaliacaoCondutor) {
/// Método setAvaliacaoCondutor
        this.avaliacaoCondutor = avaliacaoCondutor;
    }

    public int getAvaliacaoVeiculo() {
/// Método getAvaliacaoVeiculo
        return avaliacaoVeiculo;
    }

    public void setAvaliacaoVeiculo(int avaliacaoVeiculo) {
/// Método setAvaliacaoVeiculo
        this.avaliacaoVeiculo = avaliacaoVeiculo;
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

    public String getOrigem() {
/// Método getOrigem
        return origem;
    }

    public void setOrigem(String origem) {
/// Método setOrigem
        this.origem = origem;
    }

    public String getDestino() {
/// Método getDestino
        return destino;
    }

    public void setDestino(String destino) {
/// Método setDestino
        this.destino = destino;
    }

    public float getTarifa() {
/// Método getIdAluguel
        return tarifa;
    }

    public void setTarifa(float tarifa) {
/// Método setTarifa
        this.tarifa = tarifa;
    }

    public float getDistancia() {
/// Método getDistancia
        return distancia;
    }

    public void setDistancia(float distancia) {
/// Método setDistancia
        this.distancia = distancia;
    }

    public int getFkAluguel() {
/// Método getFkAluguel
        return fkAluguel;
    }

    public void setFkAluguel(int fkAluguel) {
/// Método setFkAluguel
        this.fkAluguel = fkAluguel;
    }

    public String getFkPassageiro() {
/// Método getFkPassageiro
        return fkPassageiro;
    }

    public void setFkPassageiro(String fkPassageiro) {
/// Método setFkPassageiro
        this.fkPassageiro = fkPassageiro;
    }

    public String getNomeCondutor() {
/// Método getNomeCondutor
        return nomeCondutor;
    }

    public void setNomeCondutor(String nomeCondutor) {
/// Método setNomeCondutor
        this.nomeCondutor = nomeCondutor;
    }

    public String getNomePassageiro() {
/// Método getNomePassageiro
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
/// Método setNomePassageiro
        this.nomePassageiro = nomePassageiro;
    }
}
