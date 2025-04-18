package org.mihai.prototype._2024;

public class Car implements Cloneable {

    private String brand;
    private Integer topSpeed;
    private Wheel wheel;

    public Car(String brand, Integer topSpeed, Wheel wheel) {
        this.brand = brand;
        this.topSpeed = topSpeed;
        this.wheel = wheel;
    }

    @Override
    public Car clone() {
        Car clone = null;
        try {
            clone = (Car) super.clone();
            clone.setWheel(this.wheel.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", topSpeed=" + topSpeed +
                ", wheel=" + wheel +
                '}';
    }
}
