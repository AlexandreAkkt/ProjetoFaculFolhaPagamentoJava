import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<>();

        System.out.println("Quantos funcionários deseja cadastrar?");
        int total = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < total; i++) {

            System.out.println("\nFuncionário " + (i + 1));

            System.out.println("1 - Padrão");
            System.out.println("2 - Comissionado");
            System.out.println("3 - Produção");
            int tipo = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Matrícula: ");
            int matricula = sc.nextInt();

            if (tipo == 1) {
                lista.add(new FuncionarioPadrao(nome, matricula));
            }

            else if (tipo == 2) {
                System.out.print("Vendas: ");
                double vendas = sc.nextDouble();

                System.out.print("Percentual: ");
                double perc = sc.nextDouble();

                lista.add(new FuncionarioComissionado(nome, matricula, vendas, perc));
            }

            else if (tipo == 3) {
                System.out.print("Quantidade: ");
                int qtd = sc.nextInt();

                System.out.print("Valor peça: ");
                double valor = sc.nextDouble();

                lista.add(new FuncionarioProducao(nome, matricula, qtd, valor));
            }

            sc.nextLine(); // limpar buffer
        }

        // mostrar folha
        System.out.println("\n=== FOLHA DE PAGAMENTO ===");

        for (Funcionario f : lista) {
            f.exibirDados();
        }

        sc.close();
    }
}