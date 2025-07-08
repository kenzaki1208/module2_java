package Week5.ArrayAndFunctionWithJava.PracticalExercises;

import java.util.Scanner;

public class SumOf2Diagonals {
    public static void main(String[] args) {
        int[][] list = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the columns: ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Element row " + (i + 1) + " column " + (j + 1) + ": ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The array dimensional is: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The sum of the 2 diagonals is: " + sumOf2Diagonals(array));
    }

    public static int sumOf2Diagonals(int[][] array) {
        int sum1 = 0;
        int sum2 = 0;
        if (array.length != array[0].length) {
            System.out.println("Invalid array!");
            return 0;
        } else {
            for (int i = 0; i < array.length; i++) {
                sum1 += array[i][i];
                sum2 += array[i][array.length - 1 - i];
            }
        }
        return sum1 + sum2;
    }
}
