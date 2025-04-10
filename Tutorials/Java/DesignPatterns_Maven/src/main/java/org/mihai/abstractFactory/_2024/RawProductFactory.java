package abstractFactory._2024;

public abstract class RawProductFactory<R extends RawProduct> {
    public abstract R buildRawProduct();
}
