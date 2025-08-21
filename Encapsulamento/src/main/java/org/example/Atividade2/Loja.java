package org.example.Atividade2;

public class Loja {
    public static void main(String[] args) {
        Livro lv1 = new Livro("Trono de Vidro", "Sarah J Mass", "25546878552155", 560, 59.99);
        Veiculo vl1 = new Veiculo("jh58f450", "Cinza", 5, 56, 270, 40);
        Cliente cl1 = new Cliente("Claudio", 21, "256984563256","7a Travessa Manoelito Teixeira", "71985566223");

        System.out.println(lv1);
        System.out.println();
        System.out.println(vl1);
        System.out.println();
        System.out.println(cl1);

    }
}
