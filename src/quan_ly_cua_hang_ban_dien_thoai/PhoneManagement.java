package quan_ly_cua_hang_ban_dien_thoai;

import Dictionary_English_and_VN.Word;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PhoneManagement {
    private static final String PHONE_MANAGEMENT_FILE = "src/quan_ly_cua_hang_ban_dien_thoai/phones.csv";
    private List<Phone> phones;

    public PhoneManagement() {
        this.phones = new ArrayList<>();
        loadFile();
    }

    public void addPhone(Phone phone) {
        this.phones.add(phone);
        saveFile();
        saveAllToCSV();
    }

    private void saveAllToCSV() {
        File file = new File("src/quan_ly_cua_hang_ban_dien_thoai/phone.csv");
        try (FileWriter writer = new FileWriter(file)) {
            writer.append("ID,Name,Price,Quantity,Manufacturer,WarrantyPeriod/WarrantyScope/PortableCountry/PortableStatus\n");
            for (Phone phone : phones) {
                writer.append(phone.toCSV()).append("\n");
            }
            System.out.println("Đã xuất file CSV: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean deletePhone(int id) {
        Scanner scanner = new Scanner(System.in);
        Iterator<Phone> iterator = phones.iterator();

        while (iterator.hasNext()) {
            Phone currentPhone = iterator.next();

            if (currentPhone.getId() == id) {
                System.out.println("Bạn có muốn xóa sản phẩm này không ?");
                String confirm = scanner.nextLine().trim();
                if (confirm.equalsIgnoreCase("Y")) {
                    iterator.remove();
                    saveFile();
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean updatePhone(int id, String name, double price, int quantity, String manufacturer) {
        for (Phone phone : phones) {
            if (phone.getId() == id) {
                phone.setName(name);
                phone.setPrice(price);
                phone.setQuantity(quantity);
                phone.setManufacturer(manufacturer);
                saveFile();
                return true;
            }
        }
        return false;
    }

    public void displayAll() {
        for (Phone phone : phones) {
            System.out.println(phone.getId() + ". " + phone.getName() + " (" + phone.getManufacturer() + "): " + phone.getPrice() + " VND");
        }
    }

    public List<Phone> getAll() {
        return phones;
    }

    public List<Phone> search(String keyWord) {
        if (keyWord == null || keyWord.trim().isEmpty()) {
            return new ArrayList<>();
        }

        List<Phone> result = new ArrayList<>();
        String lowerCase = keyWord.toLowerCase();

        for (Phone phone : phones) {
            if (phone.getName().toLowerCase().startsWith(lowerCase) ||
                    phone.getManufacturer().toLowerCase().startsWith(lowerCase)) {
                result.add(phone);
            }
        }

        return result;
    }

    public void loadFile() {
        File file = new File(PHONE_MANAGEMENT_FILE);
        if (!file.exists()) {
            phones = new ArrayList<>();
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PHONE_MANAGEMENT_FILE))) {
            phones = (List<Phone>) ois.readObject();
        } catch (IOException e) {
            System.err.println("Error reading dictionary file: " + e.getMessage());
            phones = new ArrayList<>();
        } catch (ClassNotFoundException e) {
            System.err.println("Error deserializing dictionary: " + e.getMessage());
            phones = new ArrayList<>();
        }
    }

    public void saveFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PHONE_MANAGEMENT_FILE))) {
            oos.writeObject(phones);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getMaxId() {
        int max = 0;
        for (Phone phone : phones) {
            if (phone.getId() > max) {
                max = phone.getId();
            }
        }
        return max;
    }

}
