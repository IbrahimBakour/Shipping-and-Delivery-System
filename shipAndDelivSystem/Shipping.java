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

public class Shipping {
    private int shippingID;
    private String shippingdate;
    private String shippingarrive;
    private String shippingstatus;
    private String shippinglocation;

    public Shipping(int shippingID, String shippingdate, String shippingarrive, String shippingstatus, String shippinglocation) {
        this.shippingID = shippingID;
        this.shippingdate = shippingdate;
        this.shippingarrive = shippingarrive;
        this.shippingstatus = shippingstatus;
        this.shippinglocation = shippinglocation;
    }

    public int getShippingID() {
        return shippingID;
    }

    public String getShippingdate() {
        return shippingdate;
    }

    public String getShippingarrive() {
        return shippingarrive;
    }

    public String getShippingstatus() {
        return shippingstatus;
    }

    public String getShippinglocation() {
        return shippinglocation;
    }
}