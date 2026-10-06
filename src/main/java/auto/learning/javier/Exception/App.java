package auto.learning.javier.Exception;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try{
            int division = 10 / 0;

            System.out.println("Division: " + division);

        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        ///

        Scanner scanner = new Scanner(System.in);

//        do {
//
//        try {
//            System.out.println("Enter your age: ");
//            int number = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("Your age is: " + number);
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//            scanner.nextLine();
//        }
//
//        } while (true);

        boolean continuar = true;
        do {

        System.out.println("Ingrese un nombre: ");
        String name = scanner.nextLine();

        if (name.isEmpty() || name.matches(".*\\d.*")){
            System.out.println("El nombre no puede estar vacio, ni contener numeros");
        } else {
                System.out.println("Nombre: " + name);
                continuar = false;
            }
        } while (continuar);

        do {

            try {
                System.out.println("Ingrese una nota de (0 a 10): ");
                int note = scanner.nextInt();

                if (note < 0 || note > 10){
                    System.out.println("La nota debe estar entre 0 y 10");
                } else {
                    System.out.println("Nota: " + note);
                    continuar = false;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
                continuar = true;
            }

        } while (continuar);
    }
}
