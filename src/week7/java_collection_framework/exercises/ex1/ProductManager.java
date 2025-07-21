package week7.java_collection_framework.exercises.ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private final List<Product> productList = new ArrayList<>();

    public ProductManager() {}

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(int id) {
        productList.removeIf(product -> product.getId() == id);
    }

    public void editProduct(int id, String newName, double newPrice) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                return;
            }
        }
        System.out.println("No product founed with id: " + id);
    }

    public void displayAllProduct() {
        if (productList.isEmpty()) {
            System.out.println("No product found !");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No product found with name: " + name);
        }
    }

    public void sortByPriceAscending() {
        productList.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void sortByPriceDescending() {
        productList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }
}
