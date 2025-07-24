package week7.Debug.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter side 1: ");
            int side1 = scanner.nextInt();
            System.out.print("Enter side 2: ");
            int side2 = scanner.nextInt();
            System.out.print("Enter side 3: ");
            int side3 = scanner.nextInt();

            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.display();
        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
}
