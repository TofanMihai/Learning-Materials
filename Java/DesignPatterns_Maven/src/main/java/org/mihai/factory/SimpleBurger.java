package factory;

public class SimpleBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing a simple burger");
    }
}
