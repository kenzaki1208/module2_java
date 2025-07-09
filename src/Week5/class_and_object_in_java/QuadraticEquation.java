package Week5.class_and_object_in_java;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        QuadraticEquation quad = new QuadraticEquation(a, b, c);
        System.out.println("Delta: " + quad.getDiscriminant());
        if (quad.getDiscriminant() >= 0) {
            System.out.println("Root 1: " + quad.getRoot1());
            System.out.println("Root 2: " + quad.getRoot2());
        } else {
            System.out.println("The equation has no real roots");
        }
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
