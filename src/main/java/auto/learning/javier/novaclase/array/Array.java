package auto.learning.javier.novaclase.array;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) throws IOException {

        char[] charactersArray = new char[9];

        int[] numbersArray = {37, 48, 32, 84, 51};
        System.out.println("Array: " + numbersArray);

        System.out.println("Array length: " + numbersArray.length);

        System.out.println("First element: " + numbersArray[0]);

        System.out.println("Last element: " + numbersArray[numbersArray.length - 1]);

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println("Element " + i + ": " + numbersArray[i]);
        }

        for (int i = 0; i < charactersArray.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un caracter para la posicion " + i + ": ");
            charactersArray[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < charactersArray.length; i++) {
            System.out.println("Element " + i + ": " + charactersArray[i]);
        }

        System.out.println(charactersArray[0]);

        //suma
        int sum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            sum += numbersArray[i];
        }
        System.out.println("Suma de los elementos del array: " + sum);

        //promedio
        double average = (double) sum / numbersArray.length;
        System.out.println("Promedio de los elementos del array: " + average);

        //Suma de Arrays

        int[] numbersArray2 = {1, 2, 3, 4, 5};
        int[] resultArray = new int[numbersArray.length];

        for (int i = 0; i < numbersArray.length; i++) {
            resultArray[i] = numbersArray[i] + numbersArray2[i];
        }

        System.out.println("Array resultante: " + Arrays.toString(resultArray));
    }

}
