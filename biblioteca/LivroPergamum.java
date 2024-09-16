public class LivroPergamum {
    private int codigo;
    private String titulo;
    private String autor;
    private String ISBN;
    private int totalExemplares;
    private int exemplaresEmprestados;

    
    public LivroPergamum(int codigo, String titulo, String autor, String ISBN, int totalExemplares){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.totalExemplares = totalExemplares;
        this.exemplaresEmprestados = 0;
    }

    
    // Getters and Setters

    public int getCodigo(){
        return this.codigo;
    }

    
    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String novoTitulo){
        this.titulo = novoTitulo;
    }


    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String novoAutor){
        this.autor = novoAutor;
    }

    
    public String getISBN(){
        return this.ISBN;
    }

    public void setISBN(String novoISBN){
        this.ISBN = novoISBN;
    }

    
    public int getTotalExemplares(){
        return this.totalExemplares;
    }

    public int getExemplaresEmprestados(){
        return this.exemplaresEmprestados;
    }



    // Methods

    public int livrosDisponiveis(){
        return this.totalExemplares - this.exemplaresEmprestados;
    }

    public String imprimirDadosLivro(){
        return this.titulo + ", " + this.autor + ", " + this.ISBN + ", total:" + 
            this.totalExemplares + ", emprestados:" + this.exemplaresEmprestados;
    }

    public boolean isDisponivel(){
        return this.totalExemplares - this.exemplaresEmprestados > 0; 
    }

    void setDisponivel(boolean disponivel){
        if (this.exemplaresEmprestados == this.totalExemplares){
            System.out.println("Todos os livros já estao disponiveis.");
            return;
        }
        this.exemplaresEmprestados -= 1;
    }
}   

