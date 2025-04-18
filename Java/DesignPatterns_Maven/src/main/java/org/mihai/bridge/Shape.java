package org.mihai.bridge;

/**
 * Our abstraction
 */
public abstract class Shape {
    public Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();

}
