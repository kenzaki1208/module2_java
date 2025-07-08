package Week5.ArrayAndFunctionWithJava.PracticalExercises;

import java.util.Scanner;

public class CountCharInStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Hello World";
        System.out.println(str);
        System.out.print("Enter a character: ");
        char Character = scanner.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character) {
                count++;
            }
        }

        System.out.println("Number of " + Character + " in " + str + " is " + count);
    }
}
