package minimarketinventory;

public class MinimarketInventory {

    public static void main(String[] args) {
        InventoryFrame inventoryFrame = new InventoryFrame();
        
        inventoryFrame.setVisible(true);
        
        inventoryFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                showInventoryData();
            }
        });
    }

    private static void showInventoryData() {

        System.out.println("Data of inventory:");
        System.out.println("Code\t\tMount");
        System.out.println("-----------------------");
        System.out.println("p123\t\t10");
        System.out.println("p124\t\t15");
        System.out.println("p125\t\t20");
        System.out.println("p126\t\t5");
        System.out.println("p127\t\t8");
        System.out.println("p128\t\t12");
    }
}

