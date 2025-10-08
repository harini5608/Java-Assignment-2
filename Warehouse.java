package manufacturing;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<Product, Integer> stock = new HashMap<>();

    public void addProduct(Product p, int qty) {
        stock.put(p, stock.getOrDefault(p, 0) + qty);
    }

    public boolean issueMaterial(Product p, int qty) {
        int available = stock.getOrDefault(p, 0);
        if (available >= qty) {
            stock.put(p, available - qty);
            return true;
        }
        return false;
    }

    public void showStock() {
        System.out.println("\n--- Warehouse Stock ---");
        for (Product p : stock.keySet()) {
            System.out.println(p.getName() + ": " + stock.get(p));
        }
    }
}
