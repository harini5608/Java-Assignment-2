package manufacturing;

public class MaterialIssue {
    private WorkOrder workOrder;
    private Warehouse warehouse;

    public MaterialIssue(WorkOrder wo, Warehouse wh) {
        this.workOrder = wo;
        this.warehouse = wh;
    }

    public void issueMaterials() {
        for (BOMItem item : workOrder.getBom().getItems()) {
            int totalQty = item.getQuantityRequired() * workOrder.getQuantityToProduce();
            boolean issued = warehouse.issueMaterial(item.getComponent(), totalQty);
            if (issued) {
                System.out.println("Issued " + totalQty + " of " + item.getComponent().getName());
            } else {
                System.out.println("Not enough stock for " + item.getComponent().getName());
            }
        }
        workOrder.setStatus("Issued");
    }
}
