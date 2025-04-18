package org.mihai.bridge;

/**
 * Refined Abstraction
 */
public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    /**
     * Combine the functionalities as we want
     *
     * @return
     */
    @Override
    public String draw() {
        return "Circle drawn. " + color.drawColor();
    }
}