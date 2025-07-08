package Week5.ArrayAndFunctionWithJava.PracticalExercises;

import java.util.Scanner;

public class Merge2Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array 1: ");
        int size1 = input.nextInt();
        int[] arr1 = new int[size1];

        System.out.print("Enter the size of array 2: ");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("Enter elements of array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr1[i] = input.nextInt();
        }

        System.out.println("Enter elements of array 2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr2[i] = input.nextInt();
        }

        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        System.out.println("The merged array is: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
