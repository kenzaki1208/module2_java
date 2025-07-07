package Week5.ArrayAndFunctionWithJava;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"christian", "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is " + i);
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("Student " + name + " is not exist!");
        }
    }
}
