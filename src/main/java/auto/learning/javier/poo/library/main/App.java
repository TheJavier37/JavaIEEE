package auto.learning.javier.poo.library.main;

import auto.learning.javier.poo.library.entity.Book;
import auto.learning.javier.poo.library.entity.Library;
import java.util.Scanner;

public class App {

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       int opcion = 0;

       Library biblioteca = new Library(50);

       do {

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
                   System.out.println("Titulo: ");
                   String titulo = scanner.nextLine();

                   System.out.println("Autor: ");
                   String author = scanner.nextLine();

                   System.out.println("Genero: ");
                   String genre = scanner.nextLine();

                   System.out.println("Año de publicación: ");
                   int yearPublished = scanner.nextInt();
                   scanner.nextLine();

                   if (titulo.isEmpty()){
                       System.out.println("El titulo no puede estar vacio");
                       break;
                   }
                   if (author.isEmpty()){
                       System.out.println("El autor no puede estar vacio");
                       break;
                   }
                   if (genre.isEmpty()){
                       System.out.println("El genero no puede estar vacio");
                       break;
                   }
                   if(yearPublished <= 0){
                       System.out.println("El año no es valido");
                       break;
                   }

                   Book nuevoLibro = new Book(titulo, author, genre, yearPublished);
                   biblioteca.registerBook(nuevoLibro);

                   break;
               case 2:
                   System.out.println("=== TODOS LOS LIBROS ===");
                   biblioteca.mostrarLibros();

                   break;
               case 3:
                   break;
               case 4:
                   break;
               case 0:
                   System.out.println("Saliendo...");
                   break;
               default:
                   System.out.println("Opcion invalida");

           }

       } while (opcion != 0);




   }

}
