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
               System.out.println("SISTEMA DE BIBLIOTECA NOVAVIER");
               System.out.println("=====================");
               System.out.println("1. Registrar libro");
               System.out.println("2. Mostrar todos los libros");
               System.out.println("3. Prestar libro");
               System.out.println("4. Devolver libro");
               System.out.println("0. Salir");

               do {

                   System.out.println("Ingrese una opción: ");
                   opcion = scanner.nextInt();
                   scanner.nextLine();
                   if (opcion < 0 || opcion > 4) {
                       System.out.println("Opción inválida. Intente nuevamente.");
                   }

               }while (opcion < 0 || opcion > 4);

               switch (opcion) {
                   case 1:
                       System.out.println("=== REGISTRAR LIBRO ===");
                       String titulo;

                       do {
                           System.out.println("Titulo: ");
                           titulo = scanner.nextLine();
                           if (titulo.isEmpty()) {
                               System.out.println("El título no puede estar vacío. Intente nuevamente.");
                           }
                       } while (titulo.isEmpty());

                       String author;
                       do {
                           System.out.println("Autor: ");
                           author = scanner.nextLine();
                           if (author.isEmpty()) {
                               System.out.println("El autor no puede estar vacío. Intente nuevamente.");
                           }
                       } while (author.isEmpty());

                       String genre;
                       do {
                           System.out.println("Genero: ");
                           genre = scanner.nextLine();
                           if (genre.isEmpty()) {
                               System.out.println("El género no puede estar vacío. Intente nuevamente.");
                           }
                       } while (genre.isEmpty());

                       int yearPublished;
                       do {
                           System.out.println("Año de publicación: ");
                           yearPublished = scanner.nextInt();
                           scanner.nextLine();
                           if (yearPublished <= 0) {
                               System.out.println("El año de publicación debe ser mayor que cero. Intente nuevamente.");
                           }
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
                       System.out.println("Gracias por preferirnos");
                       keepGoing = false;
                       break;
                   default:
                       System.out.println("Opcion invalida");

               }
           } catch(Exception e){
               System.out.println("Ha ocurrido un error: " + e.getMessage());
               scanner.nextLine();
           }


       } while (keepGoing);




   }

}
