package Atividade_da_lista.Parte01.heranca_e_polimorfismo;

public abstract class Funcionario {

    private String name;

    public Funcionario() {
        this.name = "User";
    }

    public Funcionario(String name) {
        this.name = name;
    }

    public abstract double calcularSalario();

    public void exibirInfo() {
        System.out.println("Nome do funcionario: " + this.name + " Salario: " + calcularSalario());
    }

    public String getName() {
        return name;
    }
}
//TODO: calcularSalario()
