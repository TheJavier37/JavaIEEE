package auto.learning.javier.poo.constructor.entity;

public class Person {

    private String name;
    private char gender;
    private int yearBorn;

    //Sobrecarga de constructores
    public Person() {

    }

    public Person(String name, char gender, int yearBorn) {
        this.name = name;
        this.gender = gender;
        this.yearBorn = yearBorn;
    }


    //Sobrecarga de metodos
    public int sumaSimple (int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int sumaSimple (int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }
}
