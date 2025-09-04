package Atividade2;

public class Diretor extends Funcionario implements Contratacao {
    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Funcionário contratado: " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario){
        System.out.println("Funcionário demitido: " + funcionario.getNome());
    }

    @Override
    public double getSalarioFinal(){
        return salarioBase + (salarioBase * PREMIO);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
