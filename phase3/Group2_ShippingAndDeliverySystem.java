/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package group2_phase3;

import java.util.Scanner;
import project.phase.ii.PhaseII;
import medicsmain.MedicsMain;

/**
 *
 * MEMBERS NAME:
 * 1. NUR UMAIRAH ANNISA BINTI MOHMAD ASRI (CD21035)
 * 2. MUHAMMAD DANIEL FIRDAUS (CB23131)
 * 3. ALBAKKOUR EBRAHIM (CB22013)
 * 4. NUR LIYANA BINTI MOHD ABDUL RAHMAN (CA21033)
 * SECTION 2 
 * SHIPPING & DELIVERY
 * 
 */

public class Group2_ShippingAndDeliverySystem {

        public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("=============================================================");
            System.out.println("=============/////SHIPPING & DELIVERY SYSTEM/////============");
            System.out.println("=============================================================");
            System.out.println("\n WHAT WOULD YOU LIKE TO CHOOSE?\n");
            System.out.println("1. Furniture");
            System.out.println("2. Medical Supplies");
            System.out.println("3. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    PhaseII.main(args);
                    break;
                case 4:
                    MedicsMain.main(args);
                    break;
                case 5:
                    System.out.println("Exiting System...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}