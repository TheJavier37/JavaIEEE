package auto.learning.javier.poo.constructor.entity;

public class Mango extends Fruit {

    public Mango(String name, double weight, String color, TypeFlavor flavor) {
        super(name, weight, color, flavor);
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Flavor: " + flavor);
    }

}
