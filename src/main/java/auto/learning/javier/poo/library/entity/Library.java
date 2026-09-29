package auto.learning.javier.poo.library.entity;

public class Library {

    private Book[] books;
    private int numBooks;

    public Library(int capacity) {
        books = new Book[capacity];
        numBooks = 0;
    }

    public void registerBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
            System.out.println("Libro registrado exitosamente: " + book.getTitulo());
        } else {
            System.out.println("La biblioteca está llena, no se puede registrar más libros.");
        }
    }

    public void mostrarLibros() {
        for (int i = 0; i < numBooks; i++) {
            System.out.println("Libro " + (i + 1) + ": " + books[i].getTitulo());
        }
    }

    public Book getBook(String titulo) {
        for(int i = 0; i < numBooks; i++){

            if (books[i].getTitulo().equalsIgnoreCase(titulo)){
                return books[i];
            }
            }
        return null;
    }


}
