package app.config.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/*! \brief VeiculosDTO - Data Transfer Object */
/*! \details A classe VeiculosDTO possui o objetivo de mapear atributos dos objetos de entrada/saída da aplicação. \n 
Conjunto de atributos mapeados com propriedades JSON a fim de serem mapeados pela bibliteca JacksonXML serem parseadas em um objeto JSON. \n
Desta forma, serão utilizados como objetos de passagem, sendo populados através de objetos do tipo "Veículo", na classe VeiculosServicos*/
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public class VeiculosDTO {

    @JsonProperty("renavam")
    String renavam;

    @JsonProperty("placa")
    String placa;

    @JsonProperty("ano")
    String ano;

    @JsonProperty("fkModelo")
    int fkModelo;

    @JsonProperty("modelo")
    String modelo;

    @JsonProperty("marca")
    String marca;

    public VeiculosDTO(String renavam, String placa, String ano, int fkModelo){
/// Método construtor da classe VeiculosDTO. <br> 
/// Recebe os parâmetros informados pelo usuário e os atribui ao objeto criado utilizando os métodos setters.
        this.setAno(ano);
        this.setRenavam(renavam);
        this.setPlaca(placa);
        this.setFkModelo(fkModelo);
    }

    public String getRenavam() {
/// Método getRenavam
        return renavam;
    }

    public void setRenavam(String renavam) {
/// Método setRenavam
        this.renavam = renavam;
    }

    public String getPlaca() {
/// Método getPlaca
        return placa;
    }

    public void setPlaca(String placa) {
/// Método setPlaca
        this.placa = placa;
    }

    public String getAno() {
/// Método getAno
        return ano;
    }

    public void setAno(String ano) {
/// Método setAno
        this.ano = ano;
    }

    public int getFkModelo() {
/// Método getFkModelo
        return fkModelo;
    }

    public void setFkModelo(int fkModelo) {
/// Método setFkModelo
        this.fkModelo = fkModelo;
    }

    public String getModelo() {
/// Método getModelo
        return modelo;
    }

    public void setModelo(String modelo) {
/// Método setModelo
        this.modelo = modelo;
    }

    public String getMarca() {
/// Método getMarca
        return marca;
    }

    public void setMarca(String marca) {
/// Método setMarca
        this.marca = marca;
    }
}