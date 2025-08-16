package org.example.atividade;

public class Principal {
    public static void main(String[] args) {
        Livro livros = new Livro("Verity", "Colleen Hoover", 560, 59.99);
        Livro livros2 = new Livro("A paciente Silenciosa", "Alex Michaelides", 460, 98.99);

        System.out.println("\nTítulo: " + livros.titulo + "\nAutor:"+ livros.autor + "\nNúmero de Páginas: "+ livros.numeroPaginas + "\nPreço: "+ livros.preco);
        System.out.println("\nTítulo: " + livros2.titulo + "\nAutor:"+ livros2.autor + "\nNúmero de Páginas: "+ livros2.numeroPaginas + "\nPreço: "+ livros2.preco);
    }


}
