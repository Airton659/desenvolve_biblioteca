package com.mycompany.app;

import org.junit.Test;

import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;
import static org.junit.Assert.*;

public class ArtigoTest {
    @Test
    public void testGetGenero() {
        Autor autor = new Autor("Jess", "Brasileira", true);
        Artigo artigo = new Artigo("Testando Artigo", autor, "tecnologia", false);

        assertEquals("tecnologia", artigo.getGenero());

    }

    @Test
    public void testIsPublicado() {
        Autor autor = new Autor("Jess", "Brasileira", true);
        Artigo artigo = new Artigo("Testando Artigo", autor, "tecnologia", true);
        Artigo artigo2 = new Artigo("Testando Artigo", autor, "tecnologia", false);

        assertTrue(artigo.isPublicado());
        assertFalse(artigo2.isPublicado());
        
    }


}
