package com.kodilla.testing.shape;

public class Square implements Shape {
    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getName();
    }

    @Override
    public Double getField() {
        return a*a;
    }
}
