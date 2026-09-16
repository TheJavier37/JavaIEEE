package auto.learning.javier.tarea;

import java.util.Scanner;

/**
 * @author TheJavier37 (Javier Guarnizo Vega)
 * Clase correspodiente a la primera tarea desginada

 * Objetivo de la actividad
 * Desarrollar un programa en Java que permita registrar y mostrar la ficha de un libro, aplicando correctamente el
 * uso de tipos de datos primitivos y clases (int, String, double, boolean), además del uso de la clase Scanner para la
 * entrada de datos por consola.
 *
 */

public class FichaLibro {

    public static void main(String[] args) {

        String availableAnswer;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código del libro: ");
        String code = scanner.nextLine();

        System.out.println("Ingrese el título del libro: ");
        String title = scanner.nextLine();

        System.out.println("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el año de publicación del libro: ");
        int publicationYear = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el precio del libro: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese si el libro esta disponible (true/false): ");
        boolean available = scanner.nextBoolean();
        if (available) {
            availableAnswer = "Si";
        } else {
            availableAnswer = "No";
        }

        System.out.println("========================================");
        System.out.println("            FICHA DEL LIBRO");
        System.out.println("========================================");
        System.out.println("Código:             " + code);
        System.out.println("Título:             " + title);
        System.out.println("Autor:              " + autor);
        System.out.println("Año de publicación: " + publicationYear);
        System.out.println("Precio:             " + "$" + price);
        System.out.println("Disponible:         " + availableAnswer);

    }

}
