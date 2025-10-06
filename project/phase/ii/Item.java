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

// Item class
class Item {
    int id;
    String name;
    String size;
    String weight;

       public Item(int id, String name, String size, String weight) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getWeight() {
        return weight;
    }
}
