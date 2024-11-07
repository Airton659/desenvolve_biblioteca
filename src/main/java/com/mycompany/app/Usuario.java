public class Usuario extends Pessoa {
    private int idade;
    private Emprestimo[] historicoEmprestimo;

    public Usuario (String nome, int idade, Emprestimo[] historicoEmprestimo) {
        super(nome, null);
        this.idade = idade;
        this.historicoEmprestimo = historicoEmprestimo;
    }

    public int getIdade() {
        return idade;
    }

    public Emprestimo[] getHistoricoEmprestimos() {
        return historicoEmprestimo;
    }
}