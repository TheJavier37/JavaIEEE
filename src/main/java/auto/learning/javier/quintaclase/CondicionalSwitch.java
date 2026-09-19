package auto.learning.javier.quintaclase;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CondicionalSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana en numeros (1-7): ");
        int dia = scanner.nextInt();

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }

        //Simulacion de sistema de banco
        System.out.println("=========== MENU DE JAVIBANCO ==========");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Depositar dinero");
        System.out.println("4. Salir");

        System.out.println("Ingrese una opcion: ");
        int opcion = scanner.nextInt();

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
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }

    }


}
