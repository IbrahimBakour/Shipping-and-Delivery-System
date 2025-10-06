package shipanddelivsystem;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * MUHAMMAD DANIEL FIRDAUS (CB23131)
 * SECTION 2 
 * MEDICAL SUPPLIES
 * 
 */

class infotype {

    // Internal ButtonGroup to manage radio buttons
    private ButtonGroup buttonGroup;

    // Constructor to initialize the internal ButtonGroup
    public infotype() {
        buttonGroup = new ButtonGroup();
    }

    // Method to add JRadioButton to the group
    void add(JRadioButton button) {
        buttonGroup.add(button);
    }
    
}
