package minimarketinventory;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Double> inventoryMap;

    public Inventory() {
        inventoryMap = new HashMap<>();
        
        inventoryMap.put("p123", 0.0);
        inventoryMap.put("p124", 0.0);
        inventoryMap.put("p125", 0.0);
        inventoryMap.put("p126", 0.0);
        inventoryMap.put("p127", 0.0);
        inventoryMap.put("p128", 0.0);
    }

    public void addToInventory(String productCode, double amount) {
        if (inventoryMap.containsKey(productCode)) {
            double currentAmount = inventoryMap.get(productCode);
            double newAmount = currentAmount + amount;
            inventoryMap.put(productCode, newAmount);
        } else {
            inventoryMap.put(productCode, amount);
        }
    }

    public double getAmount(String productCode) {
        if (inventoryMap.containsKey(productCode)) {
            return inventoryMap.get(productCode);
        } else {
            return 0.0; 
        }
    }
}
