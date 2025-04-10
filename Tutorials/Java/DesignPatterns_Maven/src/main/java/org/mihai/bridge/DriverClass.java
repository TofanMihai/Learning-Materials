package org.mihai.bridge;

public class DriverClass {
    public static void main(String[] args) {
        Shape circle = new Circle(new Blue());

        System.out.println(circle.draw());
    }

}
