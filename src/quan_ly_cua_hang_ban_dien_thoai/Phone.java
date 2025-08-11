package quan_ly_cua_hang_ban_dien_thoai;

import java.io.Serializable;

public abstract class Phone implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private double price;
    private int quantity;
    private String manufacturer;

    public Phone() {}

    public Phone(int id, String name, double price, int quantity, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String toCSV() {
        return id + "," + name + "," + price + "," + quantity + "," + manufacturer;
    }

    @Override
    public String toString() {
        return "Phone { id: " + id + ", name: " + name + ", price: " + price + ", quantity: " + quantity +
                ", manufacturer: " + manufacturer + " }";
    }

    public abstract String displayInfo();
}
