import java.util.ArrayList;

class ContactManager {
    private ArrayList<Contact> contacts;

    // Constructor
    public ContactManager() {
        contacts = new ArrayList<>();
    }

    // Add Contact
    public void addContact(String name, String phone, String email) {
        contacts.add(new Contact(name, phone, email));
        System.out.println("Contact added successfully!");
    }

    // Display All Contacts
    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }

        for (Contact c : contacts) {
            c.display();
        }
    }

    // Search Contact
    public Contact searchContact(String name) {
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    // Update Contact
    public void updateContact(String name, String newPhone, String newEmail) {
        Contact c = searchContact(name);
        if (c != null) {
            c.setPhone(newPhone);
            c.setEmail(newEmail);
            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Delete Contact
    public void deleteContact(String name) {
        Contact c = searchContact(name);
        if (c != null) {
            contacts.remove(c);
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found.");
        }
    }
}