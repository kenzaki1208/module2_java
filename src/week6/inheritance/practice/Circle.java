package week6.inheritance.practice;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A circle with radius: " + getRadius() + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        circle1 = new Circle(3.5);
        System.out.println(circle1);

        circle1 = new Circle(3.5, "indigo", false);
        System.out.println(circle1);
    }
}
