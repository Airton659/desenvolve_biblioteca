import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private String nacionalidade;
    private List<Livro> obrasPublicadas;

    public Autor (String nome, String nacionalidade, Livro[] livros) {
        super(nome, livros);
        this.nacionalidade = nacionalidade;
        this.obrasPublicadas = new ArrayList<>();
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


}