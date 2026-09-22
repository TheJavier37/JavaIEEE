package auto.learning.javier.clase.segunda;

/**
 * @author TheJavier37
 */


//El nombre de la clase debe ser singular y en mayuscula

public class Variable {

    public static void main(String[] args) {

        int edad = 19;

        System.out.println("Edad: " + edad);

        edad = 21;

        System.out.println("Edad: " + edad);

        int cantidad; //Declarando una variable

        cantidad = 10; //Inicializando una variable

        // byte tiene un rango de -128 a 127
        // short tiene un rango de -32768 a 32767
        // long tiene un rango de -9223372036854775808 a 9223372036854775807
        // double tiene un rango de -1.7976931348623157E308 a 1.7976931348623157E308
        // int tiene un rango de -2147483648 a 2147483647

        byte numeroByte = 127;
        short numeroShort = 32767;
        long numeroLong = 9223372036854775807L;
        double numeroDouble = 1.7976931348623157E308;
        int numeroInt = 2147483647;

        char inicialNombre = 'D';

        System.out.println("Inicial del nombre: " + inicialNombre);

        String nombreUsuario = "TheJavier37";
        String carrera = "Ingenieria en Ciencias de la Computacion";
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Carrera: " + carrera);

        boolean productoDisponible = true;

        final double NUMERO_PI = 3.1416; //Variable constante


    }
}


