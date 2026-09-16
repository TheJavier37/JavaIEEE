package auto.learning.javier.segundaclase;

import java.util.Scanner;

/**
 * @author TheJavier37 (Javier Guarnizo Vega)

 * Enunciado del Primer Ejercicio:
 * Una tienda necesita un pequeño programa para registrar una compra.

 * El programa debe solicitar al usuario los siguientes datos:

 * Datos del cliente:
 * Nombre completo
 * Edad
 * Ciudad

 * Datos del producto:
 * Código del producto
 * Nombre del producto
 * Precio
 * Cantidad
 * Categoría del producto (A, B o C)
 * ¿El producto está disponible?

 * Datos adicionales:
 * IVA

 * El IVA debe almacenarse como una constante, por lo que debe utilizar final.
 *
 * Después de ingresar todos los datos, el programa deberá mostrar un resumen de la información ingresada.
 */

public class RegistraCompra {

    public static void main(String[] args) {

        //IVA constante
        final double IVA = 0.15;

        //Datos del cliente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la ciudad a la que pertenece: ");
        String ciudad = scanner.nextLine();

        //Datos del producto
        System.out.println("Ingrese el codigo del producto: ");
        String codigoProducto = scanner.nextLine();

        System.out.println("Ingrese el nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la cantidad del producto: ");
        int cantidadProducto = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la categoria del producto (A, B o C): ");
        String categoriaProducto = scanner.nextLine();

        System.out.println("¿El producto está disponible? (true/false): ");
        boolean disponibleProducto = scanner.nextBoolean();

        scanner.close();

        System.out.println("DATOS INGRESADOS");
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Codigo del producto: " + codigoProducto);
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio del producto: " + precioProducto);
        System.out.println("Cantidad del producto: " + cantidadProducto);
        System.out.println("Categoria del producto: " + categoriaProducto);
        System.out.println("Disponible: " + disponibleProducto);
        System.out.println("El IVA estandar es de: " + IVA);

    }

}
