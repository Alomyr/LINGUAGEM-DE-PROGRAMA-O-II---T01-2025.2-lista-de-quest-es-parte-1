package Atividade_da_lista.parte02.HierarquiadeExecoes;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        questao02 q02 = new  questao02();
        Scanner In = new Scanner(System.in);
        String in = In.nextLine();
        q02.lerArquivo(in);
    }
}