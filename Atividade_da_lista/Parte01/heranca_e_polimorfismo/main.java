package Atividade_da_lista.Parte01.heranca_e_polimorfismo;

public class main {

    public static void main(String[] args) throws Exception {
        Funcionario[] funcionarios = {
            new FuncionarioHorista("João Silva", 160, 25.50),
            new FuncionarioAssalariado("Maria Santos", 3500.00),
        };

        System.out.println("=== FOLHA DE PAGAMENTO ===\n");

        for (Funcionario func : funcionarios) {
            func.exibirInfo(); 
            System.out.println("Tipo: " + func.getClass().getSimpleName());
            System.out.println("------------------------");
        }

        double totalFolha = calcularTotalFolha(funcionarios);
        System.out.println("TOTAL DA FOLHA: R$ " + totalFolha);
    }

    public static double calcularTotalFolha(Funcionario[] funcionarios) {
        double total = 0;
        for (Funcionario func : funcionarios) {
            total += func.calcularSalario();
        }
        return total;
    }
}
