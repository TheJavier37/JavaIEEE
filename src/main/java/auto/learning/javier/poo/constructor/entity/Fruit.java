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

    public abstract void showInfo();

    public void peel() {
        System.out.println("Peeling the " + name);
    }

}
