package com.mycompany.app.Model;

import com.mycompany.app.Interface.PublicavelInterface;

public class EstrategiaPublicacaoLivro implements PublicavelInterface {
    @Override
    public void publicar() {
        System.out.println("Livro sendo publicado...");
    }
    
}
