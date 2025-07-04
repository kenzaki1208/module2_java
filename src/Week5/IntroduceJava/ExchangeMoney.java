package Week5.IntroduceJava;

import java.util.Scanner;

public class ExchangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the USD: ");

        double USD;
        USD = scanner.nextInt();

        double VND = 23000 * USD;
        System.out.printf("USD exchange to VND is: " + VND + " Đ");
    }
}
