package week8.contacts_management;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ContactsManagement {
    private static final String CONTACTS_FILE = "C:\\Users\\duytr\\IdeaProjects\\module2_java\\src\\week8\\contacts_management\\contact.txt";
    private List<Contacts> contactsList = new ArrayList<>();

    public ContactsManagement() {}

    public void addContact(Contacts contacts) {
        contactsList.add(contacts);
        saveContacts();
    }

    public List<Contacts> getAllContacts() {
        return contactsList;
    }

    public List<Contacts> searchByName(String keyword) {
        List<Contacts> result = new ArrayList<>();
        String lowerCaseKeyword = keyword.toLowerCase();
        for (Contacts contacts : contactsList) {
            if (contacts.getName().toLowerCase().contains(lowerCaseKeyword)) {
                result.add(contacts);
            }
        }
        return result;
    }

    public void saveContacts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CONTACTS_FILE))) {
            oos.writeObject(contactsList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadProducts() {
        File file = new File(CONTACTS_FILE);
        if (!file.exists()) {
            return;
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CONTACTS_FILE))) {
            contactsList = (List<Contacts>) ois.readObject();
        } catch (Exception e) {
            contactsList = new ArrayList<>();
        }
    }

    public boolean deleteById (String phoneNumber) {
        Scanner scanner = new Scanner(System.in);
        Iterator<Contacts> iterator = contactsList.iterator();
        while (iterator.hasNext()) {
            Contacts contact = iterator.next();
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                System.out.print("Bạn có chắc muốn xóa? (Y/N): ");
                String confirm = scanner.nextLine().trim();
                if (confirm.equalsIgnoreCase("Y")) {
                    iterator.remove();
                    saveContacts();
                    System.out.println("Đã xóa thành công!");
                    return true;
                } else {
                    System.out.println("Hủy xóa!");
                    return false;
                }
            }
        }
        System.out.println("Không tìm thấy số điện thoại cần xóa.");
        return false;
    }

    public boolean updateContacts (int id, String name, String email) {
        for (Contacts contacts : contactsList) {
            if (contacts.getId() == id) {
                contacts.setName(name);
//                contacts.setPhoneNumber(phoneNumber);
                contacts.setEmail(email);
                saveContacts();
                return true;
            }
        }
        return false;
    }
}