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

public abstract class Device {
    private int deviceID;
    private String devicetype;
    private String brand;
    private double price;

    public Device(int deviceID, String devicetype, String brand, double price) {
        this.deviceID = deviceID;
        this.devicetype = devicetype;
        this.brand = brand;
        this.price = price;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public String getDevicetype() {
        return devicetype;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateprice();
}