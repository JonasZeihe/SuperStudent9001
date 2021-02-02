package de.neuefische.studentdb.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private int id;
    private final List<Product> orderedProducts = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public Product addProduct(Product product) {
        orderedProducts.add(product);
        return product;
    }

    public  Product removeProduct(Product product) {
        orderedProducts.remove(product);
        return  product;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(orderedProducts, order.orderedProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderedProducts);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderedProducts=" + orderedProducts +
                '}';
    }
}
