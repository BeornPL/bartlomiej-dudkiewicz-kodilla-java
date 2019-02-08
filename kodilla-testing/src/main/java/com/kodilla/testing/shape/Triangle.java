package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double a;

    public Triangle(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getName();
    }

    @Override
    public Double getField() {
        //assuming equilateral triangle
        return a*a*Math.sqrt(3.0)*0.25;
    }
}
