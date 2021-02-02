package de.neuefische.studentdb.database;

import de.neuefische.studentdb.model.Product;

import java.util.HashMap;
import java.util.List;

public class ProductDb {
    HashMap<String, Product> productHashMap = new HashMap<>();

    public List<Product> getProductList() {
        return List.copyOf(productHashMap.values());
    }

    public Product addProduct(Product product) {
        productHashMap.put(product.getId(), product);
        return product;
    }
}
