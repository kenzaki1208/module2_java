package week6.inheritance.wednesday.fizzbuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String result = FizzBuzz.isFizzBuzz(number);

        if (result.equals(String.valueOf(number))) {
            int tens = number / 10;
            int unit = number % 10;
            String translated = FizzBuzzTranslate.Translate(tens, unit);
            System.out.println(translated);
        } else {
            System.out.println(result);
        }
    }
}
