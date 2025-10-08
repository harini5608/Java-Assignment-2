package manufacturing;

public class WorkOrder {
    private int id;
    private BOM bom;
    private String status; 
    private int quantityToProduce;

    public WorkOrder(int id, BOM bom, int qty) {
        this.id = id;
        this.bom = bom;
        this.quantityToProduce = qty;
        this.status = "Created";
    }

    public int getId() { return id; }
    public BOM getBom() { return bom; }
    public String getStatus() { return status; }
    public void setStatus(String s) { this.status = s; }

    public int getQuantityToProduce() { return quantityToProduce; }

    @Override
    public String toString() {
        return "WorkOrder #" + id + " | Product: " + bom.getFinishedProduct().getName() + 
               " | Qty: " + quantityToProduce + " | Status: " + status;
    }
}
