package com.mycompany.app;

import org.junit.Test;
import com.mycompany.app.Model.Usuario;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Emprestimo;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import java.util.Date;

public class EmprestimoTest{

    @Test
    public void testEmprestimo() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês", false), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        
        Emprestimo emprestimo = new Emprestimo (usuario, livro, dataRetirada, dataDevolucao);

        assertEquals(usuario, emprestimo.getUsuario());
        assertEquals(livro, emprestimo.getLivro());
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());

        assertTrue(livro.isDisponivel());

    }


   

    
}