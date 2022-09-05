/*
Programado por: Gabriel Santiago Robles Robles
 */
package com.robles.graphics;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author santiagorobles
 */
public class Graphics {

    public static void main(String[] args) {

        DrawingPanel window = new DrawingPanel(600, 400); //crea la ventana
        Graphics2D g = window.getGraphics();

        Point2D[] arregloPuntos = new Point2D[100]; //arreglo de 100 puntos

        try {
            Scanner input = new Scanner(new File("points.txt"));

            int tempX = 0, tempY = 0, tempClase = 0;
            for (int i = 0; i < 100; i++) {

                tempX = input.nextInt();
                tempY = input.nextInt();
                tempClase = input.nextInt();

                arregloPuntos[i] = new Point2D(tempX, tempY, tempClase);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        for (int i = 0; i < 100; i++) {
            switch (arregloPuntos[i].darClase()) {
                case 0: //circulo rojo lleno de 20px
                    g.setColor(Color.RED);
                    g.fillOval(arregloPuntos[i].getX(), arregloPuntos[i].getY(),
                            20, 20);
                    break;
                case 1://cuadrado hueco verde de 25px de largo
                    g.setColor(Color.GREEN);
                    g.drawRect(arregloPuntos[i].getX(), arregloPuntos[i].getY(),
                            25, 25);
                    break;
                case 2://vertice superior de triangulo azul equilatero de 30px
                    g.setColor(Color.BLUE);
                    Polygon currTriangle = createTriangle(arregloPuntos[i], 30);
                    g.draw(currTriangle);
                    break;
                default:
                    System.out.println("Check input");
                    break;
            }
        }
    }

    //esta funcion regresa un poligono con los puntos correspondientes a los
    //vertices de un triangulo.
    public static Polygon createTriangle(Point2D topV, int longitud) {
        Polygon triangle = new Polygon();
        double h = Math.pow(longitud, 2) - Math.pow(longitud / 2, 2);
        h = Math.sqrt(h);//Altura del triangulo

        triangle.addPoint(topV.getX(), topV.getY());//vertice superior
        triangle.addPoint(topV.getX() + (longitud / 2), (int) (topV.getY() + h));
        triangle.addPoint(topV.getX() - (longitud / 2), (int) (topV.getY() + h));

        return triangle;
    }
}
