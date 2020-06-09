package app.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity(name = "Modelos")
@Table(name = "MODELOS")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Modelos {

    @Id
    @Column(name = "IDMODELO")
    @JsonProperty("idModelo")
    private int idModelo;

    @NotNull
    @Column(name = "NOME")
    @JsonProperty("nome")
    private String nome;

    @NotNull
    @Column(name = "FK_MARCA", nullable = false)
    @JsonProperty("fkMarca")
    private int fkMarca;

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFkMarca() {
        return fkMarca;
    }

    public void setFkMarca(int fkMarca) {
        this.fkMarca = fkMarca;
    }


}
