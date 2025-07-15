package week6.inheritance.monday.exercise.ex4;

public class Triangle extends Shape {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {}

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getHalfPerimeter() {
        return (side1 + side2 + side3) / 2;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getHalfPerimeter();
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {
        return "A triangle with sides: side1 = " +
                getSide1() + ", " +
                "side2 = " + getSide2() + ", " +
                "side3 = " + getSide3() + ", which has a perimeter of "
                + getPerimeter() + " and an area of "
                + getArea();
    }

}
