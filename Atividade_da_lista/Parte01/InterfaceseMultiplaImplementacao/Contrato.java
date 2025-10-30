package Atividade_da_lista.Parte01.InterfaceseMultiplaImplementacao;

public class Contrato implements Imprimivel {

    private String titulo;
    private String name;
    private String contratante;
    private String objeto;
    private String data;
    private String conteudo;
    private double valor;
    private int prasoMes;
    private int paginas;

    public Contrato() {
        this.titulo = "titulo";
        this.name = "name";
        this.contratante = "contratante";
        this.objeto = "objeto";
        this.data = "data";
        this.conteudo = "conteudo";
        this.valor = 0;
        this.prasoMes = 0;
        this.paginas = 1;
    }

    public Contrato(String titulo, String name, String contratante, String objeto, String data, String conteudo, double valor, int prasoMes, int paginas) {
        this.titulo = titulo;
        this.name = name;
        this.contratante = contratante;
        this.objeto = objeto;
        this.data = data;
        this.conteudo = conteudo;
        this.valor = valor;
        this.prasoMes = prasoMes;
        this.paginas = paginas;
    }

    @Override
    public void imprimir() {
        System.out.println("==RELATORIO==");
        System.out.println(this.titulo);
        System.out.println(this.data);
        System.out.println(this.name);
        System.out.println(this.contratante);
        System.out.println(this.objeto);
        System.out.println(this.conteudo);
        System.out.println(this.valor);
        System.out.println(this.prasoMes);
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

    public String getContratante() {
        return contratante;
    }

    public String getName() {
        return name;
    }

    public String getObjeto() {
        return objeto;
    }

    public int getPrasoMes() {
        return prasoMes;
    }
}
