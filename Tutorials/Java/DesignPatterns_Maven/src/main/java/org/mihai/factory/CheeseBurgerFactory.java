package factory;

public class CheeseBurgerFactory extends BurgerFactory<CheeseBurger> {
    @Override
    public CheeseBurger createBurger() {
        return new CheeseBurger();
    }
}
