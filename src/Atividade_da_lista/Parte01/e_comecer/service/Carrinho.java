package Atividade_da_lista.Parte01.e_comecer.service;

import Atividade_da_lista.Parte01.e_comecer.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    // Adiciona um produto ao carrinho
    public void adicionarProduto(Produto produto) {
        // Verifica se o produto já existe no carrinho
        for (Produto p : produtos) {
            if (p.getNome().equals(produto.getNome())) {
                // Se existe, aumenta a quantidade
                p.setQuantidade(p.getQuantidade() + produto.getQuantidade());
                return;
            }
        }
        // Se não existe, adiciona novo
        produtos.add(produto);
    }

    // Remove um produto do carrinho
    public boolean removerProduto(String nomeProduto) {
        return produtos.removeIf(p -> p.getNome().equals(nomeProduto));
    }

    // Calcula o total do carrinho
    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getSubtotal();
        }
        return total;
    }

    // Exibe todos os produtos do carrinho
    public void exibirCarrinho() {
        if (produtos.isEmpty()) {
            System.out.println(" Carrinho vazio!");
            return;
        }

        System.out.println("\n=== CARRINHO DE COMPRAS ===");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println((i + 1) + ". " + produtos.get(i));
        }
        System.out.println("---------------------------");
        System.out.printf("TOTAL: R$ %.2f\n", calcularTotal());
    }

    // Limpa o carrinho
    public void limparCarrinho() {
        produtos.clear();
        System.out.println(" Carrinho limpo!");
    }

    // Getter para a lista de produtos (apenas leitura)
    public List<Produto> getProdutos() {
        return new ArrayList<>(produtos); // Retorna cópia para proteger encapsulamento
    }

    // Verifica se o carrinho está vazio
    public boolean estaVazio() {
        return produtos.isEmpty();
    }
}
