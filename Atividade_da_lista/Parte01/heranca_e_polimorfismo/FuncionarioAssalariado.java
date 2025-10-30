package Atividade_da_lista.Parte01.heranca_e_polimorfismo;

public class FuncionarioAssalariado extends Funcionario{

    private String name; 
    private double salario;

    
    public FuncionarioAssalariado() {
        this.name = "user";
        this.salario = 1500;
    }

    

    public FuncionarioAssalariado(String name, double salario) {
        super(name);
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
