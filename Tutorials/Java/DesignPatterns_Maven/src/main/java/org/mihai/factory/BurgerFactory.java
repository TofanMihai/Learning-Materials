package factory;

public abstract class BurgerFactory<T extends Burger> {
    public abstract T createBurger();
}
