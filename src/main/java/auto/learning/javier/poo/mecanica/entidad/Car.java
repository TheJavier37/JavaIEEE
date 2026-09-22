package auto.learning.javier.poo.mecanica.entidad;

public class Car {

    //Atributos

    private String branch;
    private String model;
    private String color;
    private int year;
    private int doorsNumber;
    private boolean motorOn;

    //Constructor

    public Car(String branch, String model, String color, int year, int doorsNumber) {
        this.branch = branch;
        this.model = model;
        this.color = color;
        this.year = year;
        this.doorsNumber = doorsNumber;
        this.motorOn = false;
    }

    public void turnOnMotor(boolean motorOn) {
        if(!this.motorOn) {
            this.motorOn = true;
            System.out.println("El motor esta encendido");
        }
    }

    public void turnOffMotor(boolean motorOn) {
        if(this.motorOn) {
            this.motorOn = false;
            System.out.println("El motor esta apagado");
        }
    }

    public void printCarInfo() {
        System.out.println("Branch: " + branch);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Doors Number: " + doorsNumber);
    }


}
