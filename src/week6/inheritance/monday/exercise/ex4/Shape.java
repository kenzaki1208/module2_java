package week6.inheritance.monday.exercise.ex4;

public class Shape {
    private String color;

    public Shape() {}

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "A shape with color: " + getColor()
                + " and area: " + getArea()
                + " and perimeter: " + getPerimeter();
    }
}
