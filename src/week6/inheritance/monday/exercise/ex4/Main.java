package week6.inheritance.monday.exercise.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter side1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side3: ");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        System.out.println(triangle.toString());
        System.out.println("Màu sắc của tam giác: " + triangle.getColor());
        System.out.println("Diện tích của tam giác: " + triangle.getArea());
        System.out.println("Chu vi của tam giác: " + triangle.getPerimeter());
    }
}
