package org.example;

public class Cliente {
    //Atributos
    String nome;
    int idade;

    //Construtor
    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Metodos Get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
