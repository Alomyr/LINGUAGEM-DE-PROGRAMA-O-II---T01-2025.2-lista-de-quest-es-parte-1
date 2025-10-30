package Atividade_da_lista.Parte01.e_comecer.app;

import Atividade_da_lista.Parte01.e_comecer.model.Produto;
import Atividade_da_lista.Parte01.e_comecer.service.Carrinho;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        System.out.println(" SISTEMA DE LOJA - CARRINHO DE COMPRAS\n");

        int opcao;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    adicionarProduto(scanner, carrinho);
                    break;
                case 2:
                    removerProduto(scanner, carrinho);
                    break;
                case 3:
                    carrinho.exibirCarrinho();
                    break;
                case 4:
                    System.out.printf("\n Total do carrinho: R$ %.2f\n", carrinho.calcularTotal());
                    break;
                case 5:
                    carrinho.limparCarrinho();
                    break;
                case 0:
                    System.out.println(" Obrigado por usar nosso sistema!");
                    break;
                default:
                    System.out.println(" Opção inválida!");
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("1.  Adicionar produto");
        System.out.println("2.  Remover produto");
        System.out.println("3.  Exibir carrinho");
        System.out.println("4.  Ver total");
        System.out.println("5.  Limpar carrinho");
        System.out.println("0.  Sair");
    }

    private static void adicionarProduto(Scanner scanner, Carrinho carrinho) {
        System.out.println("\n ADICIONAR PRODUTO");
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: R$ ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        if (preco < 0 || quantidade < 0) {
            System.out.println(" Preço e quantidade não podem ser negativos!");
            return;
        }

        Produto produto = new Produto(nome, preco, quantidade);
        carrinho.adicionarProduto(produto);
        System.out.println(" Produto adicionado ao carrinho!");
    }

    private static void removerProduto(Scanner scanner, Carrinho carrinho) {
        if (carrinho.estaVazio()) {
            System.out.println(" Carrinho vazio! Não há produtos para remover.");
            return;
        }

        System.out.println("\n REMOVER PRODUTO");
        carrinho.exibirCarrinho();

        System.out.print("Digite o nome do produto a remover: ");
        String nome = scanner.nextLine();

        if (carrinho.removerProduto(nome)) {
            System.out.println(" Produto removido do carrinho!");
        } else {
            System.out.println(" Produto não encontrado no carrinho!");
        }
    }
}
