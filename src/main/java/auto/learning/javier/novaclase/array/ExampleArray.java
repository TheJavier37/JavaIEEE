package auto.learning.javier.novaclase.array;

public class ExampleArray {

    public static void main(String[] args) {

        String[] names = {"Javier", "Quanxi", "Fujino"};
        double[] grades = {9.5, 8.7, 7.9};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Nombre: " + names[i] + ", Nota: " + grades[i]);
        }

    }

}
