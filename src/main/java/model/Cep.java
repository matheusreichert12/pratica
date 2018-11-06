package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

public class Cep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cep;
    private String cep;
    private String cidade;

    public int getId_cep() {
        return id_cep;
    }

    public void setId_cep(int id_cep) {
        this.id_cep = id_cep;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
