package week9.behavioral_design_pattern.practice.p3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinObserver(subject);
        new HexObserver(subject);
        new OctObserver(subject);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            subject.setState(scanner.nextInt());
            System.out.println();
        }
    }
}
