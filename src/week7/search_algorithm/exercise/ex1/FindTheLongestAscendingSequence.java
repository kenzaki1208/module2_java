package week7.search_algorithm.exercise.ex1;

import java.util.Scanner;

public class FindTheLongestAscendingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String longest = "";
        String current = "";

        for (int i = 0; i < input.length(); i++) {
            if (current.length() == 0 || input.charAt(i) > current.charAt(current.length() - 1)) {
                current += input.charAt(i);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + input.charAt(i);
            }
        }

        if (current.length() > longest.length()) {
            longest = current;
        }

        System.out.println("The longest ascending sequence is " + longest);
    }
}
