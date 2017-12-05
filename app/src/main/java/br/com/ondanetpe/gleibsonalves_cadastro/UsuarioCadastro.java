package br.com.ondanetpe.gleibsonalves_cadastro;


import java.io.Serializable;

public class UsuarioCadastro implements Serializable{
    private String nome;
    private String email;
    private  int idade;
    private String sexo;

    public UsuarioCadastro(String nome, String email, int idade, String sexo) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
