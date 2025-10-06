/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medicsmain;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * NAME: NUR LIYANA BINTI MOHD ABDUL RAHMAN
 * MATRIC ID: CA21033
 * SECTION 2 
 * MEMBER 4-SHIPPING & DELIVERY OF MEDICAL SUPPLIES
 * 
 */

public class MedicsMain {
    private MedicsShipmentManager manager = new MedicsShipmentManager();

    public static void main(String[] args) {
        MedicsMain mainApp = new MedicsMain();
        mainApp.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=======MEDICAL SUPPLIES SHIPPING & DELIVERY=======");
            System.out.println("\n1. Add shipment");
            System.out.println("2. Edit shipment");
            System.out.println("3. Delete shipment");
            System.out.println("4. View all shipments");
            System.out.println("5. Exit");
            System.out.println("\nChoose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("\n=======ADD SHIPMENT=======");
                    addShipment(scanner);
                    break;
                case 2:
                    System.out.println("\n=======EDIT SHIPMENT=======");
                    editShipment(scanner);
                    break;
                case 3:
                    System.out.println("\n=======DELETE SHIPMENT=======");
                    deleteShipment(scanner);
                    break;
                case 4:
                    System.out.println("\n=======SHIPMENT SUMMARY=======");
                    viewAllShipments();
                    break;
                case 5:
                    System.out.println("\nExiting program...");
                    return; // Exiting the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addShipment(Scanner scanner) {
        System.out.print("Enter sender's name: ");
        String senderName = scanner.nextLine();
        System.out.print("Enter sender's address: ");
        String senderAddress = scanner.nextLine();
        System.out.print("Enter sender's phone number: ");
        String senderPhone = scanner.nextLine();
        System.out.print("Enter receiver's name: ");
        String receiverName = scanner.nextLine();
        System.out.print("Enter receiver's address: ");
        String receiverAddress = scanner.nextLine();
        System.out.print("Enter receiver's phone number: ");
        String receiverPhone = scanner.nextLine();

        System.out.print("\nEnter medical supply description: ");
        String description = scanner.nextLine();
        System.out.print("Enter weight in KG (Eg: 1.00): ");
        double weight = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        String status = chooseStatus(scanner, false);

        manager.addShipment(senderName, senderAddress, senderPhone, receiverName, receiverAddress, receiverPhone, description, weight, status);
    }

    private void editShipment(Scanner scanner) {
        System.out.print("Enter shipment ID to edit (e.g., M001): ");
        String idInput = scanner.nextLine();

        // Extract numeric ID from input
        int id;
        try {
            id = Integer.parseInt(idInput.substring(1)); // Remove 'M' and parse to int
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println("Invalid input format. Please enter in the format M001.");
            return;
        }

        System.out.print("Enter sender's name (leave blank to skip): ");
        String senderName = scanner.nextLine();
        System.out.print("Enter sender's address (leave blank to skip): ");
        String senderAddress = scanner.nextLine();
        System.out.print("Enter sender's phone number (leave blank to skip): ");
        String senderPhone = scanner.nextLine();
        System.out.print("Enter receiver's name (leave blank to skip): ");
        String receiverName = scanner.nextLine();
        System.out.print("Enter receiver's address (leave blank to skip): ");
        String receiverAddress = scanner.nextLine();
        System.out.print("Enter receiver's phone number (leave blank to skip): ");
        String receiverPhone = scanner.nextLine();

        System.out.print("\nEnter medical supply description (leave blank to skip): ");
        String description = scanner.nextLine();
        System.out.print("Enter weight in KG (leave blank to skip): ");
        String weightInput = scanner.nextLine();
        double weight = weightInput.isEmpty() ? -1 : Double.parseDouble(weightInput);

        String status = chooseStatus(scanner, true);

        manager.editShipment(id, senderName, senderAddress, senderPhone, receiverName, receiverAddress, receiverPhone, description, weight, status);
    }
    
    private void deleteShipment(Scanner scanner) {
        System.out.print("Enter shipment ID to delete (e.g., M001): ");
        String idInput = scanner.nextLine();

        // Extract numeric ID from input
        int id;
        try {
            id = Integer.parseInt(idInput.substring(1)); // Remove 'M' and parse to int
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println("Invalid input format. Please enter in the format M001.");
            return;
        }

        // Proceed with deleting shipment
        manager.deleteShipment(id);
    }

    private void viewAllShipments() {
        manager.getAllShipments();
    }

    private String chooseStatus(Scanner scanner, boolean isEditing) {
        System.out.println("\nChoose shipment status:");
        System.out.println("1. Pending");
        System.out.println("2. Shipped");
        System.out.println("3. Delivered");

        System.out.print("Enter choice (1-3): ");
        String statusChoice = scanner.nextLine();

        switch (statusChoice) {
            case "1":
                return "Pending";
            case "2":
                return "Shipped";
            case "3":
                return "Delivered";
            default:
                System.out.println("Invalid choice. Keeping current status.");
                return "";
        }
    }
}