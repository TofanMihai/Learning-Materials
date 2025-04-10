package org.mihai.builder;

import java.util.ArrayList;

public class CarBuilder {

    private String model;
    private Engine engine;
    private int tireCount;

    public CarBuilder addModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder addEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder addTires(int tireCount) {
        this.tireCount = tireCount;
        return this;
    }

    public Car build() {
        Car newCar = new Car();

        buildModel(newCar);
        buildEngine(newCar);
        buildTires(newCar);

        return newCar;
    }

    private void buildTires(Car newCar) {
        newCar.tires = new ArrayList<Tire>();

        for (int i = 0; i < this.tireCount; i++)
            newCar.tires.add(new Tire());

    }

    private void buildEngine(Car newCar) {
        newCar.engine = this.engine;
    }

    private void buildModel(Car newCar) {
        newCar.model = this.model;
    }

}
