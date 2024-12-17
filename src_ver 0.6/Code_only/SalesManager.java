/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_only;

/**
 *
 * @author thong
 */
public class SalesManager extends User {
    public SalesManager(String id, String name) {
        super(id, name, "Sales Manager");
    }

    @Override
    public void displayMenu() {
        System.out.println("Sales Manager Menu: Manage sales targets, view reports, and analyze sales data.");
    }
}

