public class FuncionarioProducao extends Funcionario {

    private int quantidade;
    private double valorPeca;

    // construtor
    public FuncionarioProducao(String nome, int matricula, int quantidade, double valorPeca) {
        super(nome, matricula);
        this.quantidade = quantidade;
        this.valorPeca = valorPeca;
    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE + (quantidade * valorPeca);
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Final: " + calcularSalario());
        System.out.println("-------------------");
    }
}
