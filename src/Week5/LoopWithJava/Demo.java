package Week5.LoopWithJava;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("----- MENU -----");
        int choice;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1. Tìm số nguyên tố");
            System.out.println("2. Tìm UCLN");
            System.out.println("0. Thoat");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    int n;
                    System.out.print("Nhập 1 số bất kỳ: ");
                    n = input.nextInt();
                    boolean isPrime = true;
                    if (n <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(n); i++) {
                            if (n % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        System.out.println(n + " Là số nguyên tố");
                    } else {
                        System.out.println(n + " Ko phải là số nguyên tố");
                    }
                    break;
                case 2:
                    int a;
                    int b;
                    System.out.print("Nhập số thứ nhất: ");
                    a = input.nextInt();
                    System.out.print("Nhập số thứ hai: ");
                    b = input.nextInt();

                    while (b != 0) {
                        int temp = b;
                        b = a % b;
                        a = temp;
                    }
                    System.out.println("UCLN của 2 số là: " + a);
                    break;
                case 0:
                    System.out.print("Thoát chương trình !");
                    break;
            }
        } while (choice != 0);
    }
}
