package org.example;

public class ComparacaoTipos {
    public static void main(String[] args) {

        //Declaração de variáveis
        String nomeUsuario = "Marta";
        int senha = 123;

        //Comparação de Strings e inteiros

        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);

        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A seha está correta? " + resultadoSenha);

    }
}
