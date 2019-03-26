package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();  // przechowuje obiekty implementujące interface Shape

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }
    public void removeFigure(Shape shape) {

    }
    public void getFigure(int n) {

    }
    public void showFigures(){
        System.out.println(shapes);
    }

}
