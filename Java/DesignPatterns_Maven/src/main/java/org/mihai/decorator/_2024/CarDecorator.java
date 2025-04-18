package org.mihai.decorator._2024;

public class CarDecorator implements Car {
    protected final Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
