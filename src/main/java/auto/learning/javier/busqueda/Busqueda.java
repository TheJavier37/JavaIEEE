package auto.learning.javier.busqueda;

import auto.learning.javier.library.entity.Book;

public class Busqueda {

    public static void main(String[] args) {

        int numeroA = 37;
        int numeroB = 48;

        System.out.println(numeroA == numeroB);

        String mensaje1 = new String("Hola");
        String mensaje2 = new String("Hola");

        System.out.println(mensaje1.equals(mensaje2));

        Book libro1 = new Book("Elpibe", "Saul Gordon", "Fantasia", 2022);
        Book libro2 = new Book("Elpibe", "Saul Gordon", "Fantasia", 2022);

        System.out.println(libro1.equals(libro2)); //No recomendado
        System.out.println(libro1.getAuthor().equals(libro2.getAuthor()));
    }

}
