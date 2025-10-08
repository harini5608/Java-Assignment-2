package manufacturing;

import java.util.ArrayList;
import java.util.List;

public class BOM {
    private Product finishedProduct;
    private List<BOMItem> items;

    public BOM(Product finishedProduct) {
        this.finishedProduct = finishedProduct;
        this.items = new ArrayList<>();
    }

    public void addItem(BOMItem item) {
        items.add(item);
    }

    public Product getFinishedProduct() { return finishedProduct; }
    public List<BOMItem> getItems() { return items; }
}
