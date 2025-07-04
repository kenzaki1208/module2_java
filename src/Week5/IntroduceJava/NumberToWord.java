package Week5.IntroduceJava;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number you need to read: ");
        int number = scanner.nextInt();

        int hundred = number / 100;
        int ten = (number % 100) / 10;
        int unit = number % 10;

        if (number < 0 || number >= 1000) {
            System.out.print("Out of ability!");
        } else if (number < 10) {
            switch (unit) {
                case 0:
                    System.out.print("zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        } else if (number < 20) {
            switch (unit) {
                case 0:
                    System.out.print("Ten");
                    break;
                case 1:
                    System.out.print("Eleven");
                    break;
                case 2:
                    System.out.print("Twelve");
                    break;
                case 3:
                    System.out.print("Thirteen");
                    break;
                case 4:
                    System.out.print("Fourteen");
                    break;
                case 5:
                    System.out.print("Fifteen");
                    break;
                case 6:
                    System.out.print("Sixteen");
                    break;
                case 7:
                    System.out.print("Seventeen");
                    break;
                case 8:
                    System.out.print("Eighteen");
                    break;
                case 9:
                    System.out.print("Nineteen");
                    break;
            }
        } else if (number < 100) {
            switch (ten) {
                case 2:
                    System.out.print("Twenty" + " ");
                    break;
                case 3:
                    System.out.print("Thirty" + " ");
                    break;
                case 4:
                    System.out.print("Forty" + " ");
                    break;
                case 5:
                    System.out.print("Fifty" + " ");
                    break;
                case 6:
                    System.out.print("Sixty" + " ");
                    break;
                case 7:
                    System.out.print("Seventy" + " ");
                    break;
                case 8:
                    System.out.print("Eighty" + " ");
                    break;
                case 9:
                    System.out.print("Ninety" + " ");
                    break;
            }
            switch (unit) {
                case 0:
                    System.out.print("zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        } else {
            switch (hundred) {
                case 1:
                    System.out.print("One Hundred");
                    break;
                case 2:
                    System.out.print("Two Hundred");
                    break;
                case 3:
                    System.out.print("Three Hundred");
                    break;
                case 4:
                    System.out.print("Four Hundred");
                    break;
                case 5:
                    System.out.print("Five Hundred");
                    break;
                case 6:
                    System.out.print("Six Hundred");
                    break;
                case 7:
                    System.out.print("Seven Hundred");
                    break;
                case 8:
                    System.out.print("Eight Hundred");
                    break;
                case 9:
                    System.out.print("Nine Hundred");
                    break;
            }
            if (number % 100 >= 20 && number % 100 < 100) {
                System.out.print(" and ");
                switch (ten) {
                    case 2:
                        System.out.print("Twenty" + " ");
                        break;
                    case 3:
                        System.out.print("Thirty" + " ");
                        break;
                    case 4:
                        System.out.print("Forty" + " ");
                        break;
                    case 5:
                        System.out.print("Fifty" + " ");
                        break;
                    case 6:
                        System.out.print("Sixty" + " ");
                        break;
                    case 7:
                        System.out.print("Seventy" + " ");
                        break;
                    case 8:
                        System.out.print("Eighty" + " ");
                        break;
                    case 9:
                        System.out.print("Ninety" + " ");
                        break;
                }
                switch (unit) {
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }
            }   else if (number % 100 >= 10 && number % 100 < 20) {
                System.out.print(" and ");
                switch (unit) {
                    case 0:
                        System.out.print("Ten");
                        break;
                    case 1:
                        System.out.print("Eleven");
                        break;
                    case 2:
                        System.out.print("Twelve");
                        break;
                    case 3:
                        System.out.print("Thirteen");
                        break;
                    case 4:
                        System.out.print("Fourteen");
                        break;
                    case 5:
                        System.out.print("Fifteen");
                        break;
                    case 6:
                        System.out.print("Sixteen");
                        break;
                    case 7:
                        System.out.print("Seventeen");
                        break;
                    case 8:
                        System.out.print("Eighteen");
                        break;
                    case 9:
                        System.out.print("Nineteen");
                        break;
                }

            }   else if (number % 100 > 0 && number % 100 < 10) {
                System.out.print(" and ");
                switch (unit) {
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }
            }
//            switch (ten) {
//                case 2:
//                    System.out.print("Twenty" + " ");
//                    break;
//                case 3:
//                    System.out.print("Thirty" + " ");
//                    break;
//                case 4:
//                    System.out.print("Forty" + " ");
//                    break;
//                case 5:
//                    System.out.print("Fifty" + " ");
//                    break;
//                case 6:
//                    System.out.print("Sixty" + " ");
//                    break;
//                case 7:
//                    System.out.print("Seventy" + " ");
//                    break;
//                case 8:
//                    System.out.print("Eighty" + " ");
//                    break;
//                case 9:
//                    System.out.print("Ninety" + " ");
//                    break;
//            }
//            switch (unit) {
//                case 0:
//                    System.out.print("Ten");
//                    break;
//                case 1:
//                    System.out.print("Eleven");
//                    break;
//                case 2:
//                    System.out.print("Twelve");
//                    break;
//                case 3:
//                    System.out.print("Thirteen");
//                    break;
//                case 4:
//                    System.out.print("Fourteen");
//                    break;
//                case 5:
//                    System.out.print("Fifteen");
//                    break;
//                case 6:
//                    System.out.print("Sixteen");
//                    break;
//                case 7:
//                    System.out.print("Seventeen");
//                    break;
//                case 8:
//                    System.out.print("Eighteen");
//                    break;
//                case 9:
//                    System.out.print("Nineteen");
//                    break;
//            }
//            switch (unit) {
//                case 1:
//                    System.out.print("one");
//                    break;
//                case 2:
//                    System.out.print("two");
//                    break;
//                case 3:
//                    System.out.print("three");
//                    break;
//                case 4:
//                    System.out.print("four");
//                    break;
//                case 5:
//                    System.out.print("five");
//                    break;
//                case 6:
//                    System.out.print("six");
//                    break;
//                case 7:
//                    System.out.print("seven");
//                    break;
//                case 8:
//                    System.out.print("eight");
//                    break;
//                case 9:
//                    System.out.print("nine");
//                    break;
//            }
        }
    }
}
