package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> figure = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public ArrayList<Shape> addFigure(Shape shape) {
        figure.add(shape);
        return figure;
    }
    public ArrayList<Shape> removeFigure(Shape shape) {
        figure.remove(shape);
        return figure;
    }
    public ArrayList<Shape> getFigure(int n) {
        figure.get(n);
        return figure;
    }
    public void showFigures() {
        //return toString();
    }



}
