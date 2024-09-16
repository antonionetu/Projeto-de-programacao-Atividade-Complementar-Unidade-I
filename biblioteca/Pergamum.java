package biblioteca;
import java.util.ArrayList;

public class Pergamum {
    private int codigo;
    private String nome;
    private ArrayList<LivroPergamum> listaLivros;
    private ArrayList<AlunoPergamum> listaAlunos;
    
    private int totalLivros;
    private int totalAlunos;

    
    public Pergamum(int codigo, String nome, int totalLivros, int totalAlunos){
        this.codigo = codigo;
        this.nome = nome;
        this.totalLivros = totalLivros;
        this.totalAlunos = totalAlunos;
    }



    // Getters and Setters

    public int getCodigo(){
        return this.codigo;
    }

    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    
    public int getTotalLivros(){
        return this.totalLivros;
    }
    
    public int getTotalAlunos(){
        return this.totalAlunos;
    }



    // Methods

    public boolean cadastrarAluno(AlunoPergamum aluno){
        for(int i=0; i < totalAlunos; i++){
            if (listaAlunos[i].getMatricula() == aluno.getMatricula()){
                return false;
            }
        }

        listaAlunos.add(aluno);
        totalAlunos += 1;
        return true;
    }

    public String retirarAluno(int matricula){
        for(int i=0; i < totalAlunos; i++){
            if (listaAlunos[i].getMatricula() == matricula){
                listaAlunos.remove(i);
                totalAlunos -= 1;
                return "Aluno removido com sucesso!";
            }
        }
        return null;
    }

    public boolean cadastrarLivro(LivroPergamum livro){
        listaLivros.add(livro);
        totalLivros += 1;
    }

    public String retirarLivro(int codigo){
        for(int i=0; i < totalLivros; i++){                                          
            if (listaLivros[i].getCodigo() == codigo){                        
                listaLivros.remove(i);                                                  
                totalLivros -= 1;                                                       
                return "Livro removido com sucesso!";                                   
            }                                                                           
        }                                                                               
        return null;   
    }

    public LivroPergamum buscarLivro(int codigo){
        for(int i=0; i < totalLivros; i++){                                             
             if (listaLivros[i].getCodigo() == codigo){                                  
                return listaLivros[i];                                   
             }                                                                           
         }                                                                               
         return null; 
    }
}

