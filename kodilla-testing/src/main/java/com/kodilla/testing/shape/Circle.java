package com.kodilla.testing.shape;

public class Circle implements Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getName();
    }

    @Override
    public Double getField() {
        return Math.PI*r*r;
    }
}
