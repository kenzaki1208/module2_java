package week6.inheritance.monday.exercise.ex1_1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {}

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A circle with radius: " + getRadius() + " and color: " + getColor();
    }
}
