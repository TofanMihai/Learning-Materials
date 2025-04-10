package org.mihai.decorator._2022;

public class AbstractDecorator implements Shape {
    public Shape decoratedShape;

    public AbstractDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

}
