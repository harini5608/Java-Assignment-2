package manufacturing;

public class ProductionReport {
    private WorkOrder workOrder;
    private Warehouse warehouse;

    public ProductionReport(WorkOrder wo, Warehouse wh) {
        this.workOrder = wo;
        this.warehouse = wh;
    }

    public void reportProduction() {
        Product finished = workOrder.getBom().getFinishedProduct();
        warehouse.addProduct(finished, workOrder.getQuantityToProduce());
        workOrder.setStatus("Completed");
        System.out.println("Production completed for " + finished.getName());
    }
}
