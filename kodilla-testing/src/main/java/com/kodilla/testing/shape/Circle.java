package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double r;
    // private double Pi = 3.14;

    public Circle(double r) {   // double Pi
        this.r = r;
        //    this.Pi = Pi;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
