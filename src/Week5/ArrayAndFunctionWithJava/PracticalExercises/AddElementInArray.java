package Week5.ArrayAndFunctionWithJava.PracticalExercises;

import java.util.Arrays;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 8, 3, 7, 1, 2};
        int addPosition = 6;
        int addValue = 15;

        if (addPosition <= -1 || addPosition >= arr.length) {
            System.out.println("The value is out of range!");
        } else {
            int[] newArray = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
            newArray[addPosition] = addValue;

            for (int i = addPosition; i < arr.length; i++) {
                newArray[i + 1] = arr[i];
            }
            System.out.println(Arrays.toString(newArray));
        }
    }
}
