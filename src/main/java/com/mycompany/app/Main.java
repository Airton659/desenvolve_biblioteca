package com.mycompany.app;

import java.util.Date;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.EstrategiaPublicacaoLivro;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;
import com.mycompany.app.Model.Artigo;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", "Brasileira", true);
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", true);
        autor.adicionarObraPublicada(livro);
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        autor.publicar();

        Usuario usuario = new Usuario("Lucas Rafael", 25);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        Date dataAtual = new Date();
        Emprestimo emprestimo = new Emprestimo(usuario, livro, dataAtual, dataAtual);  

        System.out.println("O livro não está disponível");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
        System.out.println("Artigo: " + artigo.getTitulo());
        System.out.println("Usuario: " + autor.isUsuario());
        
    }
}
