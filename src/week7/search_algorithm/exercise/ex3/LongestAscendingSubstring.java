package week7.search_algorithm.exercise.ex3;

import java.util.Scanner;

public class LongestAscendingSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String longest = "";
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (current.length() == 0 || input.charAt(i) >= current.charAt(current.length() - 1)) {
                current.append(input.charAt(i));
            } else {
                if (current.length() > longest.length()) {
                    longest = current.toString();
                }
                current = new StringBuilder("" + input.charAt(i));
            }
        }

        if (current.length() > longest.length()) {
            longest = current.toString();
        }

        System.out.println(longest);
    }
}
