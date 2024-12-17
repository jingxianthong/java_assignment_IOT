/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_only;

/**
 *
 * @author thong
 */
public class FinanceManager extends User {
    public FinanceManager(String id, String name) {
        super(id, name, "Finance Manager");
    }

    @Override
    public void displayMenu() {
        System.out.println("Finance Manager Menu: Approve budgets, manage invoices, and analyze financial performance.");
    }
}    

