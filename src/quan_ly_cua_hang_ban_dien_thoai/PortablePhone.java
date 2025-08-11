package quan_ly_cua_hang_ban_dien_thoai;

public class PortablePhone extends Phone{
    private String portableCountry;
    private String portableStatus;

    public PortablePhone() {}

    public PortablePhone(int id, String name, double price, int quantity, String manufacturer, String portableCountry, String portableStatus) {
        super(id, name, price, quantity, manufacturer);
        this.portableCountry = portableCountry;
        this.portableStatus = portableStatus;
    }

    public String getPortableCountry() {
        return portableCountry;
    }

    public void setPortableCountry(String portableCountry) {
        this.portableCountry = portableCountry;
    }

    public String getPortableStatus() {
        return portableStatus;
    }

    public void setPortableStatus(String portableStatus) {
        this.portableStatus = portableStatus;
    }

    @Override
    public String displayInfo() {
        return "Phone { id: " + getId() + ", name: " + getName() + ", price: " + getPrice() + ", quantity: " + getQuantity() +
                ", manufacturer: " + getManufacturer() + ", portable country: " + portableCountry + ", portable status: " + portableStatus + " }";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + portableCountry + "," + portableStatus;
    }
}
