package Week5.LoopWithJava;

import java.util.Scanner;

public class PrimeNumberLessThan100 {
    public static void main(String[] args) {
        int number = 100;
        for (int i = 2; i < number; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
