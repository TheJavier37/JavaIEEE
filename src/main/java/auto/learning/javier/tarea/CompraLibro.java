package auto.learning.javier.tarea;

import java.util.Scanner;

/**
 * @author thejavier37 (Javier Guarnizo Vega)
 * Clase correspondiente a la Tarea 2
 * Objetivo de la tarea
 * Desarrollar un programa que solicite el precio unitario y la cantidad de libros adquiridos, calcule el subtotal,
 * aplique un descuento del 10 % cuando la compra supere los $50, y muestre el valor final a pagar.
 */

public class CompraLibro {

    public static void main(String[] args) {

        final double DESCUENTO = 0.1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio unitario del libro: ");
        double precioUnitario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la cantidad de libros: ");
        int cantidadLibros = scanner.nextInt();
        scanner.nextLine();

        double subtotal = precioUnitario * cantidadLibros;
        double valorFinal = subtotal;
        if (subtotal > 50) {
            double descuento = subtotal * DESCUENTO;
            valorFinal = subtotal - descuento;
        }

        System.out.println("===============================");
        System.out.println("       RESUMEN DE COMPRA");
        System.out.println("===============================");

        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Cantidad de libros: " + cantidadLibros);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        if (subtotal > 50) {
            System.out.println("Descuento" + "(" + (DESCUENTO * 100)  + "%): $" + (subtotal * DESCUENTO));
        }
        System.out.println("------------------------------");
        System.out.printf("TOTAL A PAGAR: $%.2f%n", valorFinal);
        System.out.println("===============================");

    }

}
