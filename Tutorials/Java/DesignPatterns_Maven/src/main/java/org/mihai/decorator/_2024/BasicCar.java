package org.mihai.decorator._2024;

/**
 * The base class which can be used on its own
 */
public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling a basic car");
    }
}
