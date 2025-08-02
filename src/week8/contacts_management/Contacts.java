package week8.contacts_management;

import java.io.Serializable;

public class Contacts implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String phoneNumber;
    private String name;
    private String email;

    public Contacts() {}

    public Contacts(int id, String phoneNumber, String name, String email) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contacts { id: " + id + ", phoneNumber: " + phoneNumber + ", name: " + name + ", email: " + email + " }";
    }
}
