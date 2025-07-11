package week6.inheritance.exercise.ex1_1;

public class Cylinder extends Circle{
    public double height;

    public Cylinder() {}

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * getRadius() * getHeight() + 2 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "A cylinder with radius: " + getRadius() + ", height: " + getHeight() + " , color: " + getColor()+ " and area: " + getArea();
    }
}
