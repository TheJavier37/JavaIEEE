package auto.learning.javier.torneo.app;

import auto.learning.javier.torneo.entity.Torneo;
import java.util.Scanner;

/**
 * @author TheJavier37 (Javier Guarnizo Vega)
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Torneo torneo = new Torneo();
        int opcion = 0;

        do {
            System.out.println("\n=== MENÚ DEL TORNEO ===");
            System.out.println("1. Simular una ronda");
            System.out.println("2. Buscar jugador");
            System.out.println("3. Modificar puntaje manualmente");
            System.out.println("4. Mostrar ranking");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del jugador ganador: ");
                    String nombreVictoria = scanner.nextLine();
                    if (torneo.simularRonda(nombreVictoria)) {
                        System.out.println("¡Puntos y partida registrados con éxito!");
                    } else {
                        System.out.println("Jugador no encontrado.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del jugador a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    torneo.buscarJugador(nombreBuscar);
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del jugador: ");
                    String nombreModificar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo puntaje: ");
                    if (scanner.hasNextInt()) {
                        int nuevoPuntaje = scanner.nextInt();
                        scanner.nextLine();
                        if (torneo.modificarPuntaje(nombreModificar, nuevoPuntaje)) {
                            System.out.println("Puntaje actualizado correctamente.");
                        } else {
                            System.out.println("Jugador no encontrado.");
                        }
                    } else {
                        System.out.println("El puntaje debe ser un número entero.");
                        scanner.nextLine();
                    }
                    break;

                case 4:
                    torneo.mostrarRanking();
                    break;

                case 5:
                    System.out.println("¡Saliendo del programa!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }
}
