package Atividade_da_lista.Parte01.InterfaceseMultiplaImplementacao;

public class Relatorio implements Imprimivel {

    private String titulo;
    private String data;
    private String conteudo;
    private int paginas;

    public Relatorio() {
        this.titulo = "titulo";
        this.data = "data";
        this.conteudo = "conteudo";
        this.paginas = 1;
    }

    public Relatorio(String titulo, String data, String conteudo, int paginas) {
        this.titulo = titulo;
        this.data = data;
        this.conteudo = conteudo;
        this.paginas = paginas;
    }

    @Override
    public void imprimir() {
        System.out.println("==RELATORIO==");
        System.out.println(this.titulo);
        System.out.println(this.data);
        System.out.println(this.conteudo);
        System.out.println(this.paginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getData() {
        return data;
    }

    public String getConteudo() {
        return conteudo;
    }

    public int getPaginas() {
        return paginas;
    }
}
