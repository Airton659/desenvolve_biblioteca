package com.mycompany.app.Model;

import com.mycompany.app.Interface.PublicavelInterface;

public class EstrategiaPublicacaoArtigo implements PublicavelInterface{

    @Override
    public void publicar() {
        System.out.println("Artigo sendo publicado");
    }
    
}
