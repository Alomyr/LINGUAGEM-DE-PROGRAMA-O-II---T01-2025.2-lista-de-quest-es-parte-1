package Atividade_da_lista.Parte01.heranca_e_polimorfismo;

public class FuncionarioHorista extends Funcionario {

    private String name;
    private double horas;
    private double value;

    public FuncionarioHorista() {
        this.name = "User";
        this.horas = 2;
        this.value = 10;
    }

    public FuncionarioHorista(String name, double horas, double value) {
        super(name);
        this.horas = horas;
        this.value = value;
    }

    @Override
    public double calcularSalario() {
        return this.horas * this.value;
    }
}
