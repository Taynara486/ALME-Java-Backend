package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.list;
import model.Product;

public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getAllProduct() {
        return products;
    }
}
