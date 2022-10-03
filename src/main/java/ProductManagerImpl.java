import models.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManagerImpl implements ProductManager {

    @Override
    public List<Product> productsByPrice() {
        List<Product> list = new ArrayList<>(this.products);
        list.sort((Product p1, Product p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        list.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
        return list;
    }
}
