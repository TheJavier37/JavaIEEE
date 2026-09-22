package auto.learning.javier.clase.cuarta;

import java.util.Scanner;

public class Condicional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        System.out.println("Ingrese su nota: ");
        double nota = scanner.nextDouble();
        scanner.nextLine();

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota > 6){
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        System.out.println("ACCESO AL SISTEMA");
        System.out.println("Ingrese su usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String password = scanner.nextLine();

        if(usuario.equals("admin") && password.equals("admin1234")) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
    }

}
