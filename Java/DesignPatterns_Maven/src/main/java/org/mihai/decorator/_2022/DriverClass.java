package org.mihai.decorator._2022;

public class DriverClass {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedCircleDecorator(new Circle());

        circle.draw();
        System.out.println("---");
        redCircle.draw();
    }
}
