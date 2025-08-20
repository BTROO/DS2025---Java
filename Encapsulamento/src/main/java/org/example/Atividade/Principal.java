package org.example.Atividade;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pet[] pets = new Pet[2]; // vetor

        //O loop
        for (int i = 0; i < pets.length; i++ ) {
            System.out.println("Digite o nome do Pet: ");
            String nome = ler.nextLine();

            System.out.println("Digite a idade: ");
            int idade = ler.nextInt();
            ler.nextLine();

            System.out.println("Digite a Raça: ");
            String raca = ler.nextLine();

            System.out.println("È porte Grande, Médio ou Pequeno? ");
            String porte = ler.nextLine();

            System.out.println("Fale sobre a alimentação do Pet: ");
            String alimentacao = ler.nextLine();

            pets[i] = new Pet(nome, idade, raca, porte, alimentacao);

        }
        System.out.println("\n_________Dados dos Pets__________\n");
        for (Pet pet: pets ){
            System.out.println(pet);
        }
        ler.close();
    }
}
