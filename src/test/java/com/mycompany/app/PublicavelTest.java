package com.mycompany.app;

import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.EstrategiaPublicacaoArtigo;
import com.mycompany.app.Model.EstrategiaPublicacaoLivro;

public class PublicavelTest {
    @Test
    public void testPublicacaoLivro() {
        Autor autor = new Autor("Jessica Felix", "Brasileira", true);
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        autor.publicar();
    }

    @Test
    public void testPublicacaoArtigo() {
        Autor autor = new Autor("Jessica Felix", "Brasileira", true);
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        autor.publicar();
    }
}
