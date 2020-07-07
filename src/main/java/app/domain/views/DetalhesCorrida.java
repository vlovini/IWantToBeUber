package app.domain.views;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.eclipse.persistence.annotations.ReadOnly;

//@ReadOnly
@Entity(name = "DetalhesCorrida")
@Table(name = "DETALHES_CORRIDA")

/*! \brief VIEWS - DetalhesVeiculo */
/*! \details Implementação da View que traz os detalhes da corrida.*/
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */
public class DetalhesCorrida {

    @Id
    @Column(name = "ID")
    @JsonProperty("Index")
    private String index;

    @Column(name = "CPF_CONDUTOR")
    @JsonProperty("cpfCondutor")
    private String cpfCondutor;

    @Column(name = "NOME_CONDUTOR")
    @JsonProperty("nomeCondutor")
    private String nomeCondutor;

    @Column(name = "CPF_PASSAGEIRO")
    @JsonProperty("cpfPassageiro")
    private String cpfPassageiro;

    @Column(name = "NOME_PASSAGEIRO")
    @JsonProperty("nomePassageiro")
    private String nomePassageiro;

    @Column(name = "HORA_INICIO")
    @JsonProperty("horaInicio")
    private String horaInicio;

    @Column(name = "ORIGEM")
    @JsonProperty("origem")
    private String origem;

    @Column(name = "DESTINO")
    @JsonProperty("destino")
    private String destino;

    @Column(name = "VALOR")
    @JsonProperty("valor")
    private float valor;

    @Column(name = "DURACAO")
    @JsonProperty("duracao")
    private float duracao;

    @Column(name = "VEICULO")
    @JsonProperty("veiculo")
    private float veiculo;

    @Column(name = "AVALIACAO_CONDUTOR")
    @JsonProperty("avaliacaoCondutor")
    private int avaliacaoCondutor;

    @Column(name = "AVALIACAO_VEICULO")
    @JsonProperty("avaliacaoVeiculo")
    private int avaliacaoVeiculo;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

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

    public String getCpfPassageiro() {
        return cpfPassageiro;
    }

    public void setCpfPassageiro(String cpfPassageiro) {
        this.cpfPassageiro = cpfPassageiro;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public float getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(float veiculo) {
        this.veiculo = veiculo;
    }

    public int getAvaliacaoCondutor() {
        return avaliacaoCondutor;
    }

    public void setAvaliacaoCondutor(int avaliacaoCondutor) {
        this.avaliacaoCondutor = avaliacaoCondutor;
    }

    public int getAvaliacaoVeiculo() {
        return avaliacaoVeiculo;
    }

    public void setAvaliacaoVeiculo(int avaliacaoVeiculo) {
        this.avaliacaoVeiculo = avaliacaoVeiculo;
    }
}
