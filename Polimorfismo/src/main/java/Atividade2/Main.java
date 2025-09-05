package Atividade2;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy(
                "Claudio",
                "01/01/2001",
                Sexo.MASCULINO,
                Setor.OPERACOES,
                1518.0,
                "B"
        );

        Diretor diretor = new Diretor(
                "Luiz",
                "02/02/1992",
                Sexo.MASCULINO,
                Setor.RECURSOS_HUMANOS,
                5892.0
        );

        System.out.println(motoboy);
        System.out.println("Salário Final Motoboy: R$" + motoboy.getSalarioFinal());

        System.out.println(diretor);
        System.out.println("Salário Final Diretor: R$" + diretor.getSalarioFinal());

        diretor.admitir(motoboy);
    }
}
