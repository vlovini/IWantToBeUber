package app.domain.views;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "DetalhesCondutor")
@Table(name = "DETALHES_CONDUTOR")
public class DetalhesCondutor {

    @Id
    @Column(name = "CPF_CONDUTOR")
    @JsonProperty("cpfCondutor")
    private String cpfCondutor;

    @Column(name = "NOME")
    @JsonProperty("nomeCondutor")
    private String nomeCondutor;

    @Column(name = "QUANTIDADE_AVALIACOES")
    @JsonProperty("qntAvaliacoes")
    private int qntAvaliacoes;

    @Column(name = "MEDIA_AVALIACOES")
    @JsonProperty("mediaAvaliacoes")
    private float mediaAvaliacoes;

    @Column(name = "QUANTIDADE_CORRIDAS")
    @JsonProperty("qntCorridas")
    private int qntCorridas;

    @Column(name = "MEDIA_VALORES_CORRIDAS")
    @JsonProperty("mediaValores")
    private float mediaValores;

    public String getCpfCondutor() {
        return cpfCondutor;
    }

    public void setCpfCondutor(String cpfCondutor) {
        this.cpfCondutor = cpfCondutor;
    }

    public String getNomeCondutor() {
        return nomeCondutor;
    }

    public void setNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
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

    public int getQntCorridas() {
        return qntCorridas;
    }

    public void setQntCorridas(int qntCorridas) {
        this.qntCorridas = qntCorridas;
    }

    public float getMediaValores() {
        return mediaValores;
    }

    public void setMediaValores(float mediaValores) {
        this.mediaValores = mediaValores;
    }
}
