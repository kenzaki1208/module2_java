package week6.inheritance.exercise.ex4;

public class Shape extends Triangle{
    private String color;

    public Shape() {}

    public Shape(String color, double side1, double side2, double side3) {
        super(side1, side2, side3);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A shape with color: "
                + getColor()
                + " and sides: "
                + getSide1() + ", "
                + getSide2() + ", "
                + getSide3();
    }
}
