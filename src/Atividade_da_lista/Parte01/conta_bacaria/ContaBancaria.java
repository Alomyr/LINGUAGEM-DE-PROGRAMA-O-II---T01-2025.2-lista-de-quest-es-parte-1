package Atividade_da_lista.Parte01.conta_bacaria;

public class ContaBancaria {

    private double balance;
    private String name;

    //defalt constructor
    public ContaBancaria() {
        this.name = "User";
        this.balance = 0;
    }

    public ContaBancaria(double balance, String name) {
        this.name = name;
        this.balance = balance;
    }

    public double depositar(double value) {

        if (value <= 0) {
            return this.balance;
        }

        this.balance = this.balance + value;
        return this.balance;
    }

    public double sacar(double value) {

        if (value <= 0) {
            return this.balance;
        }

        if (value > this.balance) {
            return this.balance;
        }
        this.balance = this.balance - value;
        return this.balance;

    }

    public void exibirSaldo() {
        System.out.println(this.balance);
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }
}
