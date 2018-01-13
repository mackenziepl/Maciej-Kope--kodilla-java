package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double fieldCircle() {
        return 3.14*(r*r);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(r);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public void getShapeName() {
        System.out.println("Circle");
    }

    @Override
    public double getField() {
        return fieldCircle();
    }

    @Override
    public String toString() {
        return "Circle{" + "r=" + r + '}';
    }
}
