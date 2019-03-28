package com.kodilla.testing.shape;

public class Square implements Shape{

    private int a;

    public Square(int width) {
        this.a = width;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
