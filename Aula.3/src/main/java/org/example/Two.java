package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;

        do { double nota;

            while(true) {
            System.out.println("Digite uma nota:");
            nota = ler.nextDouble();

            if(nota >= 0 && nota <= 10) {
                break;
            }else{
                System.out.println("Nota invalida. Digite um valor entre 0 e 10!");
            }
            }

            notas.add(nota);

            System.out.println("Deseja inserir mais uma nota?: ");
            System.out.println("\nPressione a tecla N para sair");
            resposta = ler.next();

        } while (!resposta.equalsIgnoreCase("n"));

        System.out.println("\nExibindo notas: ");
        for(double nota: notas){
            System.out.println("Nota: "+ nota);
        }
    }
    }

