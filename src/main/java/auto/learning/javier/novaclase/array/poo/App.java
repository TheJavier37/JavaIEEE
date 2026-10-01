package auto.learning.javier.novaclase.array.poo;

public class App {

    public static void main(String[] args) {

        Estudiante[] estudiantes = new Estudiante[3];

        estudiantes[0] = new Estudiante("Quanxi", 20);
        estudiantes[1] = new Estudiante("Eliot", 22);
        estudiantes[2] = new Estudiante("Kiara", 21);

        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                System.out.println(estudiantes[i].toString());
            }
        }

//        int posicionDisponible = -1;
//
//        for (int i = 0; i < estudiantes.length; i++) {
//            if (estudiantes[i] == null) {
//                posicionDisponible = i;
//                break;
//            }
//        }
//
//        if (posicionDisponible != -1) {
//            estudiantes[posicionDisponible] = new Estudiante("Luis", 23);
//        }
//
//        System.out.println("La posición disponible es: " + posicionDisponible);
//        estudiantes[posicionDisponible] = new Estudiante("Luis", 23);

        System.out.println();

        Estudiante[][] estudiantesMatriz = new Estudiante[3][3];

        estudiantesMatriz[0][0] = new Estudiante("Quanxi", 20);
        estudiantesMatriz[0][1] = new Estudiante("Eliot", 22);
        estudiantesMatriz[0][2] = new Estudiante("Kiara", 21);
        estudiantesMatriz[1][0] = new Estudiante("Cosmos", 19);
        estudiantesMatriz[1][1] = new Estudiante("Kelly", 26);
        estudiantesMatriz[1][2] = new Estudiante("Craig", 18);
        estudiantesMatriz[2][0] = new Estudiante("Javier", 19);
        estudiantesMatriz[2][1] = new Estudiante("Daya", 18);
        estudiantesMatriz[2][2] = new Estudiante("Dario", 19);

        for (int i = 0; i < estudiantesMatriz.length; i++) {
            for (int j = 0; j < estudiantesMatriz[i].length; j++) {
                System.out.println(estudiantesMatriz[i][j].toString());
            }
        }

    }

}
