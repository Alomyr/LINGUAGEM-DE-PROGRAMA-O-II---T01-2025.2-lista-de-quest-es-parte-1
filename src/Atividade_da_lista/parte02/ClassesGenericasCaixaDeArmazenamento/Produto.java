package Atividade_da_lista.parte02.ClassesGenericasCaixaDeArmazenamento;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço: R$ " + preco;
    }
}
