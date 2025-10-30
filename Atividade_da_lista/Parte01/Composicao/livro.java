package Atividade_da_lista.Parte01.Composicao;

public class livro {

    private String name;
    private autor autor;

    public livro() {
    }

    public livro(String name, autor autor) {
        this.autor = autor;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAutor(autor autor) {
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public void exibir() {
        System.out.println("Nome do autor: " + autor.getName() + "\n" + "Nome do Livro: " + getName());
    }

}
