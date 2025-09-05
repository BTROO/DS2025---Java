package Atividade3;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("João", "123.456.789-00", "01/01/1990", 2000, "ABC-1234");
        Gerente gerente = new Gerente("Maria", "987.654.321-00", "15/05/1985", 6000, Bonificacao.GERENTE);

        System.out.println(motoboy);
        System.out.println(gerente);

        gerente.admitir(motoboy);
        gerente.demitir(motoboy);
    }
}
