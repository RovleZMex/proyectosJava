/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robles.graphics;

/**
 *
 * @author santiagorobles
 */
public class Point2D {

    public int x;
    public int y;
    public int clase;

    @Override
    public String toString() {
        return "<" + x + ", " + y + "> Clase: " + clase;
    }

    public Point2D(int givenX, int givenY, int givenClase) {
        x = givenX;
        y = givenY;
        clase = givenClase;
    }

    public Point2D() {
        x = 0;
        y = 0;
        clase = 0;
    }

    public int darClase() {
        return clase;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
