package Atividade_da_lista.FilaePilha;

import java.util.LinkedList; 
import java.util.Queue; 
 
public class ExemploFila { 
    public static void main(String[] args) { 
        Queue<String> fila = new LinkedList<>(); 
 
        // Adicionando elementos (enqueue)
        fila.add("João"); 
        fila.add("Maria"); 
        fila.add("Pedro"); 
        fila.add("Ana"); 
 
        System.out.println("Fila inicial: " + fila); 
 
        // Removendo elemento (dequeue)
        String atendido = fila.poll(); // remove e retorna o primeiro da fila
        System.out.println("Atendido: " + atendido); 
 
        // Exibindo o primeiro da fila (peek)
        System.out.println("Próximo: " + fila.peek()); // apenas visualiza o primeiro
 
        // Exibindo a fila atual
        System.out.println("Fila atual: " + fila); 
 
        // Verificando se está vazia
        System.out.println("Fila está vazia? " + fila.isEmpty()); 
    } 
}
