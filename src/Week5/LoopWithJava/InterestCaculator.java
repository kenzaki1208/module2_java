package Week5.LoopWithJava;

import java.util.Scanner;

public class InterestCaculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        money = scanner.nextDouble();

        System.out.print("Enter number of months: ");
        month = scanner.nextInt();

        System.out.print("Enter interest rate in percentage: ");
        interestRate = scanner.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
