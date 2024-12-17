/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_only;

/**
 *
 * @author thong
 */
public class InventoryManager extends User {
 public InventoryManager(String id, String name) {
     super(id, name, "Inventory Manager");
 }

 @Override
 public void displayMenu() {
     System.out.println("Inventory Manager Menu: Manage stock levels, view inventory reports, and track shipments.");
 }
} 
