import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        while (true) {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    manager.addContact(name, phone, email);
                    break;

                case 2:
                    manager.displayAllContacts();
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    name = sc.nextLine();
                    Contact c = manager.searchContact(name);
                    if (c != null) {
                        c.display();
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Name to Update: ");
                    name = sc.nextLine();
                    System.out.print("Enter New Phone: ");
                    phone = sc.nextLine();
                    System.out.print("Enter New Email: ");
                    email = sc.nextLine();

                    manager.updateContact(name, phone, email);
                    break;

                case 5:
                    System.out.print("Enter Name to Delete: ");
                    name = sc.nextLine();
                    manager.deleteContact(name);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}