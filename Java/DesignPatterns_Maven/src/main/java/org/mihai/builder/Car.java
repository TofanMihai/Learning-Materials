package org.mihai.builder;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Car {
    public String model;
    public Engine engine;
    public ArrayList<Tire> tires;

    @Override
    public String toString() {
        return "Car [model=" + model + ", engine=" + engine + ", tires=" + tires.size() + "]";
    }
}
