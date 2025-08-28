package org.example.Atividade;

public class Principal {
    public static void main(String[] args) {
        Endereco endereco = new Endereco(
                "Rua das Flores",
                "123",
                "Apto 202",
                "12345-678",
                "Salvador",
                UnidadeFederativa.BAHIA
        );

        Pessoa pessoa = new Pessoa(
                01,
                "Mario",
                25,
                "985859595",
                "Mario@gmail.com",
                Sexo.MASCULINO,
                endereco

        );

        System.out.println(pessoa.toString());
    }
}
