package Atividade_da_lista.Parte01.InterfaceseMultiplaImplementacao;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) throws Exception {
        List<Imprimivel> docs = new ArrayList<>();

        docs.add(new Contrato());
        docs.add(new Relatorio());

        for (Imprimivel doc : docs) {
            doc.imprimir();
        }
        System.out.println("Total de documentos impressos: " + docs.size());
    }
}
