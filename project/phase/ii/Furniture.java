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

class Furniture extends Item {
    private String shape;

   public Furniture(int id, String name, String size, String weight, String shape) {
        super(id, name, size, weight);
        this.shape = shape;
    }

      @Override
    public String toString() {
        return "id=" + super.id + "\nname=" + super.name + "\nsize=" + super.size + "\nweight=" + super.weight + "\nshape=" + shape + "\n";
    }

    
    public String getShape() {
        return shape;
    }
}