package week7.exercise.ex3.main;

import week7.exercise.ex3.codegym.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new ResizeableCircle(5.0);
        shapes[1] = new ResizeableRectangle(4.0, 6.0);
        shapes[2] = new ResizeableSquare(3.0);

        for (Resizeable shape : shapes) {
            String className = shape.getClass().getSimpleName();
            double percent = random.nextInt(100) + 1;
            double areaBefore = 0.0;
            double areaAfter = 0.0;

            if (shape instanceof Circle) {
                areaBefore = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) {
                areaBefore = ((Rectangle) shape).getArea();
            } else if (shape instanceof Square){
                areaBefore = ((Square) shape).getArea();
            }

            System.out.printf("[%s] Before resize: Area = %.2f%n", className, areaBefore);
            shape.resize(percent);

            if (shape instanceof Circle) {
                areaAfter = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) {
                areaAfter = ((Rectangle) shape).getArea();
            } else if (shape instanceof Square){
                areaAfter = ((Square) shape).getArea();
            }

            System.out.printf("[%s] After resize (%.0f%%): Area = %.2f%n", className, percent, areaAfter);
        }
    }
}
