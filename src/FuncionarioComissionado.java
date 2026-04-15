public class FuncionarioComissionado extends Funcionario {

    private double vendas;
    private double percentual;

    public FuncionarioComissionado(String nome, int matricula, double vendas, double percentual) {
        super(nome, matricula);
        this.vendas = vendas;
        this.percentual = percentual;
    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE + (vendas * percentual / 100);
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Final: " + calcularSalario());
        System.out.println("-------------------");
    }
}