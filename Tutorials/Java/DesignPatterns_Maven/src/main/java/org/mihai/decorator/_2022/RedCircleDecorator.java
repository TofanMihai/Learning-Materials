package org.mihai.decorator._2022;

public class RedCircleDecorator extends AbstractDecorator {

    public RedCircleDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        addRedColor();
    }

    private void addRedColor() {
        System.out.println("Color for drawing : Red");
    }

}
