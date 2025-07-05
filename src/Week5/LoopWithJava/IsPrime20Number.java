package Week5.LoopWithJava;

import java.util.Scanner;

public class IsPrime20Number {
    public static void main(String[] args) {
        int count = 0;
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you want to check: ");
        number = input.nextInt();

        if (number > 20) {
            System.out.println("The number cannot greater than 20 !");
        } else {
            int N = 2;

            System.out.print("The first integers is: ");
            while (count < number) {
                boolean isPrime = true;
                if (N < 2) {
                    isPrime = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(N); i++) {
                        if (N % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    System.out.print(N + " ");
                    count++;
                }

                N++;
            }
        }
    }
}
