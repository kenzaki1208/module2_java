package week8.io_binarytree_and_serialization.exercise.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManager manager = new ProductManager();
        int choice = 0;
        do {
            System.out.println("Product Management:");
            System.out.println("1. Add product");
            System.out.println("2. Display all products");
            System.out.println("3. Delete product");
            System.out.println("4. Update product");
            System.out.println("5. Search product");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter product name: ");
                    String name = input.nextLine();
                    System.out.println("Enter product price: ");
                    double price = input.nextDouble();
                    input.nextLine();
                    System.out.println("Enter product category: ");
                    String category = input.nextLine();
                    System.out.println("Enter product description: ");
                    String description = input.nextLine();

                    Product product = new Product(manager.getAllProducts().size() + 1, name, price, category, description);
                    manager.addProduct(product);
                    System.out.println("Product added successfully !");
                    break;
                case 2:
                    for (Product p : manager.getAllProducts()) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Enter product id to delete: ");
                    int deleteId = input.nextInt();
                    input.nextLine();
                    if (manager.deleteById(deleteId)) {
                        System.out.println("Product deleted successfully !");
                    } else {
                        System.out.println("Product not found !");
                    }
                    break;
                case 4:
                    System.out.println("Enter product id to update: ");
                    int updateId = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter new product name: ");
                    String newName = input.nextLine();
                    System.out.println("Enter new product price: ");
                    double newPrice = input.nextDouble();
                    System.out.println("Enter new product category: ");
                    String newCategory = input.nextLine();
                    System.out.println("Enter new product description: ");
                    String newDescription = input.nextLine();

                    if (manager.updateProducts(updateId, newName, newPrice, newCategory, newDescription)) {
                        System.out.println("Product updated successfully !");
                    } else {
                        System.out.println("Product not found !");
                    }
                    break;
                case 5:
                    System.out.println("Enter product name to search: ");
                    String searchName = input.nextLine();
                    Product foundProduct = manager.searchByName(searchName);
                    System.out.println(foundProduct != null ? foundProduct : "Product not found !");
                    break;
                case 0:
                    System.out.println("Exiting !");
                    break;
                default:
                    System.out.println("No choice");
                    break;
            }
        } while (choice != 0);
    }
}
