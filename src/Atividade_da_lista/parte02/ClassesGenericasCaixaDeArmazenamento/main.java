package Atividade_da_lista.parte02.ClassesGenericasCaixaDeArmazenamento;

public class main {
    public static void main(String[] args) {
        // Caixa para String
        Caixa<String> caixaString = new Caixa<>();
        caixaString.guardar("Olá, Mundo!");
        System.out.println("Caixa de String: " + caixaString.abrir());

        // Caixa para Integer
        Caixa<Integer> caixaInteiro = new Caixa<>();
        caixaInteiro.guardar(42);
        System.out.println("Caixa de Integer: " + caixaInteiro.abrir());

        // Caixa para Produto (classe própria)
        Caixa<Produto> caixaProduto = new Caixa<>();
        Produto p = new Produto("Notebook", 3500.00);
        caixaProduto.guardar(p);
        System.out.println("Caixa de Produto: " + caixaProduto.abrir());
    }
}
