package Atividade_da_lista.parte02.StreamEColecoesProcessandoNomes;

import java.util.*;
import java.util.stream.*;

public class questao04 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bruno", "amanda", "Carlos", "Alice", "andre");

        List<String> resultado = nomes.stream()
                .filter(nome -> nome.toUpperCase().startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        // Exibe o resultado
        System.out.println("Nomes que começam com A (em maiúsculas e ordenados):");
        resultado.forEach(System.out::println);
    }
}
