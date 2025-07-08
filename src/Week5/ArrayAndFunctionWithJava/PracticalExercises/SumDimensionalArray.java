package Week5.ArrayAndFunctionWithJava.PracticalExercises;

import java.util.Scanner;

public class SumDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] list = {
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10},
                {11, 13, 15, 17, 19},
                {20, 22, 24, 26, 28}
        };
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Element row " + (i + 1) + " column " + (j + 1) + ": ");
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("The array : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The array is: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the column number 1: ");
        int col1 = input.nextInt();

        System.out.print("Enter the column number 2: ");
        int col2 = input.nextInt();

        int sum = sumDimensionalArray(array, col1, col2);
        System.out.println("Sum of the columns element in array is: " + sum);
    }

    public static int sumDimensionalArray(int[][] array, int col1, int col2) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][col1];
            sum += array[i][col2];
        }
        return sum;
    }
}
