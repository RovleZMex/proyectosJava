/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robles.interfaces;

/**
 *
 * @author santiagorobles
 */
public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {//returns perimeter of the circle

        return 2.0 * radius * Math.PI;
    }

    @Override
    public double area() { //returns the area of the circle
        return Math.PI * radius * radius;
    }
   
    @Override
    public String toString(){
        return "Circulo, radio: " + radius;
    }
}
