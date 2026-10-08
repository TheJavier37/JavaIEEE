package auto.learning.javier.library.app;

import auto.learning.javier.library.entity.Book;
import auto.learning.javier.library.entity.Library;
import java.util.Scanner;

/**
 * @author TheJavier37 (Javier Guarnizo Vega)
 * Clase ejectuable del proyecto integrador
 */

public class Main {

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       int opcion = 0;
       boolean keepGoing = true;

       Library biblioteca = new Library(50);

       do {

           try {

               System.out.println("=====================");
               System.out.println("SISTEMA DE BIBLIOTECA");
               System.out.println("=====================");
               System.out.println("1. Registrar libro");
               System.out.println("2. Mostrar todos los libros");
               System.out.println("3. Prestar libro");
               System.out.println("4. Devolver libro");
               System.out.println("0. Salir");

               System.out.println("Ingrese una opción: ");
               opcion = scanner.nextInt();
               scanner.nextLine();

               switch (opcion) {
                   case 1:
                       System.out.println("=== REGISTRAR LIBRO ===");
                       String titulo;

                       do {
                           System.out.println("Titulo: ");
                           titulo = scanner.nextLine();
                       } while (titulo.isEmpty());

                       String author;
                       do {
                           System.out.println("Autor: ");
                           author = scanner.nextLine();
                       } while (author.isEmpty());

                       String genre;
                       do {
                           System.out.println("Genero: ");
                           genre = scanner.nextLine();
                       } while (genre.isEmpty());

                       int yearPublished;
                       do {
                           System.out.println("Año de publicación: ");
                           yearPublished = scanner.nextInt();
                           scanner.nextLine();
                       } while (yearPublished <= 0);

                       Book nuevoLibro = new Book(titulo, author, genre, yearPublished);
                       biblioteca.registerBook(nuevoLibro);
                       biblioteca.saveBook(nuevoLibro);
                       break;
                   case 2:
                       System.out.println("=== TODOS LOS LIBROS ===");
                       biblioteca.showBooks();
                       break;
                   case 3:
                       System.out.println("=== PRESTAR LIBRO ===");
                       System.out.println("Ingrese el título del libro: ");
                       String prestarTitulo = scanner.nextLine();
                       biblioteca.lendBook(prestarTitulo);
                       break;

                   case 4:
                       System.out.println("=== DEVOLVER LIBRO ===");
                       System.out.println("Ingrese el título del libro: ");
                       String devolverTitulo = scanner.nextLine();
                       biblioteca.returnBook(devolverTitulo);
                       break;
                   case 0:
                       System.out.println("Saliendo...");
                       keepGoing = false;
                       break;
                   default:
                       System.out.println("Opcion invalida");

               }
           } catch(Exception e){
               System.out.println("Error: " + e.getMessage());
               scanner.nextLine();
           }


       } while (keepGoing);




   }

}
