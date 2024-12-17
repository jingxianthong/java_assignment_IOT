/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_only;

import java.util.List; // Correct import
import java.util.ArrayList; // Correct import

public class Supplier {
    private final String supplierId; // Mark final since it's initialized once
    private final String supplierName; // Mark final
    private final List<String> suppliedItems; // Mark final to prevent reassignment

    public Supplier(String supplierId, String supplierName) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.suppliedItems = new ArrayList<>(); // Initialize correctly
    }

    // Getter for suppliedItems
    public List<String> getSuppliedItems() {
        return suppliedItems;
    }

    // Method to add an item
    public void addItem(String item) {
        suppliedItems.add(item);
    }

    // Method to remove an item
    public void removeItem(String item) {
        suppliedItems.remove(item);
    }
}
