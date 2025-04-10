package org.mihai.decorator._2024;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding the features of a luxury car");
    }
}
