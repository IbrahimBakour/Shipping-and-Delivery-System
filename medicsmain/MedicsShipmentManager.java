/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package medicsmain;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * NUR LIYANA BINTI MOHD ABDUL RAHMAN (CA21033)
 * SECTION 2 
 * MEDICAL SUPPLIES
 * 
 */

public class MedicsShipmentManager implements MedicsShipmentInterface {
    private ShipmentDAO shipmentDAO = new ShipmentDAO();

    @Override
    public MedicsShipment addShipment(String senderName, String senderAddress, String senderPhone, String receiverName, String receiverAddress, String receiverPhone, String description, double weight, String status) {
        int nextId = shipmentDAO.getAllShipments().size() + 1; // Assuming IDs are sequential
        MedicsShipment shipment = new MedicsShipment(nextId, senderName, senderAddress, senderPhone, receiverName, receiverAddress, receiverPhone, description, weight, status);
        shipmentDAO.addShipment(shipment);
        System.out.println("==================================");
        System.out.println("Shipment added successfully!\n" + shipment);
        return shipment;
    }

    @Override
    public void editShipment(int id, String senderName, String senderAddress, String senderPhone, String receiverName, String receiverAddress, String receiverPhone, String description, double weight, String status) {
        String formattedId = "M" + String.format("%03d", id); // Format the ID as "M001"

        MedicsShipment shipment = shipmentDAO.getShipmentById(formattedId);

        if (shipment != null) {
            if (!senderName.isEmpty()) shipment.setSenderName(senderName);
            if (!senderAddress.isEmpty()) shipment.setSenderAddress(senderAddress);
            if (!senderPhone.isEmpty()) shipment.setSenderPhone(senderPhone);
            if (!receiverName.isEmpty()) shipment.setReceiverName(receiverName);
            if (!receiverAddress.isEmpty()) shipment.setReceiverAddress(receiverAddress);
            if (!receiverPhone.isEmpty()) shipment.setReceiverPhone(receiverPhone);
            if (!description.isEmpty()) shipment.setDescription(description);
            if (weight != -1) shipment.setWeight(weight);
            if (!status.isEmpty()) shipment.setStatus(status);

            shipmentDAO.editShipment(shipment);
            System.out.println("==================================");
            System.out.println("Shipment updated successfully!\n" + shipment);
        } else {
            System.out.println("==================================");
            System.out.println("Shipment not found with ID: " + formattedId);
        }
    }

    
    @Override
    public void deleteShipment(int id) {
        String formattedId = "M" + String.format("%03d", id); // Format the ID as "M001"

        MedicsShipment shipment = shipmentDAO.getShipmentById(formattedId);

        if (shipment != null) {
            shipmentDAO.deleteShipment(id);
            System.out.println("==================================");
            System.out.println("Shipment deleted successfully.\n" + shipment);
        } else {
            System.out.println("==================================");
            System.out.println("Shipment not found with ID: " + formattedId);
        }
    }

    @Override
    public List<MedicsShipment> getAllShipments() {
        return shipmentDAO.getAllShipments();
    }
}