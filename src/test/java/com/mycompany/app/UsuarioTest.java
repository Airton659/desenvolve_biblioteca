package com.mycompany.app;

import org.junit.Test;
import com.mycompany.app.Model.Usuario;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;

import java.util.Date;
import static org.junit.Assert.*;

public class UsuarioTest {

    @Test
    public void testGetNome() {
        Emprestimo[] historicoEmprestimo = {};
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        assertEquals("Lucas Rafael", usuario.getNome());
    }


    @Test
    public void testGetIdade() {
        Emprestimo[] historicoEmprestimo = {};
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        assertEquals(25, usuario.getIdade());
    }

    @Test
    public void testGetHistoricoEmprestimos() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês",true), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(usuario, livro, dataRetirada,dataDevolucao);
        Emprestimo[] historicoEmprestimo = {emprestimo};
        usuario.setHistoricoEmprestimo(historicoEmprestimo);

        assertArrayEquals(historicoEmprestimo, usuario.getHistoricoEmprestimos());

    }

}
