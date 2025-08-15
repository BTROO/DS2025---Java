package org.example;

public class Notacao {
    public static void main(String[] args) {
        String nome = "Marta";
        String sobrenome = " Silveira";

        //Exibindo a quantidade de caracteres
        System.out.printf("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());

        //Concatenando nome + sobrenome
        String nomeCompleto = nome.concat("").concat(sobrenome);

        //Exibindo nome completo usando métodos Strings - Maiúsculas
        System.out.println("Concatenação Maiúsculo: " + nomeCompleto.toUpperCase());

        //Exibindo nome completo usando métodos Strings - Minúsculas
        System.out.println("Concatenação Minúscula: " + nomeCompleto.toLowerCase());
    }
}
