/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_only;

/**
 *
 * @author thong
 */
public class PurchaseManager extends User {
    public PurchaseManager(String id, String name) {
        super(id, name, "Purchase Manager");
    }

    @Override
    public void displayMenu() {
        System.out.println("Purchase Manager Menu: Approve requisitions, view supplier details, and manage orders.");
    }
}

