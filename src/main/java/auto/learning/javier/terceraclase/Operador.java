package auto.learning.javier.terceraclase;

import java.util.Scanner;

/**
 * @author TheJavier37 (Javier Guarnizo Vega)
 */

public class Operador {

    public static void main(String[] args) {

        //Operadores Arimeticos

        int numero1 = 37;
        int numero2 = 8;

        int suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);

        int resta = numero1 - numero2;
        System.out.println("La resta es: " + resta);

        int multiplicacion = numero1 * numero2;
        System.out.println("La multiplicacion es: " + multiplicacion);

        int division = numero1 / numero2;
        System.out.println("La division es: " + division);

        double precio = 10.5;
        int cantidad = 5;

        double total = precio * cantidad;
        System.out.println("El total es: " + total);

        //Operador modulo
        int modulo = numero1 % numero2;
        System.out.println("El modulo es: " + modulo);

        //Saber si un numero es par o impar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }


        //Operadores de asignacion
        int numero3 = 35;
        numero3 += 5;
        System.out.println("El numero3 es: " + numero3);

        int numero4 = 12;
        numero4 -= 5;
        System.out.println("El numero4 es: " + numero4);

        int numero5 = 18;
        numero5 *= 2;
        System.out.println("El numero5 es: " + numero5);

        int numero6 = 41;
        numero6 /= 2;
        System.out.println("El numero6 es: " + numero6);

        int numero7 = 10;
        numero7 %= 3;
        System.out.println("El numero7 es: " + numero7);

        //Operadores de incremento

        int numero8 = 19;
        numero8++;
        System.out.println("El numero8 es: " + numero8);

        int numero9 = 14;
        numero9--;
        System.out.println("El numero9 es: " + numero9);

        /*
         * Operadores relacionales
         * <
         * >
         * <=
         * >=
         * ==
         * !=
         */

        /*
         * Operadores logicos
         * && (AND)
         * || (OR)
         * ! (NOT)
         */

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();


        boolean edadAdecuada = edad >= 18 && edad <= 60;
        System.out.println("Su edad es apta para el puesto de trabajo: " + edadAdecuada);

        scanner.close();

    }

}
