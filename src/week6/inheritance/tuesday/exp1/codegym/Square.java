package week6.inheritance.tuesday.exp1.codegym;

import week6.inheritance.tuesday.exp1.main.Colorable;

public class Square extends Shape implements Colorable {
    private double side = 1.0;

    public Square() {}

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howtoColor() {
        System.out.println("Color all four sides.");
    }
}
