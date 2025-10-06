/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package project.phase.ii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * ALBAKKOUR EBRAHIM (CB22013)
 * SECTION 2 
 * MEDICAL SUPPLIES
 * 
 */

public class PhaseII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a list of items for shipment
        List<Item> itemsForShipment = new ArrayList<>();

        // Ask the user how many items they want to add
        System.out.print("Enter the number of items you want to add: ");
        int numberOfItems = scanner.nextInt();

        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Enter details for item " + (i + 1) + ": ");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Size: ");
            String size = scanner.nextLine();

            System.out.print("Weight: ");
            String weight = scanner.nextLine();
            scanner.nextLine();  // Consume newline character

            System.out.print("Is this item a furniture? (yes/no): ");
            String isFurniture = scanner.nextLine();

            if (isFurniture.equalsIgnoreCase("yes")) {
                System.out.print("Shape: ");
                String shape = scanner.nextLine();
                itemsForShipment.add(new Furniture(id, name, size, weight, shape));
            } else {
                itemsForShipment.add(new Item(id, name, size, weight));
            }
        }

        // Create a shipping service
        ShippingService shippingService = new ShippingService();

        // Create a shipment
        Shippment shipment = shippingService.createShipment(itemsForShipment);
        System.out.println("Shipment created with ID: " + shipment.getShipmentId());
        System.out.println("Status: " + shipment.getStatus());

        // List all shipments
        List<Shippment> shipments = shippingService.getShipmentList();
        System.out.println("Total shipments: " + shipments.size());

        // Update shipment status
        System.out.print("Enter new status for shipment ID " + shipment.getShipmentId() + ": ");
        String newStatus = scanner.nextLine();
        shippingService.updateShipmentStatus(shipment.getShipmentId(), newStatus);
        System.out.println("Updated status for shipment ID " + shipment.getShipmentId() + ": " + shipment.getStatus());

        scanner.close();
    }
}
