package auto.learning.javier.poo.inicial.utilidades;

import auto.learning.javier.poo.inicial.entidad.Calculator;
import auto.learning.javier.poo.inicial.entidad.Car;
import auto.learning.javier.poo.inicial.entidad.Person;

public class App {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Corolla", "Blue", 2022, 4);

        car1.turnOnMotor(true);
        car1.turnOffMotor(false);

        //---//

        Person person1 = new Person("Javier", 19);
        Person person2 = new Person("Juan", 20);
        person1.saludo();
        person1.saludoPersona(person2);
        person1.sumaSimple(5, 3);

        Calculator calculator = new Calculator();
        calculator.sumaSimple(5, 3);
        calculator.restaSimple(5, 3);
        calculator.multiplicacionSimple(5, 3);
        calculator.divisionSimple(5, 3);

        System.out.println("El resultado de la suma es: " + calculator.sumaSimple(5, 3));
        System.out.println("El resultado de la resta es: " + calculator.restaSimple(5, 3));
        System.out.println("El resultado de la multiplicacion es: " + calculator.multiplicacionSimple(5, 3));
        System.out.println("El resultado de la division es: " + calculator.divisionSimple(5, 3));
    }
}
