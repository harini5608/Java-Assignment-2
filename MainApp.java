package manufacturing;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Warehouse warehouse = new Warehouse();

    
        Product bolt = new Product(1, "Bolt", 100);
        Product nut = new Product(2, "Nut", 100);
        Product chair = new Product(3, "Chair", 0);

        warehouse.addProduct(bolt, 100);
        warehouse.addProduct(nut, 100);

    
        BOM chairBOM = new BOM(chair);
        chairBOM.addItem(new BOMItem(bolt, 2));
        chairBOM.addItem(new BOMItem(nut, 4));

        WorkOrder wo = new WorkOrder(1, chairBOM, 10);

        int choice;
        do {
            System.out.println("\n--- Manufacturing Menu ---");
            System.out.println("1. Show Work Order");
            System.out.println("2. Issue Materials");
            System.out.println("3. Report Production");
            System.out.println("4. Show Stock");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(wo);
                    break;
                case 2:
                    new MaterialIssue(wo, warehouse).issueMaterials();
                    break;
                case 3:
                    new ProductionReport(wo, warehouse).reportProduction();
                    break;
                case 4:
                    warehouse.showStock();
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}
