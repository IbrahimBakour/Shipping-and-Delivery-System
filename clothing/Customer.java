package clothingg;

/**
 *
 * NUR UMAIRAH ANNISA BINTI MOHMAD ASRI (CD21035)
 * SECTION 2 
 * CLOTHING
 * 
 */

public class Customer {
    String name;
    String address;
    String phoneNumber;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer Name: " + name + ", Address: " + address + ", Phone Number: " + phoneNumber;
    }
}

