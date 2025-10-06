/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shipanddelivsystem;

/**
 *
 * MUHAMMAD DANIEL FIRDAUS (CB23131)
 * SECTION 2 
 * MEDICAL SUPPLIES
 * 
 */

public class Customer {
    private int customerID;
    private String address;
    private String custtomername;

    public Customer(int customerID, String address, String custtomername) {
        this.customerID = customerID;
        this.address = address;
        this.custtomername = custtomername;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getAddress() {
        return address;
    }

    public String getCusttomername() {
        return custtomername;
    }

    public int getorderID() {
        // Implement logic for getting order ID
        return 0;
    }

    public String getPaymenttype() {
        // Implement logic for getting payment type
        return "";
    }

    public double getTotalpeyment() {
        // Implement logic for calculating total payment
        return 0.0;
    }
}
