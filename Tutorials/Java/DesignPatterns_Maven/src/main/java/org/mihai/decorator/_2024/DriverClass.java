package org.mihai.decorator._2024;

public class DriverClass {

    public static void main(String[] args) {
        Car car1 = new LuxuryCar(new BasicCar());
        Car car2 = new SportsCar(new LuxuryCar(new BasicCar()));

        Car car3 = new CarDecorator(new BasicCar());
        car1.assemble();
        System.out.println("----");

        car2.assemble();
        System.out.println("----");

        car3.assemble();
    }
}
