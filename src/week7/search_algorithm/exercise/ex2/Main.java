package week7.search_algorithm.exercise.ex2;

import java.util.Arrays;
import java.util.Scanner;

import static week7.search_algorithm.exercise.ex2.RecursiveBinarySearch.binarySearch;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử: ");
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

        System.out.print("Nhập giá trị cần tìm: ");
        int target = scanner.nextInt();

        int result = binarySearch(array, 0, array.length - 1, target);

        if (result == -1) {
            System.out.println("Không tìm thấy " + target + " trong mảng !");
        } else {
            System.out.println("Tìm thấy " + target + " trong mảng tại vị trí: " + result + " !");
        }
    }
}
