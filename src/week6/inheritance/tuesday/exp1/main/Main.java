package week6.inheritance.tuesday.exp1.main;

import week6.inheritance.tuesday.exp1.codegym.Circle;
import week6.inheritance.tuesday.exp1.codegym.Rectangle;
import week6.inheritance.tuesday.exp1.codegym.Shape;
import week6.inheritance.tuesday.exp1.codegym.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(5);
        shapes[1] = new Circle(7);
        shapes[2] = new Rectangle(7, 9);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Square area is: " + shape.getArea());

            if (shape instanceof Colorable) {
                ((Colorable) shape).howtoColor();
            }
            System.out.println();
        }
    }
}
