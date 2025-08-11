package quan_ly_cua_hang_ban_dien_thoai;

public class GenuinePhone extends Phone {
    private int warrantyPeriod;
    private String warrantyScope;

    public GenuinePhone() {}

    public GenuinePhone(int id, String name, double price, int quantity, String manufacturer, int warrantyPeriod, String warrantyScope) {
        super(id, name, price, quantity, manufacturer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyScope = warrantyScope;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyScope() {
        return warrantyScope;
    }

    public void setWarrantyScope(String warrantyScope) {
        this.warrantyScope = warrantyScope;
    }

    @Override
    public String displayInfo() {
        return "Phone { id: " + getId() + ", name: " + getName() + ", price: " + getPrice() + ", quantity: " + getQuantity() +
                ", manufacturer: " + getManufacturer() + ", warranty period: " + warrantyPeriod + " month, warranty scope: " + warrantyScope + " }";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + warrantyPeriod + "," + warrantyScope;
    }
}
