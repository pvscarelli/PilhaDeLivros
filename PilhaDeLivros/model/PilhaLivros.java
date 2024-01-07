package PilhaDeLivros.model;

import java.util.LinkedList;

public class PilhaLivros {

    private LinkedList<Livro> pilhaLivros = new LinkedList();

    public void empilharLivro(Livro livro) {
        pilhaLivros.push(livro);
    }

    public Livro desempilharLivro() {
        if (!pilhaLivros.isEmpty()) {
            return pilhaLivros.pop();
        } else {
            System.out.println("A pilha de livros está vazia.");
            return null;
        }
    }

    public void imprimirPilha() {
        System.out.println("Livros na pilha: ");
        for (Livro livro : pilhaLivros) {
            System.out.println("- " + livro.getTitulo() + " por " + livro.getAutor());
        }
    }
}
