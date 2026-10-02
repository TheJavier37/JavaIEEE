package auto.learning.javier.library.entity;

/**
 * @author TheJavier37 (Javier Guarnizo Vega)
 */

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
            System.out.println("Libro registrado exitosamente: " + book.getTitle());
        } else {
            System.out.println("La biblioteca está llena, no se puede registrar más libros.");
        }
    }

    public void mostrarLibros() {
        for (int i = 0; i < numBooks; i++) {
            System.out.println("Libro " + (i + 1) + ": " + books[i].getTitle());
        }
    }

    public Book getBook(String titulo) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(titulo)) {
                return books[i];
            }
        }
        return null;
    }

    public void lendBook(String titulo) {
        Book libro = getBook(titulo);
        if (libro != null) {
            if (libro.isAvailable()) {
                libro.setAvailable(false);
                System.out.println("El libro '" + libro.getTitle() + "' ha sido prestado exitosamente.");
            } else {
                System.out.println("El libro '" + libro.getTitle() + "' ya se encuentra prestado.");
            }
        } else {
            System.out.println("El libro no existe en la biblioteca.");
        }
    }

    public void returnBook(String titulo) {
        Book libro = getBook(titulo);
        if (libro != null) {
            if (!libro.isAvailable()) {
                libro.setAvailable(true);
                System.out.println("El libro '" + libro.getTitle() + "' ha sido devuelto exitosamente.");
            } else {
                System.out.println("El libro '" + libro.getTitle() + "' ya estaba disponible.");
            }
        } else {
            System.out.println("El libro no pertenece a la biblioteca.");
        }
    }
}
