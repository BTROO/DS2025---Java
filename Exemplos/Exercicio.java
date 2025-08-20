package org.example;

import java.util.Scanner;


// validar a log e a senha
public class Exercicio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        //Solicitando os dados de cadastro
        System.out.println("----Cadastro-----");
        System.out.println("\nDigite o nome de Usuario:\n");
        String usuarioCadastro = ler.nextLine();


        System.out.println("\nDigite a senha:\n");
        String senhaCadastro = ler.nextLine();


        //Login
        System.out.println("\n -----LOgin-----\n");
        System.out.println("Digite o nome de Usuario:");
        String usuarioDigitado = ler.nextLine();


        System.out.println("\nDigite a senha:\n");
        String senhaDigitada = ler.nextLine();


        //verificação do Acesso com o cadastro
        if (usuarioDigitado.equals(usuarioCadastro) && senhaDigitada.equals(senhaCadastro)) {
            System.out.println("Bem-Vindo, usuário logado!");
        } else {
            System.out.println("Nome de usuário ou senhas invalidos ");
        }

    ler.close();
    }
}
