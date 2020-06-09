package app.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "Marcas")
@Table(name = "MARCAS")
public class Marcas {

    @Id
    @Column(name = "IDMARCA")
    @JsonProperty("idMarca")
    private int idMarca;

    @NotNull
    @Column(name = "NOME")
    @JsonProperty("nome")
    private String nome;

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
