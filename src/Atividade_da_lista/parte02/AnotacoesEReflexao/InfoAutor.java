package Atividade_da_lista.parte02.AnotacoesEReflexao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface InfoAutor {
    String autor();
    String data();
}
