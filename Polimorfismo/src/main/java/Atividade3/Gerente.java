package Atividade3;

public class Gerente extends CargoDeConfianca implements Contratacao{

    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase) {
        super(nome, cpf, dataNascimento, salarioBase, Bonificacao.GERENTE);
    }

    @Override
    public void  admitir(Funcionario funcionario) {
        System.out.println("Funcionario Admitido" + funcionario.getNome());
    }
    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Funcionario Demitido" + funcionario.getNome());
    }

    @Override
    public double obterSalarioFinal() {
        return super.salarioBase * Bonificacao.GERENTE.getValor();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + obterSalarioFinal() +
                '}';
    }
}
