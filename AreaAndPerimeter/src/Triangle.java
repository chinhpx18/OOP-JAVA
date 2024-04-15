
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
class Triangle extends Shape {

    private double a, b, c;

    // Constructor
    public Triangle(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Area
    @Override
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Perimeter
    @Override
    double getPerimeter() {
        return a + b + c;
    }

    // Print Result
    @Override
    void printResult() {
        System.out.println("-----Triangle-----");
        System.out.println("Side A: " + a);
        System.out.println("Side B: " + b);
        System.out.println("Side C: " + c);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
