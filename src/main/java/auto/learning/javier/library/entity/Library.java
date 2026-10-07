package auto.learning.javier.library.entity;

import java.io.*;

/**
 * @author TheJavier37 (Javier Guarnizo Vega)
 */

public class Library {

    private Book[] books;
    private int numBooks;

    public Library(int capacity) {
        books = new Book[capacity];
        numBooks = 0;
        readBooksText("books.txt");
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

    public void saveBook(Book libro) throws IOException {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("libros.txt",true));
            bufferedWriter.write(libro.getTitle() + ";" + libro.getAuthor() + ";" + libro.getYearPublished() + ";" + libro.isAvailable());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readBooksText(String file){

        File archivo = new File("libros.txt");

        if(!archivo.exists()){
            System.out.println("El archivo no existe");
        }

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo));
            String linea;
            while((linea = bufferedReader.readLine()) != null){
                String[] datos = linea.split(";");
                String title = datos[0];
                String author = datos[1];
                int yearPublished = Integer.parseInt(datos[2]);
                boolean available = Boolean.parseBoolean(datos[3]);
                Book libro = new Book(title, author, yearPublished, available);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
