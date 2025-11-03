package Atividade_da_lista.parte02.HierarquiadeExecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class questao02 {

    private String in;
    private Scanner readme = null;

    public void lerArquivo(String in) {

        try {
            File file = new File(in);
            readme = new Scanner(file);

            while (readme.hasNext()) {
                String line = readme.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            if (readme != null) {
                readme.close();
            }
        }
    }

    public questao02() {
    }

    public questao02(String in) {
        this.in = in;
    }    
}
