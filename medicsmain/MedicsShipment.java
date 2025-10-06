/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package medicsmain;
import java.text.DecimalFormat;

/**
 *
 * NAME: NUR LIYANA BINTI MOHD ABDUL RAHMAN
 * MATRIC ID: CA21033
 * SECTION 2 
 * MEMBER 4-SHIPPING & DELIVERY OF MEDICAL SUPPLIES
 * 
 */

public class MedicsShipment extends MedicsAbstractShipment {
    private String senderName;
    private String senderAddress;
    private String senderPhone;
    private String receiverName;
    private String receiverAddress;
    private String receiverPhone;
    private double weight;

    public MedicsShipment(int id, String senderName, String senderAddress, String senderPhone, String receiverName, String receiverAddress, String receiverPhone, String description, double weight, String status) {
        super(id, description, status);
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderPhone = senderPhone;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
        this.receiverPhone = receiverPhone;
        this.weight = weight;
    }

    @Override
    public void printDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat idFormat = new DecimalFormat("000");
        return "\nShipment ID: M" + idFormat.format(getId()) +
                "\n\nSender's Name: " + senderName +
                "\nSender's Address: " + senderAddress +
                "\nSender's Phone: " + senderPhone +
                "\n\nReceiver's Name: " + receiverName +
                "\nReceiver's Address: " + receiverAddress +
                "\nReceiver's Phone: " + receiverPhone +
                "\n\nDescription: " + getDescription() +
                "\nWeight: " + weight + " KG" +
                "\nStatus: " + getStatus() +
                "\nShipping Cost: RM" + df.format(calculateShippingCost()) +
                "\n-------------------------------------";
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private double calculateShippingCost() {
        if (weight <= 3.0) {
            return 4.90;
        } else if (weight <= 10.0) {
            return 4.90 + (weight - 3.0) * 1.5;
        } else if (weight <= 15.0) {
            return 4.90 + 7.5 + (weight - 10.0) * 1.5;
        } else {
            return 4.90 + 7.5 + 7.5 + (weight - 15.0) * 2.0;
        }
    }
}