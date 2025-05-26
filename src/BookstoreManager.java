import java.util.ArrayList;
import java.util.Scanner;

public class BookstoreManager {
    private static ArrayList<String> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n=== BookNest Inventory System ===");
        
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewInventory();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n1. Add new book");
        System.out.println("2. View inventory");
        System.out.println("3. Exit");
        System.out.print("\nEnter choice: ");
    }

    private static void addBook() {
        System.out.print("Enter book title: ");
        inventory.add(scanner.nextLine());
        System.out.println("Book added!");
    }

    private static void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("\nInventory is empty.");
            return;
        }
        System.out.println("\nCurrent Inventory:");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println((i+1) + ". \"" + inventory.get(i) + "\"");
        }
    }
}
