package Week5.IntroduceJava;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Year;
        System.out.println("Enter the year: ");
        Year = scanner.nextInt();
        boolean isLeapYear = false;

//        if (Year % 4 == 0) {
//            if (Year % 100 == 0) {
//                if (Year % 400 == 0) {
//                    System.out.printf("%d is a leap year", Year);
//                } else {
//                    System.out.printf("%d is not a leap year", Year);
//                }
//            } else {
//                System.out.printf("%d is a leap year", Year);
//            }
//        } else {
//            System.out.printf("%d is not a leap year", Year);
//        }

        boolean isDivisibleBy4 = Year % 4 == 0;

        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = Year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = Year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.printf("%d is a leap year", Year);
        } else {
            System.out.printf("%d is not a leap year", Year);
        }
    }
}
