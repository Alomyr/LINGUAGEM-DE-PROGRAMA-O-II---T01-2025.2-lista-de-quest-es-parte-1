package Atividade_da_lista.Parte01.Composicao;

public class main {

    public static void main(String[] args) throws Exception {
 
        autor autor1 = new autor("test");
        livro livro = new livro("livro" , autor1);

        livro.exibir();
    }
}
//TODO: livro de conter autor tem-um, 
//FIXME: implmentar exibirDetalhes() -> mostra nome do autor e o titulo do livro 