package Atividade;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao mul = new Multiplicacao();
        Divisao div = new Divisao();


        System.out.println(soma.calcular(2,3));
        System.out.println(sub.calcular(4,5));
        System.out.println(mul.calcular(7,8));
        System.out.println(div.calcular(9,7));

    }
}
