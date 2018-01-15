package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figure = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        figure.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(figure.contains(shape)) {
            figure.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n) {
        Shape theFigure = null;
        if(n>=0 && n<figure.size()) {
            theFigure = figure.get(n);
        }
        return theFigure;
    }
    public String showFigures() {
        String wynik = "";
        for(Shape show :figure) {
            wynik += show.getShapeName();
        }
        return wynik;
    }
    public Integer getFigureSize () {
        int size;
        size = figure.size();
        return size;
    }
}
