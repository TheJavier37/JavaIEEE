package auto.learning.javier.poo.constructor.entity;

public abstract class Fruit {

    String name;
    boolean haveSeed;
    double weight;
    String color;
    TypeFlavor flavor;


    public Fruit(String name, double weight, String color, TypeFlavor flavor) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.flavor = flavor;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Flavor: " + flavor);
    }

    public void peel() {
        System.out.println("Peeling the " + name);
    }

}
