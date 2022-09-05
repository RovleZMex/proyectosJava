package com.robles.interfaces;

/**
 *
 * @author santiagorobles
 */
public class Rectangulo implements Shape {

    private double width, length;

    public Rectangulo(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return (width * 2) + (length * 2);
    }

    @Override
    public String toString() {
        return "Rectangulo, ancho: " + width + ", largo: " + length;
    }
}
