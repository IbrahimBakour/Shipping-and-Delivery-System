package clothingg;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * NUR UMAIRAH ANNISA BINTI MOHMAD ASRI (CD21035)
 * SECTION 2 
 * CLOTHING
 * 
 */

public class clothing {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Order> orders = new ArrayList<>();

            OUTER:
            while (true) {
                System.out.println("---------------------------");
                System.out.println("CLOTHING DELIVERY SYSTEM");
                System.out.println("---------------------------");
                System.out.println("[1] Place New Order");
                System.out.println("[2] List Orders");
                System.out.println("[3] Total Sales");
                System.out.println("[4] Process Payment");
                System.out.println("[0] ------EXIT------ ");
                System.out.print("Choose your option: ");

                int option;
                try {
                    option = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next();  // Clear the invalid input
                    continue;
                }
                input.nextLine();  // Clear the buffer

                // Option for clothing Delivery System
                switch (option) {
                    case 1:
                        placeOrder(input, orders);
                        break;
                    case 2:
                        if (orders.isEmpty()) {
                            System.out.println("No orders placed yet.");
                        } else {
                            listOrders(orders);
                        }
                        break;
                    case 3:
                        displayTotalSales(orders);
                        break;
                    case 4:
                        processPayment(input, orders);
                        break;
                    case 0:
                        break OUTER;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        }
    }

    private static void placeOrder(Scanner input, ArrayList<Order> orders) {
        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();
        System.out.print("Enter customer address: ");
        String customerAddress = input.nextLine();
        System.out.print("Enter customer phone number: ");
        String customerPhoneNumber = input.nextLine();

        Customer customer = new Customer(customerName, customerAddress, customerPhoneNumber);
        Order order = new Order(customer);

        while (true) {
            double totalPrice = 0.0;
            System.out.print("Enter the name of the clothing item (or type 'done' to finish adding items): ");
            String itemName = input.nextLine();
            if (itemName.equalsIgnoreCase("done")) {
                break;
            }
            System.out.print("Enter the size of the clothing item: ");
            String size = input.nextLine();
            System.out.print("Enter the price of the clothing item: ");
            double price;
            try {
                price = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for price. Please enter a number.");
                input.next();  // Clear the invalid input
                continue;
            }
            input.nextLine();  // Clear the buffer

            ClothingItem clothingItem = new ClothingItem(itemName, size, price, customer);
            order.addItem(clothingItem);
        }

        orders.add(order);
        System.out.println("Order placed successfully! Order ID: " + order.orderId);
    }

    private static void listOrders(ArrayList<Order> orders) {
        System.out.println("\nList of orders:");
        orders.forEach(System.out::println);
    }

    private static void displayTotalSales(ArrayList<Order> orders) {
        double totalSales = 0.0;
        for (Order order : orders) {
            totalSales += order.totalPrice;
        }
        System.out.println("Total Sales: RM" + totalSales);
    }

    private static void processPayment(Scanner input, ArrayList<Order> orders) {
        System.out.println("\nOrders to Process Payment:");
        for (Order order : orders) {
            if (!order.isPaid) {
                System.out.println(order);
            }
        }

        System.out.print("\nEnter the ID of the order you want to process payment for: ");
        int orderId;
        try {
            orderId = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input for order ID. Please enter a number.");
            input.next();  // Clear the invalid input
            return;
        }
        input.nextLine();  // Clear the buffer

        boolean found = false;
        for (Order order : orders) {
            if (order.orderId == orderId) {
                if (!order.isPaid) {
                    order.setPaid(true);
                    System.out.println("Payment for order ID " + orderId + " completed.");
                } else {
                    System.out.println("Order ID " + orderId + " is already paid.");
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Order ID " + orderId + " not found.");
        }
    }
}

