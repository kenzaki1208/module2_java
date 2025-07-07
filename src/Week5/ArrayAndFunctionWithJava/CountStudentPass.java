package Week5.ArrayAndFunctionWithJava;

import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the size of array: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("The size must be less than 30");
            }
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
            System.out.printf("%-3d", array[j]);
            if (array[j] >= 5 && array[j] <= 10 ) {
                count++;
            }
        }
        System.out.println("\nThe number of student passing the exam is: " + count);
    }
}
