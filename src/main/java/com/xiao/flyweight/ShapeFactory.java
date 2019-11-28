package com.xiao.flyweight;

import java.util.HashMap;

/**
 * 享元工厂 用来产生享元对象
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();
    //根据不同颜色产生不同的shape对象
    public static Shape createShape(String color) {
        Shape shape = circleMap.get(color);
        if (shape != null) {
            return shape;
        }
        shape = new Circle(color);
        circleMap.put(color, shape);
        return shape;
    }

    public static int getSize() {
        return  circleMap.size();
    }
}
