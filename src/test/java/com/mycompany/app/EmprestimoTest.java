package com.mycompany.app;

import org.junit.Test;
import com.mycompany.app.Usuario;
import com.mycompany.app.Autor;
import com.mycompany.app.Livro;
import com.mycompany.app.Emprestimo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Date;

public class EmprestimoTest{

    @Test
    public void testEmprestimo() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês",new Livro[0]), "Tecnologia");
        Usuario usuario = new Usuario("Gabriel", 21);
        
        Emprestimo emprestimo = new Emprestimo (usuario, livro, dataRetirada, dataDevolucao);

        assertEquals(usuario, emprestimo.getUsuario());
        assertEquals(livro, emprestimo.getLivro());
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());

        assertFalse(livro.isDisponivel());

    }


   

    
}