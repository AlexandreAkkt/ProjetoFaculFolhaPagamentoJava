public class Funcionario {

    protected String nome;
    protected int matricula;

    protected final double SALARIO_BASE = 2000.0;

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public double calcularSalario() {
        return SALARIO_BASE;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Fixo: " + SALARIO_BASE);
        System.out.println("Salário Final: " + calcularSalario());
        System.out.println("---------------------------");
    }
}