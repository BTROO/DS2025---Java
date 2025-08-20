package org.example.atividade;

public class Livro {
    String titulo;
    String autor;
    double numeroPaginas;
    double preco;

    public Livro(String titulo, String autor, double numeroPaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(double numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
