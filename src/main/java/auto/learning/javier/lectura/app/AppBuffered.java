package auto.learning.javier.lectura.app;

import java.io.*;

public class AppBuffered {

    public static void main(String[] args) throws IOException {

        try{

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("texto2.txt"));
            BufferedReader bufferedReader = new BufferedReader(new FileReader("texto2.txt"));

            bufferedWriter.write("Texto BufferedWriter");
            bufferedWriter.newLine();
            bufferedWriter.write("Segunda linea con BufferedWriter");
            bufferedWriter.newLine();
            bufferedWriter.close();

            String linea = bufferedReader.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
