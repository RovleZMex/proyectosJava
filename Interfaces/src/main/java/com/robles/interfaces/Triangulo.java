package com.robles.interfaces;

/**
 *
 * @author santiagorobles
 */
public class Triangulo implements Shape {

    private double a;
    private double b;
    private double c;
// Construye un nuevo triángulo dados sus lados.

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
// Regresa el perímetro de este triángulo.

    @Override
    public double perimeter() {
        return a + b + c;
    }
    
    @Override
    public String toString(){
        return "Triangulo, a: " + a + ", b: " + b + ", c: " + c;
    }
}
