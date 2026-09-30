package auto.learning.javier.novaclase.array;

public class ArrayBidimensional {

    public static void main(String[] args) {

        int[][] matrizA = {{32, 9, 11}, {21, 56, 81}, {12, 64, 89}};

        int[][] matrizB = {{3, 5, 8}, {12,9, 4}, {37, 48, 51}};

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] resultado = new int[matrizA.length][matrizB[0].length];

            for (int i = 0; i < resultado.length; i++) {
                for (int j = 0; j < resultado[i].length; j++) {
                    resultado[i][j] = matrizA[i][j] * matrizB[i][j];
                    System.out.print(resultado[i][j] + " ");
                }
                System.out.println();
            }

    }

}
