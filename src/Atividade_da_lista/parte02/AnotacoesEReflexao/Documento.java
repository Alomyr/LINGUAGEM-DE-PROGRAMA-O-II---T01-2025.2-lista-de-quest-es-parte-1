package Atividade_da_lista.parte02.AnotacoesEReflexao;

@InfoAutor(autor = "Matheus Silva", data = "03/11/2025")
public class Documento {
    private String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public void exibir() {
        System.out.println("Título do documento: " + titulo);
    }
}
