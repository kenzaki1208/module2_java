package week8.io_binarytree_and_serialization.exercise.ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductManager {
    private static final String PRODUCT_FILE = "C:\\Users\\duytr\\IdeaProjects\\module2_java\\src\\week8\\io_binarytree_and_serialization\\exercise\\ex1\\product.txt";
    private List<Product> products = new ArrayList<>();

    public ProductManager() {}

    public void addProduct(Product product) {
        products.add(product);
        saveProducts();
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product searchByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void saveProducts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PRODUCT_FILE))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadProducts() {
        File file = new File(PRODUCT_FILE);
        if (!file.exists()) {
            return;
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PRODUCT_FILE))) {
            products = (List<Product>) ois.readObject();
        } catch (Exception e) {
            products = new ArrayList<>();
        }
    }

    public boolean deleteById (int id) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                saveProducts();
                return true;
            }
        }
        return false;
    }

    public boolean updateProducts (int id, String name, double price, String category, String description) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
                product.setCategory(category);
                product.setDescription(description);
                saveProducts();
                return true;
            }
        }
        return false;
    }


}
