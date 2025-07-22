package week7.search_algorithm.exercise.ex1;

import java.util.Scanner;

public class FindTheLongestAscendingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String longest = "";
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (current.length() == 0 || c > current.charAt(current.length() - 1)) {
                current.append(c);
            } else {
                if (current.length() > longest.length()) {
                    longest = current.toString();
                }
                current.setLength(0);
                current.append(c);
            }
        }

        if (current.length() > longest.length()) {
            longest = current.toString();
        }

        System.out.println("The longest ascending sequence is " + longest);
    }
}
