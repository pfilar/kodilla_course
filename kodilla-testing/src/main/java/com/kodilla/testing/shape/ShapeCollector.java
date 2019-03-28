package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {


    private List<Shape> shapes = new ArrayList<>();  // przechowuje obiekty implementujące interface Shape  / new ArrayList<Shape>()

    public void addFigure(Shape shape) {

    }

    public void removeFigure(Shape shape) {

    }

    public void getFigure(int n) {

    }

    public void showFigures(){

    }

    public int size() {
        return shapes.size();   // System.out.println(); bez wypisywania ma zwrócic do testów
    }

}
