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


public class Delivery {
    private final int deliveryID;
    private final String deliverydate;
    private final String deliveryarrive;
    private final String deliverystatus;
    private final String deliveylocation;

    public Delivery(int deliveryID, String deliverydate, String deliveryarrive, String deliverystatus, String deliveylocation) {
        this.deliveryID = deliveryID;
        this.deliverydate = deliverydate;
        this.deliveryarrive = deliveryarrive;
        this.deliverystatus = deliverystatus;
        this.deliveylocation = deliveylocation;
    }

    public int getDeliveryID() {
        return deliveryID;
    }

    public String getDeliverydate() {
        return deliverydate;
    }

    public String getDeliveryarrive() {
        return deliveryarrive;
    }

    public String getDeliverystatus() {
        return deliverystatus;
    }

    public String getDeliveylocation() {
        return deliveylocation;
    }
}