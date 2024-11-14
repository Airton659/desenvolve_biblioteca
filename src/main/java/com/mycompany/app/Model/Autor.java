package com.mycompany.app.Model;

import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private String nacionalidade;
    private List<Livro> obrasPublicadas;
    private boolean isUsuario;

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

}