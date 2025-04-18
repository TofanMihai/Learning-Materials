package org.mihai.flyweight._2022;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<String, Circle>();

    public static IShape createCircle(String color) {
        Circle circle = circleMap.get(color);
        if (circle != null)
            System.out.println("Fetching " + circle.toString());
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
