package manufacturing;

public class Product {
    private int id;
    private String name;
    private int stockQuantity;

    public Product(int id, String name, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.stockQuantity = stockQuantity;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getStockQuantity() { return stockQuantity; }

    public void addStock(int qty) {
        stockQuantity += qty;
    }

    public void reduceStock(int qty) {
        if (qty <= stockQuantity)
            stockQuantity -= qty;
    }

    @Override
    public String toString() {
        return name + " (Stock: " + stockQuantity + ")";
    }
}
