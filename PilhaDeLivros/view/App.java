package PilhaDeLivros.view;

import PilhaDeLivros.model.*;

public class App {

    public static void main(String[] args) {
        Livro livro1 = new Livro("Java 101", "John Doe", 2020);
        Livro livro2 = new Livro("Algoritmos em Ação", "Jane Smith", 2018);
        Livro livro3 = new Livro("Programação Orientada a Objetos", "Bob Johnson", 2019);

        PilhaLivros pilhaDeLivros = new PilhaLivros();

        pilhaDeLivros.empilharLivro(livro1);
        pilhaDeLivros.empilharLivro(livro2);
        pilhaDeLivros.empilharLivro(livro3);

        pilhaDeLivros.imprimirPilha();

        Livro livroDesempilhado1 = pilhaDeLivros.desempilharLivro();
        Livro livroDesempilhado2 = pilhaDeLivros.desempilharLivro();

        System.out.println("Livro desempilhado 1: " + livroDesempilhado1.getTitulo());
        System.out.println("Livro desempilhado 2: " + livroDesempilhado2.getTitulo());

        pilhaDeLivros.imprimirPilha();
    }
}
