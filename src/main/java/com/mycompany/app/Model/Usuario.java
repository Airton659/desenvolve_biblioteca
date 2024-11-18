package com.mycompany.app.Model;

import com.mycompany.app.Interface.PublicavelInterface;

public class Usuario extends Pessoa implements PublicavelInterface {
    private int idade;
    private Emprestimo[] historicoEmprestimo;

    public Usuario (String nome, int idade) {
        super(nome, null);
        this.idade = idade;
        this.historicoEmprestimo = new Emprestimo[0];
    }

    public int getIdade() {
        return idade;
    }

    public Emprestimo[] getHistoricoEmprestimos() {
        return historicoEmprestimo;
    }

    public void setHistoricoEmprestimo(Emprestimo[] historicoEmprestimo) {
        this.historicoEmprestimo = historicoEmprestimo;
    }

    @Override
    public void publicar() {
        System.out.println("Usuário publicando...");
    }
}