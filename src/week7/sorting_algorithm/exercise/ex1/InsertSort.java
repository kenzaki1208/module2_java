package week7.sorting_algorithm.exercise.ex1;

public class InsertSort {

    public static void insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;

            System.out.print("Bước " + i + ": ");
            for (int v : list) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
