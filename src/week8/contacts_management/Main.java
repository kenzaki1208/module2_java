package week8.contacts_management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactsManagement manager = new ContactsManagement();
        int choice;

        System.out.println("===== MENU =====");
        System.out.println("1. Display All contact");
        System.out.println("2. Add contact");
        System.out.println("3. Update contact");
        System.out.println("4. Delete contact");
        System.out.println("5. Search contact");
        System.out.println("0. Exit");
        System.out.println("================");
        do {
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    for (Contacts c : manager.getAllContacts()) {
                        System.out.println(c);
                    }
                    break;
                case 2:
                    System.out.println("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Enter email: ");
                    String email = scanner.nextLine();

                    Contacts contacts = new Contacts(manager.getAllContacts().size() + 1, phoneNumber, name, email);
                    manager.addContact(contacts);
                    System.out.println("Contact added successfully !");
                    break;
                case 3:
                    System.out.println("Enter contact id to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter new contact name: ");
                    String newName = scanner.nextLine();
//                    System.out.println("Enter new phone number: ");
//                    String newPhoneNumber = scanner.nextLine();
                    System.out.println("Enter new email: ");
                    String newEmail = scanner.nextLine();

                    if (manager.updateContacts(updateId, newName, newEmail)) {
                        System.out.println("Contact updated successfully !");
                    } else {
                        System.out.println("Contact not found !");
                    }
                    break;
                case 4:
                    System.out.println("Enter contact id to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();

                    if (manager.deleteById(deleteId)) {
                        System.out.println("Contact deleted successfully !");
                    } else {
                        System.out.println("Contact not found !");
                    }
                    break;
                case 5:
                    System.out.println("Enter contact name to search: ");
                    String searchName = scanner.nextLine();
                    Contacts foundContact = manager.searchByName(searchName);
                    System.out.println(foundContact != null ? foundContact : "Contact not found !");
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
