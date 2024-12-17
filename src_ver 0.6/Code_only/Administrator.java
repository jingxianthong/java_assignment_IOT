/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_only;

/**
 *
 * @author thong
 */
public class Administrator extends User {
    public Administrator(String id, String name) {
        super(id, name, "Administrator");
    }

    @Override
    public void displayMenu() {
        System.out.println("Administrator Menu: Manage user accounts, configure system settings, and monitor activities.");
    }
}