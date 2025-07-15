package week6.inheritance.tuesday2.demo;

public class main {
    private static final int ROLE_ADMIN = 1;
    private static final int ROLE_USER = 2;
    private static final int ROLE_GUEST = 3;

    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        loop(0, 10);

        loop(10, 20);

        loop(20, 30);

        loop(30, 40);

        loop(40, 100);

        int role = 1;
        if (role == ROLE_ADMIN) {
            System.out.println("Bạn có quyền truy cập quản trị.");
        } else if (role == ROLE_USER) {
            System.out.println("Bạn có quyền tru cập người dùng.");
        } else if (role == ROLE_GUEST) {
            System.out.println("Ban có quyền truy cập khách.");
        } else {
            System.out.println("Bạn ko có quyền truy cập");
        }
    }

    private static void loop(int start, int end) {
        for (int i = start; i < end; i++) {
            boolean isEven = i % 2 == 0;
            if (isEven) {
                System.out.println("Even number: " + i);
            } else {
                System.out.println("Odd number: " + i);
            }
        }
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
