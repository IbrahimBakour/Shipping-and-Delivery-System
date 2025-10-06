package clothingg;

/**
 *
 * NUR UMAIRAH ANNISA BINTI MOHMAD ASRI (CD21035)
 * SECTION 2 
 * CLOTHING
 * 
 */

public class ClothingItem {
    static int nextId = 1;
    String name;
    String size;
    double price;
    Customer customer;
    boolean isPaid;
    int id;

    public ClothingItem(String name, String size, double price, Customer customer) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.customer = customer;
        this.isPaid = false;
        this.id = nextId++;
    }

    @Override
    public String toString() {
        String paymentStatus = isPaid ? "Paid" : "Unpaid";
        return "Clothing Item: " + name + " (Size: " + size + ") - RM" + price + "\n" + customer + "\nPayment Status: " + paymentStatus;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}

