package org.example;

import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];

        do {
            //Inserindo as notas
            for (int i = 0; i < 2; i++) {
                System.out.println("Digite a " + (i + 1) + "nota:");
                notas[i] = ler.nextDouble();

            }
            //condicional
            }while (notas[0] <0||notas[1] >10 );


        //Exibindo as notas
        System.out.println("\nExibindo as notas: ");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        //Media aritmètica
        double media =  (notas[0] + notas[1] )/ 2;
                System.out.println("\nA media é: " + media );

        ler.close();


    }
}