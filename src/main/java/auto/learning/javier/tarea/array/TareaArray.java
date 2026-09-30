package auto.learning.javier.tarea.array;

import java.util.Scanner;

/**
 * @author TheJavier37 (Javier Guarnizo Vega)
 * Desarrollar dos ejercicios breves: el primero utilizando un array unidimensional para
 * almacenar y recorrer información; el segundo utilizando una matriz para almacenar
 * calificaciones de varios estudiantes, recorrer sus filas y columnas mediante ciclos anidados
 * y calcular el promedio correspondiente a cada estudiante
 */

public class TareaArray {

    public static void main(String[] args) {

        //Ejercicio 1: Array unidimensional

        Scanner scanner = new Scanner(System.in);
        int cantidadValores;

        System.out.println("============ EJERCICIO 1: ARRAY UNIDIMENSIONAL 1============");
        do {
            System.out.println("¿Cuántos valores desea ingresar: ");
            cantidadValores = scanner.nextInt();
            scanner.nextLine();

            if(cantidadValores < 10){
                System.out.println("La cantidad de valores debe ser mayor o igual a 10");
            }

        }while(cantidadValores < 10);

        double[] arrayA = new double[cantidadValores];

        for (int i = 0; i < cantidadValores; i++) {
            System.out.print("Ingrese el valor " + (i+1) + ": ");
            arrayA[i] = scanner.nextDouble();
        }

        System.out.println();

        System.out.println("Los valores ingresados son: ");
        for (int i = 0; i < cantidadValores; i++) {
            System.out.println("Valor " + (i+1) + ": " + arrayA[i]);

        }

        double minimo = arrayA[0];
        double maximo = arrayA[0];
        int suma = 0;

        for(int i = 0; i < cantidadValores; i++){
            if(arrayA[i] < minimo){
                minimo = arrayA[i];
            }
            if(arrayA[i] > maximo){
                maximo = arrayA[i];
            }
            suma = (int) (suma + arrayA[i]);
        }

        double promedio = (double) suma / cantidadValores;
        System.out.println("-------------------------------------");
        System.out.println("El valor mínimo es: " + minimo);
        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El promedio es: " + promedio);
        System.out.println("-------------------------------------");

        System.out.println();

        //Ejercicio 2: Matriz de calificaciones
        System.out.println("=========== EJERCICIO 2: MATRIZ DE CALIFICACIONES ==========");

        int numeroEstudiantes = 3;
        int notas = 4;

        double[][] matrizA = new double[numeroEstudiantes][notas];

        System.out.println("Ingrese las notas de " + numeroEstudiantes + " estudiantes (" + notas + " cada uno): ");
        for(int i = 0; i < numeroEstudiantes; i++){
            System.out.println();
            for(int j = 0; j < notas; j++){
                System.out.print("Ingrese la nota " + (j+1) + " del estudiante " + (i+1) + ": ");
                matrizA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println();

        System.out.println("Las notas ingresadas son: ");
        for(int i = 0; i < numeroEstudiantes; i++){
            for(int j = 0; j < notas; j++){
                System.out.print("Estudiante " + (i+1) + " - Nota " + (j+1) + ": " + matrizA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---Promedios por estudiante---");
        for(int i = 0; i < numeroEstudiantes; i++){
            double promedioEstudiante = 0;
            for(int j = 0; j < notas; j++){
                promedioEstudiante += matrizA[i][j];
            }
            promedioEstudiante /= notas;
            System.out.println("Estudiante " + (i+1) + ": " + promedioEstudiante);
        }


    }


}
