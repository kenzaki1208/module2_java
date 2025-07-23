package week7.sorting_algorithm.practice.p2;

public class BubbleSortByStep {
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;

        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("Swap " + list[j] + " with " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }

            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }

            System.out.println("List after the " + i + " sort: ");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + " ");
            }
            System.out.println();
        }
    }
}
