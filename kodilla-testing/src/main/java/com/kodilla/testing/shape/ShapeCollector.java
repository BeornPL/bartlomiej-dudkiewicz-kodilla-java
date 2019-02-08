package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public boolean showFigures() {
        boolean result = false;
        if (!shapes.isEmpty()) {
            System.out.println(shapes.toString());
            result = true;
        }
        return result;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
