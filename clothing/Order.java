package clothingg;

import java.util.ArrayList;

/**
 *
 * NUR UMAIRAH ANNISA BINTI MOHMAD ASRI (CD21035)
 * SECTION 2 
 * CLOTHING
 * 
 */

public class Order {
    static int nextId = 1;
    int orderId;
    Customer customer;
    ArrayList<ClothingItem> items;
    double totalPrice;
    boolean isPaid;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
        this.isPaid = false;
        this.orderId = nextId++;
    }

    public void addItem(ClothingItem item) {
        items.add(item);
        totalPrice += item.price;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    @Override
    public String toString() {
        String paymentStatus = isPaid ? "Paid" : "Unpaid";
        return "Order ID: " + orderId + "\nCustomer: " + customer.name + "\nTotal Price: RM" + totalPrice +
                "\nPayment Status: " + paymentStatus;
    }
}

