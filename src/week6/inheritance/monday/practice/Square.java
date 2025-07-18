package week6.inheritance.monday.practice;

public class Square extends Rectangle{
    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A square with side: " + getSide() + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1);

        square1 = new Square(2.3);
        System.out.println(square1);

        square1 = new Square(5.8, "yellow", true);
        System.out.println(square1);
    }
}
