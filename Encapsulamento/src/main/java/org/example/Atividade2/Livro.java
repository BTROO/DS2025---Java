package org.example.Atividade2;

public class Livro {
    String titulo;
    String autor;
    String isbn;
    double numeroPaginas;
    double valorCompra;

    public Livro(String titulo, String autor, String isbn, double numeroPaginas, double valorCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.valorCompra = valorCompra;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(double numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return "Livro {" + '\n' +
                "titulo = " + titulo + '\n' +
                " autor = " + autor + '\n' +
                " isbn = " + isbn + '\n' +
                " numeroPaginas = " + numeroPaginas + '\n' +
                " valorCompra = " + valorCompra + '\n' +
                '}';
    }
}
