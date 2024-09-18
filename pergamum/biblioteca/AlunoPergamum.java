package biblioteca;
import java.util.ArrayList;

public class AlunoPergamum {
    private int matricula;
    private String nome;
    private ArrayList<LivroPergamum> emprestimos;
    private int totalLivros;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<LivroPergamum> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<LivroPergamum> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getTotalLivros() {
        return totalLivros;
    }

    public AlunoPergamum() {

    }

    public AlunoPergamum(int Matricula, String Nome, int TotalLivros) {
        this.matricula = Matricula;
        this.nome = Nome;
        this.totalLivros = TotalLivros;
        this.emprestimos = new ArrayList<>();
    }

    public boolean EmprestarLivro(LivroPergamum livro) {
        if (emprestimos.size() >= totalLivros) {
            System.out.println("Limite de livros emprestado atingido.");
            return false;
        } 
        emprestimos.add(livro);
        System.out.println("Livro emprestado: " + livro.getTitulo());
        return true;
    }

    public boolean DevolverLivro(LivroPergamum livro) {
        for (int i = 0; i < emprestimos.size(); i++) {
            if (emprestimos.get(i).getCodigo() == livro.getCodigo()) {
                emprestimos.remove(i);
                System.out.println("Livro devolvido.");
                return true;
            } 
        }
        System.out.println("Livro não encontrado");
        return false;
    }

}
