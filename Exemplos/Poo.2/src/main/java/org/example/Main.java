package org.example;

public class Main {
    public static void main(String[] args) {

        //Instanciar uma classe.
        Pessoa p1 = new Pessoa("Marta",25);
        Produto pr1 = new Produto("Notebook",2499.99);



        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

        System.out.println();

        System.out.println("Nome: " + pr1.getNome());
        System.out.println("Preço Unitário: "+ pr1.getPrecoUnitario());


    }
}