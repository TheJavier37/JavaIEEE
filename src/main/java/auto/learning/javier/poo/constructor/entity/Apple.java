package auto.learning.javier.poo.constructor.entity;

public class Apple extends Fruit{

    String typeApple;

    public Apple(String name, double weight, String color, TypeFlavor flavor, String typeApple) {
        super(name, weight, color, flavor);
        this.typeApple = typeApple;
    }

    public void makePie() {
        System.out.println("Making a pie with " + typeApple + " apples");
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Flavor: " + flavor);
        System.out.println("Type Apple: " + typeApple);
    }

    public void peel() {
        System.out.println("Peeling the " + name + "with simple knife");
    }

    public void getAppleType() {
        System.out.println("The type of apple is: " + typeApple);
    }

    public void setTipoManzana(String typeApple) {
        this.typeApple = typeApple;
    }

    public String getTypeApple() {
        return typeApple;
    }

    public void setTypeApple(String typeApple) {
        this.typeApple = typeApple;
    }
}
