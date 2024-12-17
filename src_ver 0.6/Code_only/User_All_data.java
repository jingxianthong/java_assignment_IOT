package Code_only;

public class User_All_data {

    public static class SalesManager extends User {
        public SalesManager(String id, String name) {
            super(id, name, "Sales Manager");
        }

        @Override
        public void displayMenu() {
            System.out.println("Sales Manager Menu: Manage sales targets, view reports, and analyze sales data.");
        }
    }

    public static class PurchaseManager extends User {
        public PurchaseManager(String id, String name) {
            super(id, name, "Purchase Manager");
        }

        @Override
        public void displayMenu() {
            System.out.println("Purchase Manager Menu: Approve requisitions, view supplier details, and manage orders.");
        }
    }

    public static class InventoryManager extends User {
        public InventoryManager(String id, String name) {
            super(id, name, "Inventory Manager");
        }

        @Override
        public void displayMenu() {
            System.out.println("Inventory Manager Menu: Manage stock levels, view inventory reports, and track shipments.");
        }
    }

    public static class FinanceManager extends User {
        public FinanceManager(String id, String name) {
            super(id, name, "Finance Manager");
        }

        @Override
        public void displayMenu() {
            System.out.println("Finance Manager Menu: Approve budgets, manage invoices, and analyze financial performance.");
        }
    }

    public static class Administrator extends User {
        public Administrator(String id, String name) {
            super(id, name, "Administrator");
        }

        @Override
        public void displayMenu() {
            System.out.println("Administrator Menu: Manage user accounts, configure system settings, and monitor activities.");
        }
    }
}
