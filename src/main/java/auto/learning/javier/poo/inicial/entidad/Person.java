package auto.learning.javier.poo.inicial.entidad;

public class Person {

    //Atributos

    private String name;
    private int edad;

    public Person(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public void saludo() {
        System.out.println("Hola, mi nombre es " + name + " y tengo " + edad + " años.");
    }

    public void saludoPersona(Person persona) {
        System.out.println("Hola " + persona.getName() + ", un gusto conocerte");

    }

    public void sumaSimple (int numero1, int numero2) {
        int resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    //Getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
