package week6.inheritance.monday.practice;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color: " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }

//    public static void main(String[] args) {
//        Shape shape1 = new Shape();
//        System.out.println(shape1);
//
//        shape1 = new Shape("red", false);
//        System.out.println(shape1);
//    }
}
