package auto.learning.javier.poo.constructor.util;

import auto.learning.javier.poo.constructor.entity.Apple;
import auto.learning.javier.poo.constructor.entity.Fruit;
import auto.learning.javier.poo.constructor.entity.Person;
import auto.learning.javier.poo.constructor.entity.TypeFlavor;

public class App {

    public static void main(String[] args) {

        Person persona1 = new Person();
        persona1.setName("Javier");
        persona1.setGender('M');
        persona1.setYearBorn(2007);

        Person persona2 = new Person("Quanxi", 'F', 1995);

        Person persona3 = new Person("Eliot");

        Apple manzana = new Apple("Manzana", 0.2, "Red", TypeFlavor.SWEET, "Fuji");
        manzana.makePie();
        manzana.showInfo();
        manzana.getAppleType();

        persona1.setYearBorn(1925);

    }
}
