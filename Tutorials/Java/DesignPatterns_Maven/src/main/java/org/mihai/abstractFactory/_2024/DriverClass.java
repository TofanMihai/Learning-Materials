package abstractFactory._2024;


public class DriverClass {

    public static void main(String[] args) {
        RawProductFactory rawProductFactory = new SlabFactory();

        RawProduct rawProduct = rawProductFactory.buildRawProduct();
        rawProduct.print();

        rawProductFactory = new StoneFactory();

        RawProduct rawProduct1 = rawProductFactory.buildRawProduct();

        rawProduct1.print();


    }
}
