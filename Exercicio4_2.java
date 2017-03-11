import java.util.ArrayList;
class Book{

    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String toString(){
        return "O nome do livro é "+ this.nome; 
    }
}
class Main{
    private ArrayList<Book> library ;
    public void main(){
        Book primeiroLivro = new Book();
        primeiroLivro.setNome("Biblia");
        Book segundoLivro = new Book();
        segundoLivro.setNome("Organização e Projeto de computadores");
        library = new ArrayList<Book>();
        library.add(primeiroLivro);
        library.add(segundoLivro);
        System.out.println(library);
    }
}
public class Exercicio4_2{
    public static void main (String []args){
        Main rodando = new Main();
        rodando.main();
    }
}