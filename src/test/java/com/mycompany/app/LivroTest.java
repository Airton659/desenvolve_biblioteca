package com.mycompany.app;

import com.mycompany.app.Livro;
import com.mycompany.app.Autor;

import org.junit.Test;
import static org.junit.Assert.*;

public class LivroTest {

    @Test
    public void testGetTitulo() {
        Autor autor = new Autor("Jess", "Brasileira", new Livro[0]);
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia");
        assertEquals("Java Basico", livro1.getTitulo());
    }

    @Test
    public void testGetAutor() {
        Autor autor = new Autor("Jess", "Brasileira", new Livro[0]);
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia");
        assertEquals(autor, livro1.getAutor());
    }

    @Test
    public void testGetGenero() {
        Autor autor = new Autor("Jess", "Brasileira", new Livro[0]);
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia");
        assertEquals("tecnologia", livro1.getGenero());
  }

    @Test
    public void testIsDisponivel() {
        Autor autor = new Autor("Jess", "Brasileira", new Livro[0]);
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia");
        assertTrue(livro1.isDisponivel());        
    }

    @Test
    public void testValidarDisponibilidade() {
        Autor autor = new Autor("Jess", "Brasileira", new Livro[0]);
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia");
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia");
        livro1.validarDisponibilidade(true);
        assertTrue(livro1.isDisponivel());

    }
}
