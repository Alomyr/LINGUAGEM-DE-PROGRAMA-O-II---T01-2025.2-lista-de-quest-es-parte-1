package Atividade_da_lista.FilaePilha;

import java.util.Stack; 
 
public class ExemploPilha { 
    public static void main(String[] args) { 
        // Criação da pilha 
        Stack<String> pilha = new Stack<>(); 
 
        // Adicionando elementos (push) 
        pilha.push("Livro A"); 
        pilha.push("Livro B"); 
        pilha.push("Livro C"); 
 
        System.out.println("Pilha inicial: " + pilha); 
 
        // Removendo elemento do topo (pop) 
        String removido = pilha.pop(); 
        System.out.println("Removido do topo: " + removido); 
 
        // Verificando o topo da pilha (peek) 
        System.out.println("Topo atual: " + pilha.peek()); 
 
        // Verificando se contém um elemento 
        System.out.println("Contém 'Livro A'? " + pilha.contains("Livro A")); 
 
        // Exibindo a pilha atual 
        System.out.println("Pilha atual: " + pilha); 
    } 
}