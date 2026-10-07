package auto.learning.javier.lectura.app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppFile {

    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("texto1.txt")) {
            fileWriter.write("Texto FileWriter");
            fileWriter.write(System.lineSeparator());
            fileWriter.write("Segunda linea con FileWriter");
            fileWriter.write(System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }

        try (FileReader fileReader = new FileReader("texto1.txt")) {
            int valor = fileReader.read();

            while (valor != -1) {
                System.out.print((char) valor);
                valor = fileReader.read();
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo (asegúrate de que texto2.txt exista): " + e.getMessage());
        }
    }
}