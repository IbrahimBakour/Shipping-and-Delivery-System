/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.phase.ii;

/**
 *
 * ALBAKKOUR EBRAHIM (CB22013)
 * SECTION 2 
 * MEDICAL SUPPLIES
 * 
 */

import java.util.ArrayList;
import java.util.List;

class ShippingService {
    private List<Shippment> shipmentList;

    public ShippingService() {
        this.shipmentList = new ArrayList<>();
    }

    public Shippment createShipment(List<Item> items) {
        int shipmentId = shipmentList.size() + 1;
        Shippment shipment = new Shippment(shipmentId, items, "Pending");
        shipmentList.add(shipment);
        return shipment;
    }

    public List<Shippment> getShipmentList() {
        return shipmentList;
    }

    public void updateShipmentStatus(int shipmentId, String status) {
        for (Shippment shipment : shipmentList) {
            if (shipment.getShipmentId() == shipmentId) {
                shipment.setStatus(status);
                break;
            }
        }
    }
}
