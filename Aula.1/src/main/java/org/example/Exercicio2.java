package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = sc.nextDouble();

        double media = primeiraNota + segundaNota / 2;

        System.out.println("O aluno " + nome + "Obteve a média de " + media);

        if (media > 7) {
            System.out.println("O aluno esta aprovado");
        } else {
            System.out.println("O aluno esta reprovado");

        }
    }
}
