package Atividade_da_lista.Parte01.conta_bacaria;

public class main {

    public static void main(String[] args) throws Exception {

        ContaBancaria u1 = new ContaBancaria(1, "teste");
        u1.exibirSaldo();
        u1.exibirSaldo();
        u1.sacar(2);
        u1.exibirSaldo();

    }
}
