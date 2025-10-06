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

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private String orderdate;
    private String ordertime;
    private String deliveryestimationtime;
    private List<Device> devices = new ArrayList<>();
    private Payment payment;
    private Customer customer;
    private Shipping shipping;
    private Delivery delivery;

    public Order(int orderID, String orderdate, String ordertime, String deliveryestimationtime, Payment payment, Customer customer, Shipping shipping, Delivery delivery) {
        this.orderID = orderID;
        this.orderdate = orderdate;
        this.ordertime = ordertime;
        this.deliveryestimationtime = deliveryestimationtime;
        this.payment = payment;
        this.customer = customer;
        this.shipping = shipping;
        this.delivery = delivery;
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public int getOrderID() {
        return orderID;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public String getOrdertime() {
        return ordertime;
    }

    public String getDeliveryestimationtime() {
        return deliveryestimationtime;
    }

    public Payment getPayment() {
        return payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void processpayment() {
        // Implement logic for processing payment
    }

    public void getdeliveryestimationtime() {
        // Implement logic for getting delivery estimation time
    }
    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }
     public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
}
