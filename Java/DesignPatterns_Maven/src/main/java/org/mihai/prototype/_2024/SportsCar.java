package org.mihai.prototype._2024;

// Automatically implements the cloneable interface since the superclass implements it. I think
//

public class SportsCar extends Car implements Cloneable {
    private String color;

    public SportsCar(String brand, Integer topSpeed, Wheel wheel, String color) {
        super(brand, topSpeed, wheel);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return super.toString() + " color : " + this.color;

    }


    @Override
    public SportsCar clone() {
        SportsCar clone = (SportsCar) super.clone();
        clone.setColor(this.color);
        // TODO: copy mutable state here, so the clone can't change the internals of the original
        return clone;
    }
}
