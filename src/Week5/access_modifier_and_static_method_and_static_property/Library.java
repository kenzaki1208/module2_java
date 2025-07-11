package Week5.access_modifier_and_static_method_and_static_property;

import java.util.Scanner;

public class Library {
    static void displayTotalBooks() {
        System.out.println("Total books: " + Book.getTotalBooks());
    }

    void createBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book Isbn: ");
        String isbn = scanner.nextLine();
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.displayTotalBooks();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Create a book");
            System.out.println("2. Display total books");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    lib.createBook();
                    break;
                case 2:
                    lib.displayTotalBooks();
                    break;
                case 9:
                    System.out.println("Exiting !");
                    break;
                default:
                    System.out.println("No choice");
                    break;
            }
        } while (choice != 9);
    }
}
