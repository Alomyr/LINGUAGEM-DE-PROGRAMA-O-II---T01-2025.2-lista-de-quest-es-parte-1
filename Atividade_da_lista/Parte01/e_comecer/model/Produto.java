package Atividade_da_lista.Parte01.e_comecer.model;
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    // Getters
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    // Calcula o subtotal do produto
    public double getSubtotal() {
        return preco * quantidade;
    }
    
    @Override
    public String toString() {
        return String.format("%s - R$ %.2f x %d = R$ %.2f", 
                           nome, preco, quantidade, getSubtotal());
    }
}