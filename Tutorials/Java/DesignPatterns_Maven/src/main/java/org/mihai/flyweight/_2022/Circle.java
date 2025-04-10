package org.mihai.flyweight._2022;


import lombok.Setter;

@Setter
public class Circle implements IShape {
    private String color;
    private int x;
    private int y;
    private int radius;


    public Circle(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }

}
