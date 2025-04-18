package abstractFactory._2024;

public class StoneFactory extends RawProductFactory<Stone> {
    @Override
    public Stone buildRawProduct() {
        return new Stone();
    }
}
