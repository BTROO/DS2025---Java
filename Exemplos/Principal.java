package org.example;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(); //colocando as caracteristicas da classe em uma variavel  -- vira objeto = recebe mais de uma caracteristica
        Pessoa p2 = new Pessoa();



        //Atribuição de valores

        // p1.nome = "Marta"; //antes
        p1.setNome("Marta"); // depois
        //p1.cpf = "021536845925";
        p1.setCpf("54862359875");

        //p2.nome = "Carlos";
        p2.setNome("Carlos");
        p2.setCpf("58762354845");

        //Mostrar os vaores.
        //System.out.println("Nome: " + p1.nome);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("CPF: "+ p1.getCpf());

        System.out.println();

        System.out.println("Nome: " + p2.getNome());
        System.out.println("CPF: "+ p2.getCpf());


       }
}
