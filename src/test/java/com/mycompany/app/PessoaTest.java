package com.mycompany.app;
import com.mycompany.app.Livro;
import com.mycompany.app.Pessoa;


import org.junit.Test;

import static org.junit.Assert.*;


public class PessoaTest {

    @Test
    public void testGetNome() {
        Livro[] livros = {};
        Pessoa pessoa = new Pessoa("Jess", livros);
        assertEquals("Jess", pessoa.getNome());

    }

    @Test
    public void testSetNome() {
        Livro[] livros = {};
        Pessoa pessoa = new Pessoa("Nome Inicial", livros);
        
        pessoa.setNome("Jess");
        assertEquals("Jess", pessoa.getNome());

    }

    @Test
    public void testGetLivros() {
        Autor autor = new Autor ("Jessica Felix", "Brasileira", new Livro[0]);

        Livro livro1 = new Livro("Java Básico", autor, "Tecnologia");
        Livro livro2 = new Livro("Java Avançado", autor, "Tecnologia");

        Livro[] livros = {livro1,livro2};

        autor.adicionarObraPublicada(livro1);
        autor.adicionarObraPublicada(livro2);

        Pessoa pessoa = new Pessoa ("José",livros);
        assertArrayEquals(livros, pessoa.getLivros());  
    }

    @Test
    public void testSetLivros() {
        Autor autor = new Autor ("Jessica Felix", "Brasileira", new Livro[0]);
        Livro livroInicial = new Livro ("Livro 1", autor, "Poesia");

        Livro[] livrosInicial = {livroInicial};
        Pessoa pessoa = new Pessoa("José", livrosInicial);

        Livro livro1 = new Livro("Java Básico", autor, "Tecnologia");
        Livro livro2 = new Livro("Java Avançado", autor, "Tecnologia");

        Livro[] novosLivros= {livro1, livro2};
        pessoa.setLivros(novosLivros);

        assertArrayEquals(novosLivros, pessoa.getLivros());


        
    }



    
}

