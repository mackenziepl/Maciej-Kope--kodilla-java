package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    public double fieldTrianle() {
        return 0.5*a*h;
    }

    @Override
    public void getShapeName() {
        System.out.println("Triangle");
    }

    @Override
    public double getField() {
        return fieldTrianle();
    }

    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", h=" + h + '}';
    }
}
