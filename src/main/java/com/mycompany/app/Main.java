import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", "Brasileira", new Livro[0]);
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");
        autor.adicionarObraPublicada(livro);

        Usuario usuario = new Usuario("Lucas Rafael", 25, new Emprestimo[0]);

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
    }
}
