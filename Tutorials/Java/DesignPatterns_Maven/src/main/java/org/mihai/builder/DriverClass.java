package org.mihai.builder;

public class DriverClass {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.addModel("Test Car")
                .addEngine(new Engine())
                .addTires(5);


        Car car1 = builder.build();
        System.out.println(car1);

        builder.addModel("BMW")
                .addEngine(new SuperEngine())
                .addTires(10);

        Car car2 = builder.build();

        System.out.println(car2);


    }
}
