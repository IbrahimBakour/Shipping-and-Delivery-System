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

public class Payment {
    private int paymentID;
    private String payment_type;
    private double amount;

    public Payment(int paymentID, String payment_type, double amount) {
        this.paymentID = paymentID;
        this.payment_type = payment_type;
        this.amount = amount;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public double getAmount() {
        return amount;
    }

    public void add() {
        // Implement logic for adding payment
    }

    public void update() {
        // Implement logic for updating payment
    }
}