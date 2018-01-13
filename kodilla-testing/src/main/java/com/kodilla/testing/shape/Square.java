package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }
    public double fieldSquare() {
        return a*a;
    }

    @Override
    public void getShapeName() {
        System.out.println("Square");
    }

    @Override
    public double getField() {
        return fieldSquare();
    }

    @Override
    public String toString() {
        return "Square{" + "a=" + a + '}';
    }
}
