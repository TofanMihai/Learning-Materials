package factory;

public class DriverClass {

    public static void main(String[] args) {

        BurgerFactory factory = new CheeseBurgerFactory();

        Burger b = factory.createBurger();
        b.prepare();

        factory = new SimpleBurgerFactory();
        Burger simple = factory.createBurger();
        simple.prepare();


        CheeseBurger c1 = new CheeseBurger();
        CheeseBurgerKid c2 = new CheeseBurgerKid();
        c1.prepare();
        c2.prepare();

    }
}
