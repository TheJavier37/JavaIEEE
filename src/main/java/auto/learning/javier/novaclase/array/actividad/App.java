package auto.learning.javier.novaclase.array.actividad;

import java.util.Scanner;

/**
 * @author thejavier37 (Javier Guarnizo Vega)
 * Ejercicio extraclase 2
 * Desarrollar un programa que permita administrar el inventario
 * de una pequeña tienda. El sistema almacenará los productos en
 * un array de tamaño fijo (por ejemplo, capacidad para 10 productos,
 * pueden agregarlos por consola o directamente ) y
 * utilizará un contador para llevar el control exacto
 * de cuántos elementos se han registrado.
 */

public class App {

    public static void main(String[] args) {

        int capacidadInventario = 15;
        Producto[] inventario = new Producto[capacidadInventario];

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Sistema de Registro de Inventario ---");
        System.out.println("-Ingrese los productos para su inventario-");

        for(int i = 0; i < capacidadInventario; i++){

            System.out.println("Registro de producto " + (i + 1));

            System.out.println("Ingrese el código del producto: ");
            String codigo = scanner.nextLine();

            System.out.println("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Ingrese la cantidad que dispone del producto: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();
            inventario[i] = new Producto(codigo, nombre, precio, cantidad);

            System.out.println("Si desea salir ingrese 'salir', " +
                    "de lo contrario presione enter");
            if(scanner.nextLine().equalsIgnoreCase("salir")){
                break;
            }
        }

        System.out.println("Inventario completo:");
        for(int i = 0; i < capacidadInventario; i++){
            if(inventario[i] == null){
                break;
            }
            System.out.println(inventario[i]);
        }

    }
}
