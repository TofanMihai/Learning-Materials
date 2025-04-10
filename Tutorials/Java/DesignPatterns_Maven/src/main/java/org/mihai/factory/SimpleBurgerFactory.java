package factory;

public class SimpleBurgerFactory extends BurgerFactory<SimpleBurger> {
    @Override
    public SimpleBurger createBurger() {
        return new SimpleBurger();
    }
}
