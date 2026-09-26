package auto.learning.javier.poo.library.main;

import auto.learning.javier.poo.library.entity.Book;
import auto.learning.javier.poo.library.entity.Library;

public class App {

   public static void main(String[] args) {

       Library biblioteca = new Library(50);
       Book libro1 = new Book("El señor de los anillos", "J.R.R. Tolkien", "Fantasia",1954);

       biblioteca.registerBook(libro1);

   }

}
