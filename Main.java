import biblioteca.*;

public static void Main(Srting[] args) {
    Pergamum bibliotecaUnit = new Pergamum(1, "Carlos", 3, 3);

    AlunoPergamum aluno1 = new AlunoPergamum(1, "João", 3);
    
    AlunoPergamum aluno2 = new AlunoPergamum(2, "Antonio", 3);

    AlunoPergamum aluno3 = new AlunoPergamum(1, "Pedro", 3);

    LivroPergamum livro1 = new LivroPergamum(1, "A moreninha", "Autor1", "blablabla", 3);


    LivroPergamum livro2 = new LivroPergamum(2, "Crepusculo", "Autor2", "Lalalala", 3);

    LivroPergamum livro3 = new LivroPergamum(3, "O Sertão vai virar mar", "Autor3", "Auauaua", 3);

    aluno1.EmprestarLivro(livro3);

    aluno2.EmprestarLivro(livro2);

    aluno3.EmprestarLivro(livro1);

    aluno2.DevolverLivro(livro2);

    aluno2.DevolverLivro(livro3);
}