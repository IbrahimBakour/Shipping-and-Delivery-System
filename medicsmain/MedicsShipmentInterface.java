/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicsmain;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * NAME: NUR LIYANA BINTI MOHD ABDUL RAHMAN
 * MATRIC ID: CA21033
 * SECTION 2 
 * MEMBER 4-SHIPPING & DELIVERY OF MEDICAL SUPPLIES
 * 
 */

public interface MedicsShipmentInterface {
    MedicsShipment addShipment(String senderName, String senderAddress, String senderPhone, String receiverName, String receiverAddress, String receiverPhone, String description, double weight, String status);
    void editShipment(int id, String senderName, String senderAddress, String senderPhone, String receiverName, String receiverAddress, String receiverPhone, String description, double weight, String status);
    void deleteShipment(int id);
    List<MedicsShipment> getAllShipments();
}