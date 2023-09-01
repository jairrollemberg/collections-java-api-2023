package main.java.list.Pesquisa;

public class Livro {
    //atributos
    private String titulo;
    private  String autro;
    private  int anoPublicacao;

    public Livro(String titulo, String autro, int anoPublicacao) {
        this.titulo = titulo;
        this.autro = autro;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autro;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autro='" + autro + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
