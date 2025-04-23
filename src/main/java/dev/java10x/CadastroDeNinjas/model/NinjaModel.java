package dev.java10x.CadastroDeNinjas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nomes;
    String email;
    int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nomes, String email, int idade) {
        this.nomes = nomes;
        this.email = email;
        this.idade = idade;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
