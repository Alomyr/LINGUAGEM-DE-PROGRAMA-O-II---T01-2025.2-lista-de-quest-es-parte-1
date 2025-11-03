package Atividade_da_lista.parte02.TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class questao01 {

    private int number;
    private Scanner in = new Scanner(System.in);

    public void leitura() {
        System.out.print("Digite: ");
        do {
            try {
                number = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("entrada invalida. Digite um numero interito." + e);
                return;
            }
        } while (true);
    }

    public questao01() {
    }

    public questao01(int number) {
        this.number = number;
    }
}
