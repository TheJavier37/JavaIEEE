package auto.learning.javier.tarea;

import java.util.Scanner;

/**
 * @author TheJavier37 (Javier Guarnizo Vega)
 * Desarrollar un programa en Java que simule un sistema básico de ventas de una tienda.
 * El programa deberá permitir al usuario registrar varias compras y obtener información sobre las mismas. Para
 * resolver el problema se deberán utilizar los diferentes conceptos estudiados durante las primeras etapas del
 * curso.
 */

public class VentaTienda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String respuesta;

        final double DESCUENTO_NORMAL = 0.10;
        final double DESCUENTO_ESTUDIANTE = 0.15;
        final double DESCUENTO_PROFESOR = 0.20;

        // Acumuladores de información
        int cantidadTotalCompras = 0;
        int cantidadTotalProductosRegistrados = 0;
        double totalAntesDescuentos = 0.0;
        double totalDescuentosAplicados = 0.0;
        double totalFinalPagar = 0.0;

        // Registro de datos del cliente
        System.out.println("=== DATOS DEL CLIENTE ===");
        System.out.print("Ingrese el tipo de cliente (normal / estudiante / profesor): ");
        String tipoCliente = scanner.nextLine().toLowerCase();

        if (tipoCliente.equals("normal")) {
            System.out.println("Ha seleccionado cliente normal");
        } else if (tipoCliente.equals("estudiante")) {
            System.out.println("Ha seleccionado cliente estudiante");
        } else if (tipoCliente.equals("profesor")) {
            System.out.println("Ha seleccionado profesor");
        } else {
            System.out.println("Tipo de cliente no reconocido. Se asignará como cliente normal.");
            tipoCliente = "normal";
        }

        System.out.print("Ingrese si posee membresía (si/no): ");
        String membresia = scanner.nextLine().toLowerCase();
        boolean membresiaCliente = membresia.equals("si");

        if (membresiaCliente) {
            System.out.println("El cliente posee membresía.");
        } else {
            System.out.println("El cliente no posee membresía.");
        }

        // Determinar el porcentaje de descuento a aplicar para toda la compra
        double porcentajeDescuento = 0.0;
        if (membresiaCliente) {
            if (tipoCliente.equals("normal")) {
                porcentajeDescuento = DESCUENTO_NORMAL;
            } else if (tipoCliente.equals("estudiante")) {
                porcentajeDescuento = DESCUENTO_ESTUDIANTE;
            } else if (tipoCliente.equals("profesor")) {
                porcentajeDescuento = DESCUENTO_PROFESOR;
            }
        }

        // Registro de productos
        do {
            double precioProducto;
            int cantidadProducto;

            System.out.println("--- REGISTRO DE PRODUCTOS ---");
            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = scanner.nextLine();

            // Validación de precio
            do {
                System.out.print("Ingrese el precio del producto: ");
                precioProducto = scanner.nextDouble();
                if (precioProducto <= 0) {
                    System.out.println("El precio del producto debe ser mayor a 0");
                }
            } while (precioProducto <= 0);

            // Validación de cantidad
            do {
                System.out.print("Ingrese la cantidad del producto: ");
                cantidadProducto = scanner.nextInt();
                if (cantidadProducto <= 0) {
                    System.out.println("La cantidad del producto debe ser mayor a 0");
                }
            } while (cantidadProducto <= 0);

            scanner.nextLine();

            // Cálculos del producto registrado
            double subtotalProducto = precioProducto * cantidadProducto;
            double descuentoAplicado = subtotalProducto * porcentajeDescuento;
            double totalProducto = subtotalProducto - descuentoAplicado;

            // Actualización de contadores y acumuladores
            cantidadTotalCompras++;
            cantidadTotalProductosRegistrados += cantidadProducto;
            totalAntesDescuentos += subtotalProducto;
            totalDescuentosAplicados += descuentoAplicado;
            totalFinalPagar += totalProducto;

            System.out.print("\n¿Desea registrar otra compra/producto? (si/no): ");
            respuesta = scanner.nextLine().toLowerCase();

        } while (respuesta.equals("si"));

        // Resumen de venta
        System.out.println("\n=================================");
        System.out.println("        RESUMEN DE VENTA        ");
        System.out.println("=================================");
        System.out.println("Cantidad total de compras: " + cantidadTotalCompras);
        System.out.println("Cantidad total de productos registrados: " + cantidadTotalProductosRegistrados);
        System.out.println("Total acumulado antes de descuentos: $" + String.format("%.2f", totalAntesDescuentos));
        System.out.println("Total de descuentos aplicados: $" + String.format("%.2f", totalDescuentosAplicados));
        System.out.println("Total final a pagar: $" + String.format("%.2f", totalFinalPagar));

        scanner.close();
    }
}