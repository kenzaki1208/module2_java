package Week5.class_and_object_in_java;

import java.util.Scanner;

public class rectangle {
    double width;
    double height;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        rectangle rect = new rectangle(width, height);
        System.out.println("Your Rectangle \n" + rect.display());
        System.out.println("Perimeter of Rectangle: " + rect.getPerimeter());
        System.out.println("Area of the Rectangle: " + rect.getArea());
    }

    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle { " + "width = " + width + ", height = " + height + "}";
    }
}
