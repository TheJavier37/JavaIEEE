package auto.learning.javier.poo.mecanica.utilidades;

import auto.learning.javier.poo.mecanica.entidad.Car;

public class App {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Corolla", "Blue", 2022, 4);

        car1.turnOnMotor(true);
        car1.turnOffMotor(false);

    }
}
