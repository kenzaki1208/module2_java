package Week5.ArrayAndFunctionWithJava;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 8, 3, 7, 1, 2};
        int delPosition = 5;

        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != delPosition) {
                newArray[j] = array[i];
                j++;
            }
        }

        System.out.print("Mảng sau khi xóa là: " + Arrays.toString(newArray));
    }
}
