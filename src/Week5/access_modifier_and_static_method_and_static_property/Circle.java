package Week5.access_modifier_and_static_method_and_static_property;

public class Circle {
    private double radius;
    private String color;
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

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(10, "red");
        System.out.println("Radius of circle1: " + circle1.getRadius() + ", Color of circle1: " + circle1.getColor());
        System.out.println("Area of circle1: " + circle1.getArea());

        Circle circle2 = new Circle(20, "blue");
        System.out.println("Radius of circle2: " + circle2.getRadius() + ", Color of circle2: " + circle2.getColor());
        System.out.println("Area of circle2: " + circle2.getArea());

        Circle circle3 = new Circle(30, "green");
        System.out.println("Radius of circle3: " + circle3.getRadius() + ", Color of circle3: " + circle3.getColor());
        System.out.println("Area of circle3: " + circle3.getArea());
    }
}
