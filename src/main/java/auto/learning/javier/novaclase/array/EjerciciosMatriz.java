package auto.learning.javier.novaclase.array;

/**
 * @author TheJavier37
 * Ejercicio 1:
 * Escriba un programa que declare una matriz de 2x3 con valores fijos.
 * Luego crea un algoritmo que genere e imprima la matriz transpuesta.
 *
 */

public class EjerciciosMatriz {

    public static void main(String[] args) {

        //Ejercicio 1 Desarollo:

        int[][] matriz = {
                {37, 48, 51},
                {22, 33, 79}
        };

        System.out.println("Matriz original:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Matriz transpuesta:");

        int[][] matrizTranspuesta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }

    }
}
