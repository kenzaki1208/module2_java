package week6.inheritance.monday.practice;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return (width + this.length) * 2;
    }

    @Override
    public String toString() {
        return "A rectangle with width: " + getWidth() + " and length: " + getLength() + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        rectangle1 = new Rectangle(2.3, 5.8);
        System.out.println(rectangle1);

        rectangle1 = new Rectangle(2.3, 5.8, "orange", false);
        System.out.println(rectangle1);
    }
}
