package org.mihai.prototype._2024;

public class DriverClass {

    public static void main(String[] args) {

        Wheel wheel = new Wheel("HondaWheel");
//        Car car1 = new Car("Honda", 100, wheel);
//
//        Car car2 = car1.clone();
//
//        car1.getWheel().setManufactures("ToyotaWheel");
//
//        System.out.println("Car1 " + car1);
//        System.out.println("Car2 " + car2);


        SportsCar car3 = new SportsCar("Ferrari", 200, wheel, "Red");


        SportsCar car4 = car3.clone();

        System.out.println("OG   -HASH " + System.identityHashCode(car3.getColor()));
        System.out.println("Clone-HASH " + System.identityHashCode(car4.getColor()));

        System.out.println("Clone " + car4);
    }
}
