/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.phase.ii;

import java.util.List;

/**
 *
 * ALBAKKOUR EBRAHIM (CB22013)
 * SECTION 2 
 * MEDICAL SUPPLIES
 * 
 */

class Shippment {
    private int shipmentId;
    private List<Item> items;
    private String status;

    public Shippment(int shipmentId, List<Item> items, String status) {
        this.shipmentId = shipmentId;
        this.items = items;
        this.status = status;
    }

    public int getShipmentId() {
        return shipmentId;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
