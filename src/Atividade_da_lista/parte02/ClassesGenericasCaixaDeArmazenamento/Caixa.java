package Atividade_da_lista.parte02.ClassesGenericasCaixaDeArmazenamento;

public class Caixa<T> {
    private T valor;

    public void guardar(T valor) {
        this.valor = valor;
    }

    public T abrir() {
        return valor;
    }
}
