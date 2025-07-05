package Week5.LoopWithJava;

import java.util.Scanner;

public class DrawTangle {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice != 4) {
            System.out.println("Menu: ");
            System.out.println("1. Draw a rectangle");
            System.out.println("2. Draw a square triangle");
            System.out.println("3. Draw a isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 1; i <=3; i++) {
                        for (int j = 1; j <= 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("* ");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
