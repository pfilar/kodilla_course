package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double b;
    private double h;

    public Triangle(double base, double height) {
        this.b = base;
        this.h = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (b * h) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "b=" + b +
                ", h=" + h +
                '}';
    }
}
