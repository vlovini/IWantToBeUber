package app.domain.views;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import org.eclipse.persistence.annotations.ReadOnly;

//@ReadOnly
@Entity(name = "DetalhesVeiculo")
@Table(name = "DETALHES_VEICULO")

/*! \brief VIEWS - DetalhesVeiculo */
/*! \details Implementação da View que traz os detalhes do veículo.*/
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public class DetalhesVeiculo {

    @Id
    @Column(name = "RENAVAM")
    @JsonProperty("renavam")
    private String renavam;

    @Column(name = "PLACA")
    @JsonProperty("placa")
    private String placa;

    @Column(name = "ANO")
    @JsonProperty("ano")
    private String ano;

    @Column(name = "MARCA")
    @JsonProperty("marca")
    private String marca;

    @Column(name = "MODELO")
    @JsonProperty("modelo")
    private String modelo;

    @Column(name = "QUANTIDADE_AVALIACOES")
    @JsonProperty("qntAvaliacoes")
    private int qntAvaliacoes;

    @Column(name = "MEDIA_AVALIACOES")
    @JsonProperty("mediaAvaliacoes")
    private float mediaAvaliacoes;

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQntAvaliacoes() {
        return qntAvaliacoes;
    }

    public void setQntAvaliacoes(int qntAvaliacoes) {
        this.qntAvaliacoes = qntAvaliacoes;
    }

    public float getMediaAvaliacoes() {
        return mediaAvaliacoes;
    }

    public void setMediaAvaliacoes(float mediaAvaliacoes) {
        this.mediaAvaliacoes = mediaAvaliacoes;
    }
}
