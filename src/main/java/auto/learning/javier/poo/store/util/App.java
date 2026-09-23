package auto.learning.javier.poo.store.util;

import auto.learning.javier.poo.store.entity.Product;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        System.out.println("MENU");
        System.out.println("1. Agregar producto");
        System.out.println("2. Calcular el total");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opcion: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nombre del producto: ");
                String name = scanner.next();
                System.out.println("Ingrese el precio del producto: ");
                double price = scanner.nextDouble();
                System.out.println("Ingrese la cantidad del producto: ");
                int quantity = scanner.nextInt();
                Product product = new Product(name, price, quantity);
                product.calculatePrice(price, quantity);
                break;
            case 2:
                //TODO
                break;
            case 3:
                break;

        }

    }
}
