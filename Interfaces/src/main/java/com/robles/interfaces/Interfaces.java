package com.robles.interfaces;

/**
 *
 * @author santiagorobles
 */
public class Interfaces {

    public static void main(String[] args) {

        Shape circulo1 = new Circle(10);
        System.out.println(circulo1);
        Shape rectangulo1 = new Rectangulo(5,10);
        System.out.println(rectangulo1);
        Shape triangulo1 = new Triangulo(3,4,5);
        System.out.println(triangulo1);
    }
}
