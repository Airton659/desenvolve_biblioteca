package com.mycompany.app;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Livro;



import org.junit.Test;
import static org.junit.Assert.*;

public class AutorTest {

    @Test
    public void testGetNacionalidade() {
        Autor autor = new Autor("Jess", "Brasileira");
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testGetObrasPublicadasVazia() {
        Livro[] livros = {};
        Autor autor = new Autor("Jessica Felix", "Brasileira");

        Livro[] obrasPublicadas = autor.getObrasPublicadas();
        assertEquals(0, obrasPublicadas.length);
    }

    @Test
    public void testGetObrasPublicadasPorGenero() {
        Livro [] livros = {};
        Autor autor = new Autor("Jessica Felix", "Brasileira");
        
        Livro livro = new Livro("Java Básico", autor, "Tecnologia", true);    
        Livro livro2 = new Livro("Java Avançado", autor, "Tecnologia", true);    
        Livro livro3 = new Livro("Poesia Moderna", autor, "Literatura", false);

        autor.adicionarObraPublicada(livro);
        autor.adicionarObraPublicada(livro2);
        autor.adicionarObraPublicada(livro3);

        Livro[] obrasTecnologia = autor.getObrasPublicadasPorGenero("Tecnologia");
        assertEquals(2, obrasTecnologia.length);
        assertEquals(livro, obrasTecnologia[0]);
        assertEquals(livro2, obrasTecnologia[1]);

        Livro[] obrasLiteratura = autor.getObrasPublicadasPorGenero("Literatura");
        assertEquals(1,obrasLiteratura.length);
        assertEquals(livro3, obrasLiteratura[0]);

    }


}
