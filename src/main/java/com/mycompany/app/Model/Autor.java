package com.mycompany.app.Model;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.app.Interface.PublicavelInterface;

public class Autor extends Pessoa {
    private String nacionalidade;
    private List<Livro> obrasPublicadas;
    private boolean isUsuario;
    private PublicavelInterface estrategiaPublicacao;

    public Autor (String nome, String nacionalidade, boolean isUsuario) {
        super(nome, new Livro[0]);
        this.nacionalidade = nacionalidade;
        this.obrasPublicadas = new ArrayList<>();
        this.isUsuario = isUsuario;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public Livro[] getObrasPublicadas() {
        return obrasPublicadas.toArray(new Livro[0]);
    }

    public Livro[] getObrasPublicadasPorGenero(String genero) {
        List<Livro> obrasPorGenero = new ArrayList<>();
        for (Livro livro : obrasPublicadas) {
            if (livro.getGenero().equalsIgnoreCase(genero)) {
                obrasPorGenero.add(livro);
            }
        }
        return obrasPorGenero.toArray(new Livro[0]);
    }

    public void adicionarObraPublicada(Livro livro) {
        obrasPublicadas.add(livro);
    }

    public boolean isUsuario () {
        return isUsuario;
    }

    public void setEstrategiaPublicacao(PublicavelInterface estrategiaPublicacao) {
        this.estrategiaPublicacao = estrategiaPublicacao;
    }

    public void publicar() {
        if(estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();
        } else {
            System.out.println("Nenhuma estratégia de publicação foi configurada...");
        }
    }

}