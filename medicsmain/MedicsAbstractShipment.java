/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicsmain;

/**
 *
 * NAME: NUR LIYANA BINTI MOHD ABDUL RAHMAN
 * MATRIC ID: CA21033
 * SECTION 2 
 * MEMBER 4-SHIPPING & DELIVERY OF MEDICAL SUPPLIES
 * 
 */

public abstract class MedicsAbstractShipment {
    private int id;
    private String description;
    private String status;

    public MedicsAbstractShipment(int id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void printDetails();
}
