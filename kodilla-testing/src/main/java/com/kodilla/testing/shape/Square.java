package com.kodilla.testing.shape;

public class Square implements Shape{

    private int a;

    public Square(int width) {
        this.a = width;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
