package Week5.ArrayAndFunctionWithJava;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the size of array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("The size must be less than 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
            System.out.printf("%-3d", array[j]);
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("\n" + "The largest property value in the list is " + max + ", at position " + index);
    }
}
