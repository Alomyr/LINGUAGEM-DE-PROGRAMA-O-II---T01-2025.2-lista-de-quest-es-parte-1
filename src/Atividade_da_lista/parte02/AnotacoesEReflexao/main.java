package Atividade_da_lista.parte02.AnotacoesEReflexao;

public class main {

    public static void main(String[] args) {
        Class<Documento> classe = Documento.class;

        if (classe.isAnnotationPresent(InfoAutor.class)) {
            InfoAutor info = classe.getAnnotation(InfoAutor.class);

            System.out.println("Autor: " + info.autor());
            System.out.println("Data: " + info.data());
        } else {
            System.out.println("A classe Documento não possui a anotação @InfoAutor.");
        }

        Documento doc = new Documento("Relatório de Estruturas de Dados");
        doc.exibir();
    }
}
