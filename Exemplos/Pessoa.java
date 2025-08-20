package org.example;

public class Pessoa {
    //atributos da classe
    private String nome;
    private String cpf;


    //Métodos.


    // Pega ou recebe os valores da variavel.
    public String getNome() {
        return nome;
    }

    //Definindo o valor do atributo.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
