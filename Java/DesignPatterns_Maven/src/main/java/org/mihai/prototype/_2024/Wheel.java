package org.mihai.prototype._2024;

public class Wheel implements Cloneable {
    private String manufactures;

    public Wheel(String manufactures) {
        this.manufactures = manufactures;
    }

    public String getManufactures() {
        return manufactures;
    }

    public void setManufactures(String manufactures) {
        this.manufactures = manufactures;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "manufactures='" + manufactures + '\'' +
                '}';
    }

    @Override
    protected Wheel clone() throws CloneNotSupportedException {
        return (Wheel) super.clone();
    }
}
