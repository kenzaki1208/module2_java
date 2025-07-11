package week6.inheritance.exercise.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side3: ");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println(triangle);

        Shape shape = new Shape("red", side1, side2, side3);
        System.out.println(shape);
    }
}
