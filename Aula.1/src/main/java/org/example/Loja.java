package org.example;

public class Loja {
    public static void main(String[] args) {

        //Variáveis

        double parcelas = 5;
        double valor_total = 652.60;

        //Operação
        double divisao = valor_total / parcelas;


        System.out.println("O valor total da compra é: " + valor_total + " em 5 parcelas sem juros de " + divisao);
        System.out.println(" Obrigado por compra na loja Mamão com Açúcar");

    }
}
