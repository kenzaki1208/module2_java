package week7.java_collection_framework.exercises.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Product List");
            System.out.println("1. Add a product");
            System.out.println("2. Edit a product");
            System.out.println("3. Delete a product");
            System.out.println("4. Display all products");
            System.out.println("5. Search a product");
            System.out.println("6. Sort products ascending price");
            System.out.println("7. Sort products descending price");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter product id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter product price: ");
                    double price = scanner.nextDouble();
                    manager.addProduct(new Product(id, name, price));
                    break;
                case 2:
                    System.out.println("Enter product id: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter product name: ");
                    String newName = scanner.nextLine();
                    System.out.println("Enter product price: ");
                    double newPrice = scanner.nextDouble();
                    manager.editProduct(editId, newName, newPrice);
                    break;
                case 3:
                    System.out.println("Enter product id: ");
                    int deleteId = scanner.nextInt();
                    manager.removeProduct(deleteId);
                    break;
                case 4:
                    manager.displayAllProduct();
                    break;
                case 5:
                    System.out.println("Enter product name: ");
                    String searchName = scanner.nextLine();
                    manager.searchByName(searchName);
                    break;
                case 6:
                    manager.sortByPriceAscending();
                    manager.displayAllProduct();
                    break;
                case 7:
                    manager.sortByPriceDescending();
                    manager.displayAllProduct();
                    break;
                case 8:
                    System.out.println("Exiting !");
                    break;
                default:
                    System.out.println("No choice");
                    break;
            }
        } while (choice != 8);
    }
}
