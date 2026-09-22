package auto.learning.javier.clase.segunda;

import java.util.Scanner;

public class ScannerDato {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese su estatura: ");
        double estatura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese su genero ");
        String genero = scanner.nextLine();

        System.out.println("DATOS INGRESADOS");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Genero: " + genero);

        scanner.close();

    }


}
