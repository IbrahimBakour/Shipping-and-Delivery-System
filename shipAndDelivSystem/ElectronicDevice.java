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

public class ElectronicDevice extends Device {
    public ElectronicDevice(int deviceID, String devicetype, String brand, double price) {
        super(deviceID, devicetype, brand, price);
    }

    @Override
    public double calculateprice() {
        // Implement logic for calculating price of electronic device
        return 0.0;
    }
}