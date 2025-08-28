package org.example.Atividade;

public enum Sexo {
    MASCULINO ("Masculino"),
    FEMININO ("Feminino");

    private String nome;

    Sexo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
