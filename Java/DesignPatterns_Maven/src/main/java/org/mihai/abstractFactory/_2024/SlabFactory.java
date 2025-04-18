package abstractFactory._2024;

public class SlabFactory extends RawProductFactory<Slab> {
    @Override
    public Slab buildRawProduct() {
        return new Slab();
    }
}
