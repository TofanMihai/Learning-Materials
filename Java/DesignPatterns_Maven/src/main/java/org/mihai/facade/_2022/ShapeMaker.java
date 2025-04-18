package org.mihai.facade._2022;

public class ShapeMaker {
    private final IShape circle;
    private final IShape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.square = new Square();
    }

    public void drawCircle() {
        this.circle.draw();
    }

    public void drawSquare() {
        this.square.draw();
    }
}
