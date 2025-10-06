/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package shipanddelivsystem;

/**
 *
 * MUHAMMAD DANIEL FIRDAUS (CB23131)
 * SECTION 2 
 * MEDICAL SUPPLIES
 * 
 */

import java.util.Scanner;

public class Shipanddelivsystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Payment payment = new Payment(1, "Credit Card", 100.0);
        Customer customer = new Customer(1, "123 Main St", "John Doe");
        
        Shipping shipping = null;
        Delivery delivery = null;
        
        Order order = new Order(1, "2023-10-27", "10:00 AM", "2023-10-28", payment, customer, shipping, delivery);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Enter Shipping Information");
            System.out.println("2. Enter Delivery Information");
            System.out.println("3. Print Shipping Information");
            System.out.println("4. Print Delivery Information");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Shipping Information:");
                    System.out.print("Enter shipping date (yyyy-mm-dd): ");
                    String shippingDate = scanner.next();
                    System.out.print("Enter shipping arrive date (yyyy-mm-dd): ");
                    String shippingArrive = scanner.next();
                    System.out.print("Enter shipping status: ");
                    String shippingStatus = scanner.next();
                    System.out.print("Enter shipping location: ");
                    String shippingLocation = scanner.next();
                    shipping = new Shipping(1, shippingDate, shippingArrive, shippingStatus, shippingLocation);
                    order.setShipping(shipping);
                    break;
                case 2:
                    System.out.println("Enter Delivery Information:");
                    System.out.print("Enter delivery date (yyyy-mm-dd): ");
                    String deliveryDate = scanner.next();
                    System.out.print("Enter delivery arrive date (yyyy-mm-dd): ");
                    String deliveryArrive = scanner.next();
                    System.out.print("Enter delivery status: ");
                    String deliveryStatus = scanner.next();
                    System.out.print("Enter delivery location: ");
                    String deliveryLocation = scanner.next();
                    delivery = new Delivery(1, deliveryDate, deliveryArrive, deliveryStatus, deliveryLocation);
                    order.setDelivery(delivery);
                    break;
                case 3:
                    if (shipping!= null) {
                        System.out.println("Shipping Information:");
                        System.out.println("Shipping Date: " + shipping.getShippingdate());
                        System.out.println("Shipping Arrive: " + shipping.getShippingarrive());
                        System.out.println("Shipping Status: " + shipping.getShippingstatus());
                        System.out.println("Shipping Location: " + shipping.getShippinglocation());
                        System.out.println("-----------------------");
                    } else {
                        System.out.println("Please enter shipping information first.");
                    }
                    break;
                case 4:
                    if (delivery!= null) {
                        System.out.println("Delivery Information:");
                        System.out.println("Delivery Date: " + delivery.getDeliverydate());
                        System.out.println("Delivery Arrive: " + delivery.getDeliveryarrive());
                        System.out.println("Delivery Status: " + delivery.getDeliverystatus());
                        System.out.println("Delivery Location: " + delivery.getDeliveylocation());
                        System.out.println("-----------------------");
                    } else {
                        System.out.println("Please enter delivery information first.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice!= 5);
    }
}

