package auto.learning.javier.clase.quintaclase;

import java.util.Scanner;

public class Bucle {

    public static void main(String[] args) {

        //for: Cuando conocemos la cantidad de repeticiones
        for (int i = 0; i < 37; i++) {
            System.out.printf("Iteracion: " + i + " ");
        }

        //for anidado

        for (int i = 0; i < 10; i++) { //filas
            for (int j = 0; j < 30; j++) { //columnas
                System.out.print("c:");
            }
            System.out.println();
        }

        //while
        int i = 0;
        while (i < 10) {
            System.out.println("Iteracion: " + i);
            i++;
        }

        //do... while
        int l = 1;
        do{

            System.out.println("Iteración: " + l);

        }while(l < 1);

        //Menu interactivo
        int opcion = 0;
        do{
            System.out.println("=========== MENU DE JAVIBANCO ==========");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Consultando saldo...");
                    break;
                case 2:
                    System.out.println("Retirando dinero...");
                    break;
                case 3:
                    System.out.println("Depositar dinero...");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break; //break clave
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }while(opcion != 4);

    }


}
